package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.abstractas.DaoAbstract;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Personaje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaoPersonaje extends DaoAbstract {

    public DaoPersonaje() throws MarvelException {
        super();
    }

    public Set<Personaje> findAllPersonaje() throws MarvelException {
        String query;
        query  = "select p.id, p.nombre, p.genero from Personaje as p";
        return obtener(query);
    }

    public Personaje findPersonaje(Personaje Personaje) throws MarvelException {
        String query = "select p.id, p.nombre, p.genero from Personaje as p" +
                " where p.id='"+Personaje.getId()+"'";
        Set<Personaje> lista = obtener(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public boolean updatePersonaje(Personaje personaje) throws MarvelException {

        String query = "INSERT INTO Personaje as p (id,nombre,genero)" +
                " VALUES ('"+personaje.getId()+"','"
                + personaje.getNombre()+"','"+personaje.getGenero()+"')";
        Personaje findPersonaje = findPersonaje(personaje);
        if (findPersonaje!= null) {
            query = "update Personaje set nombre='"+personaje.getNombre()+"'" +
                    ", genero= '" +personaje.getGenero()+"'" +
                    " where id='"+personaje.getId()+"'";
        }

        //Si existe actualiza
        //Si NO existe inserta
        actualizar(query);
        return false;
    }

    public void deletePersonaje(Personaje Personaje) throws MarvelException {
        String query = "delete FROM Personaje as p" +
                " where p.id='"+Personaje.getId()+"'";
        actualizar(query);
    }

    private Set<Personaje> obtener(String query) throws MarvelException {
        Set<Personaje> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String genero = rs.getString("genero");

                Personaje Personaje = new Personaje(id, nombre,genero,null, null,null);
                lista.add(Personaje);
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
