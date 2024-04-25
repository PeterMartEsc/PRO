package es.ies.puerto.modelo.db;

import es.ies.puerto.exeption.SuperheroeException;
import es.ies.puerto.modelo.entities.Alias;
import es.ies.puerto.modelo.entities.Poder;
import es.ies.puerto.modelo.entities.Superheroe;
import es.ies.puerto.modelo.db.interfaces.ICrudOperaciones;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class OperacionesBd extends Conexion implements ICrudOperaciones {


    public OperacionesBd(String url) {
        super(url);
    }

    public OperacionesBd(String url, String user, String password) {
        super(url, user, password);
    }

    private void actualizar(String query) throws SuperheroeException {

        Statement statement = null;

        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);

        } catch (SQLException exception) {
            throw new SuperheroeException(exception.getMessage(), exception);
        } finally {
            try{
                if(statement!=null &&!statement.isClosed()){
                    statement.close();
                }
                if(!getConexion().isClosed()){
                    getConexion().close();
                }

            } catch (SQLException e) {
                throw new SuperheroeException(e.getMessage(), e);
            }
        }
    }

    private Set<Superheroe> obtener(String query) throws SuperheroeException {

        Set<Superheroe> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("idSuperheroe");
                String nombre = rs.getString("nombre");

                Superheroe superheroeEx1 = new Superheroe(id);

                Set<Alias> alias = obtenerAlias(superheroeEx1);
                String genero = rs.getString("genero");
                Set<Poder> poderes = obtenerPoderes(superheroeEx1);

                superheroeEx1 = new Superheroe(id,nombre,alias,genero, poderes);
                lista.add(superheroeEx1);
            }
        } catch (SQLException exception) {
            throw new SuperheroeException(exception.getMessage(), exception);
        } finally {
            try{
                if(rs!=null && !rs.isClosed()){
                    rs.close();
                }

                if(statement!=null &&!statement.isClosed()){
                    statement.close();
                }
                if(!getConexion().isClosed()){
                    getConexion().close();
                }

            } catch (SQLException e) {
                throw new SuperheroeException(e.getMessage(), e);
            }
        }
        return lista;
    }

    private Set<Poder> queryPoderes (String query) throws SuperheroeException {
        Set<Poder> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("idPoder");
                String poder = rs.getString("poder");
                Poder poderX = new Poder(id,poder);
                lista.add(poderX);
            }
        } catch (SQLException exception) {
            throw new SuperheroeException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (getConexion() != null && !getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException exception) {
                throw new SuperheroeException(exception.getMessage(), exception);
            }
        }
        return lista;
    }

    private Set<Alias> queryAlias (String query) throws SuperheroeException {
        Set<Alias> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String idAlias = rs.getString("idAlias");
                String idSuperheroe = rs.getString("idSuperheroe");
                String alias = rs.getString("alias");
                Alias aliasX = new Alias(idAlias, idSuperheroe, alias);
                lista.add(aliasX);
            }
        } catch (SQLException exception) {
            throw new SuperheroeException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (getConexion() != null && !getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException exception) {
                throw new SuperheroeException(exception.getMessage(), exception);
            }
        }
        return lista;
    }

    @Override
    public Set<Superheroe> obtenerSuperheroes() throws SuperheroeException {
        String query = "SELECT p.idSuperheroe, p.nombre, p.genero FROM Personajes as p";
        return obtener(query);
    }

    public Set<Poder> obtenerPoderes (Superheroe superheroe) throws SuperheroeException {
        String query = "SELECT p.idPoder, p.poder FROM Poderes as p " +
                "INNER JOIN PersonajesPoderes as pp ON p.idPoder = pp.idPoder " +
                "WHERE pp.idSuperheroe = " + superheroe.getId();
        return queryPoderes(query);
    }

    public Set<Alias> obtenerAlias (Superheroe superheroe) throws SuperheroeException {
        String query = "SELECT a.idAlias, a.idSuperheroe, a.alias FROM Alias as a " +
                "WHERE a.idSuperheroe = " + superheroe.getId();
        return queryAlias(query);
    }

    @Override
    public Superheroe obtenerSuperheroe(Superheroe superHeroe) throws SuperheroeException {
        String query = "SELECT p.idSuperheroe, p.nombre, p.genero FROM Personajes as p" +
                " WHERE p.idSuperheroe='"+superHeroe.getId()+"'";
        Set<Superheroe> lista = obtener(query);
        if(lista.isEmpty()){
            return null;
        }

        return lista.iterator().next();
    }

    @Override
    public void aniadirHeroe(Superheroe superheroe) throws SuperheroeException {
        String query = "INSERT INTO Personajes" +
                " VALUES ('"+superheroe.getId()+"', '"+superheroe.getNombre()+"', '"+superheroe.getGenero()+"')";
        actualizar(query);
        for (Alias alias : superheroe.getAlias()) {
            aniadirAlias(alias);
        }
        for (Poder poder : superheroe.getPoderes()) {
            aniadirPoder(poder);
            String query2 = "INSERT INTO PersonajesPoderes VALUES ('" + superheroe.getId() + "', '" + poder.getId() + "');";
            actualizar(query2);
        }
    }

    public void aniadirPoder(Poder poder) throws SuperheroeException {
        String query = "INSERT INTO Poderes (idPoder, poder)" +
                " VALUES ('"+poder.getId()+"', '"+poder.getPoder()+"')";
        actualizar(query);
    }

    public void aniadirAlias(Alias alias) throws SuperheroeException {
        String query = "INSERT INTO Alias (idAlias, idSuperheroe, alias)" +
                " VALUES ('"+alias.getId()+"', '"+alias.getIdSuperheroe()+"', '"+alias.getAlias()+"')";
        actualizar(query);
    }


    @Override
    public void borrarHeroe(Superheroe superheroe) throws SuperheroeException {
        String query = "DELETE FROM Personajes as p" +
                " where p.idSuperheroe='"+superheroe.getId()+"'";
        actualizar(query);
        for(Poder poder : superheroe.getPoderes()){
            borrarPoder(poder);
            String query2 = "DELETE FROM PersonajesPoderes " +
                    "WHERE idSuperheroe='" + superheroe.getId()+"';";
            actualizar(query2);
        }

        for(Alias alias : superheroe.getAlias()){
            borrarAlias(alias);
        }
    }

    public void borrarPoder(Poder poder) throws SuperheroeException {
        String query = "DELETE FROM Poderes as p" +
                " where p.idPoder='"+poder.getId()+"'";
        actualizar(query);
    }

    public void borrarAlias(Alias alias) throws SuperheroeException {
        String query = "DELETE FROM Alias as a" +
                " where a.idAlias='"+alias.getId()+"'";
        actualizar(query);
    }

    @Override
    public void actualizarHeroe(Superheroe superheroe) throws SuperheroeException {
        String query = "UPDATE Personajes SET " +
                "nombre='"+superheroe.getNombre()+"', " +
                "genero='"+superheroe.getGenero()+"' " +
                "WHERE idSuperheroe= '"+superheroe.getId()+"'; ";
        actualizar(query);
        for(Poder poder : superheroe.getPoderes()){
            actualizarPoder(poder);
            String query2 = "UPDATE PersonajesPoderes SET " +
                    "idPoder='" + poder.getId() + "' " +
                    "WHERE idSuperheroe='" + superheroe.getId()+"';";
            actualizar(query2);
        }

        for(Alias alias : superheroe.getAlias()){
            actualizarAlias(alias);
        }

    }

    public void actualizarPoder(Poder poder) throws SuperheroeException {
        String query = "UPDATE Poderes SET " +
                "poder='"+poder.getPoder()+"' " +
                "WHERE idPoder='"+poder.getId()+"'; ";
        actualizar(query);
    }

    public void actualizarAlias(Alias alias) throws SuperheroeException {
        String query = "UPDATE Alias SET " +
                "alias='"+alias.getAlias()+"' " +
                "WHERE idAlias='"+alias.getId()+"'; ";
        actualizar(query);
    }
}
