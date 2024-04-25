package es.ies.puerto.modelo.db;

import es.ies.puerto.exeption.SuperheroeException;
import es.ies.puerto.modelo.db.abstractas.OperacionesAbstract;
import es.ies.puerto.modelo.db.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.entities.Alias;
import es.ies.puerto.modelo.entities.Poder;
import es.ies.puerto.modelo.entities.Superheroe;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class OperacionesBd extends OperacionesAbstract implements ICrudOperaciones {

    public OperacionesBd() throws SuperheroeException {
    }

    @Override
    public Set<Superheroe> obtener(String sql) throws SuperheroeException {
        Set<Superheroe> heroCharacters = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(sql);
            heroCharacters = new HashSet<>();
            while (rs.next()) {
                heroCharacters.add(construirSuperheroe(rs));
            }
        } catch (Exception e) {
            throw new SuperheroeException(e.getMessage(), e);
        } finally {
            closeResources(statement, rs);
        }
        return heroCharacters;
    }

    @Override
    public Set<Superheroe> obtenerSuperheroes() throws SuperheroeException {
        String qry = "SELECT ch.id, ch.nombre, ch.genero, a.id AS alias_id, a.alias, p.id AS poder_id p.poder AS poder " +
                "FROM Personajes AS ch " +
                "JOIN Personajes_Poderes AS chp ON ch.id=chp.personaje_id " +
                "JOIN Poderes AS p ON p.id=chp.poder_id " +
                "JOIN Alias a ON a.personaje_id=ch.id ";
        return obtener(qry);
    }

    public Alias construirAlias(ResultSet rs) throws SuperheroeException {
        Alias alias = null;
        try {
            alias = new Alias();
            int id = rs.getInt("alias_id");
            int characterId = rs.getInt("id");
            String aliasName = rs.getString("alias");
            alias = new Alias(id, new Superheroe(characterId), aliasName);

        } catch (SQLException e) {
            throw new SuperheroeException(e.getMessage(), e);
        }
        return alias;
    }

    public Set<Poder> construirPoder(ResultSet rs) throws SuperheroeException {
        Set<Poder> poderSet = null;
        try {
            poderSet = new HashSet<>();
            int id = rs.getInt("poder_id");
            String powerName = rs.getString("poder");
            Poder power = new Poder(id, powerName);
            poderSet.add(power);

        } catch (SQLException e) {
            throw new SuperheroeException(e.getMessage(), e);
        }
        return poderSet;
    }

    public Superheroe construirSuperheroe(ResultSet rs) throws SQLException, SuperheroeException {
        int id = rs.getInt("id");
        String nombre= rs.getString("nombre");
        String genero = rs.getString("genero");
        Alias alias = construirAlias(rs);
        Set<Poder> poderes = construirPoder(rs);

        return new Superheroe(id,nombre,genero,alias,poderes);
    }

    @Override
    public Superheroe obtenerSuperheroe(Superheroe superheroe) throws SuperheroeException {
        String qry = "SELECT ch.id, ch.nombre, ch.genero, a.id AS alias_id, a.alias, p.id AS poder_id p.poder AS poder " +
                "FROM Personajes AS ch " +
                "JOIN Personajes_Poderes AS chp ON ch.id=chp.personaje_id " +
                "JOIN Poderes AS p ON p.id=chp.poder_id " +
                "JOIN Alias a ON a.personaje_id=ch.id " +
                "WHERE ch.id="+superheroe.getidSuperheroe();
        Set<Superheroe> superheroeSet = obtener(qry);

        return superheroeSet.iterator().next();
    }

    @Override
    public void aniadirSuperheroe(Superheroe superheroe) throws SuperheroeException {
        String query = "INSERT INTO Personajes(id, nombre, genero) VALUES(" +
                superheroe.getidSuperheroe()+ ", '"+ superheroe.getNombre() + "', '" +superheroe.getNombre()+ "')";
        update(query);
        aniadirTablaALias(superheroe);
        aniadirTablaPoderes(superheroe);
        aniadirTablaPersonajesPoderes(superheroe);
    }


    public void aniadirTablaALias(Superheroe superheroe) throws SuperheroeException{
        String query = "INSERT INTO Alias(id, personaje_id, alias) VALUES (" +
                superheroe.getAlias().getidAlias()+", "+ superheroe.getidSuperheroe()+", '"
                +superheroe.getAlias().getAlias()+"' ";
        update(query);
    }

    public void aniadirTablaPoderes(Superheroe superheroe) throws SuperheroeException {
        for (Poder poder : superheroe.getPoderes()){
            String query = "INSERT INTO Poderes(id, poder) VALUES (" +
                    poder.getidPoder()+", '"+poder.getPoder()+"' ";
            update(query);
        }

    }

    public void aniadirTablaPersonajesPoderes(Superheroe superheroe) throws SuperheroeException{
        for (Poder poder : superheroe.getPoderes()){
            String query = "INSERT INTO Personajes(persoanje_id, poder_id) VALUES (" +
                    superheroe.getidSuperheroe()+", '"+poder.getidPoder()+"' ";
            update(query);
        }
    }

    @Override
    public void borrarSuperheroe(Superheroe superheroe) throws SuperheroeException {
        String query = "DELETE FROM Personajes WHERE id="+superheroe.getidSuperheroe();
        update(query);
        eliminarTablaAlias(superheroe);
        eliminarTablaPoderes(superheroe);
        eliminarPersonajesPoderes(superheroe);
    }

    public void eliminarTablaAlias(Superheroe superheroe) throws SuperheroeException {
        String query = "DELETE FROM Alias WHERE id="+superheroe.getAlias().getidAlias();
        update(query);
    }

    public void eliminarTablaPoderes(Superheroe superheroe) throws SuperheroeException {
        for (Poder poder : superheroe.getPoderes()) {
            String query = "DELETE FROM Poderes WHERE id=" +poder.getidPoder();
            update(query);
        }
    }

    public void eliminarPersonajesPoderes(Superheroe superheroe) throws SuperheroeException {
        for (Poder poder : superheroe.getPoderes()) {
            String query = "DELETE FROM Personajes_Poderes WHERE personaje_id="+superheroe.getidSuperheroe()+
                    " AND poder_id=" +poder.getidPoder();
            update(query);
        }
    }
    @Override
    public void actualizarSuperheroe(Superheroe superheroe) throws SuperheroeException {
        String query = "UPDATE Personajes SET nombre='" +superheroe.getNombre() +"', '"+superheroe.getGenero()+"' " +
                "WHERE id="+superheroe.getidSuperheroe();
        update(query);
    }

    public void actualizarTablaAlias(Superheroe superheroe) throws SuperheroeException{
        String query = "UPDATE Alias SET personaje_id="+superheroe.getAlias().getSuperheroe().getidSuperheroe()+
                ", alias='"+superheroe.getAlias().getAlias();
        update(query);
    }

    public void actualizarTablaPoder(Superheroe superheroe){

    }


}
