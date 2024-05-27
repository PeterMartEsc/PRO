package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.abstractas.DaoAbstract;
import es.ies.puerto.modelo.db.exception.MarvelException;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoEquipamiento extends DaoAbstract {


    public DaoEquipamiento() throws MarvelException {
        super();
    }

    public Set<Equipamiento> findAllEquipamiento() throws MarvelException {
        String query;
        query  = "select p.id, p.nombre, p.descripcion, p.personaje_id from Equipamiento as p";
        return obtener(query);
    }

    public Equipamiento findEquipamiento(Equipamiento equipamiento) throws MarvelException {
        String query = "select p.id, p.nombre, p.descripcion, p.personaje_id from Equipamiento as p" +
                " where p.id='"+equipamiento.getId()+"'";
        Set<Equipamiento> lista = obtener(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public boolean updateEquipamiento(Equipamiento equipamiento) throws MarvelException {

        String query = "INSERT INTO Equipamiento as p (id,nombre)" +
                " VALUES ('"+equipamiento.getId()+"','"
                + equipamiento.getNombre()+"')";
        Equipamiento findEquipamiento = findEquipamiento(equipamiento);
        if (findEquipamiento!= null) {
            query = "update Equipamiento set nombre='"+equipamiento.getNombre()+"' " +
                    "where id='"+equipamiento.getId()+"'";
            actualizar(query);
            return true;
        }

        //Si existe actualiza
        //Si NO existe inserta
        actualizar(query);
        return false;
    }

    public boolean deleteEquipamiento(Equipamiento equipamiento) throws MarvelException {
        String query = "delete FROM Equipamiento as p" +
                " where p.id='"+equipamiento.getId()+"'";
        actualizar(query);
        return findEquipamiento(equipamiento) != null;
    }

    private Set<Equipamiento> obtener(String query) throws MarvelException {
        Set<Equipamiento> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String idPersonaje = rs.getString("personaje_id");

                Equipamiento Equipamiento = new Equipamiento(id,nombre,descripcion,idPersonaje);
                lista.add(Equipamiento);
            }
        } catch (SQLException exception) {
            throw new MarvelException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new MarvelException(e.getMessage(), e);
            }
        }
        return lista;
    }
}
