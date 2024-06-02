package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.abstractas.DaoAbstract;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Alias;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaoAlias extends DaoAbstract {


    public DaoAlias() throws MarvelException {
            super();
        }

        public Set<Alias> findAllAlias() throws MarvelException {
            String query;
            query  = "select p.id, p.alias, p.personaje_id from Alias as p";
            return obtener(query);
        }

        public Alias findAlias(Alias Alias) throws MarvelException {
            String query = "select p.id, p.alias, p.personaje_id from Alias as p" +
                    " where p.id='"+Alias.getId()+"'";
            Set<Alias> lista = obtener(query);
            if(lista.isEmpty()) {
                return null;
            }
            return lista.iterator().next();
        }

        public boolean updateAlias(Alias alias) throws MarvelException {

            String query = "INSERT INTO Alias as p (id,alias, personaje_id)" +
                    " VALUES ('"+alias.getId()+"','"
                    + alias.getDescripcion()+"',"+"'"+alias.getPersonaje_id()+"')";
            Alias findAlias = findAlias(alias);
            if (findAlias!= null) {
                query = "update Alias set alias='"+alias.getDescripcion()+"' " +
                        "where id='"+alias.getId()+"'";
            }

            //Si existe actualiza
            //Si NO existe inserta
            actualizar(query);
            return false;
        }

        public void deleteAlias(Alias alias) throws MarvelException {
            String query = "delete FROM Alias as p" +
                    " where p.id='"+alias.getId()+"'";
            actualizar(query);
        }

        private Set<Alias> obtener(String query) throws MarvelException {
            Set<Alias> lista = new HashSet<>();
            Statement statement = null;
            ResultSet rs = null;
            try {
                statement = getConexion().createStatement();
                rs = statement.executeQuery(query);
                while (rs.next()) {
                    String id = rs.getString("id");
                    String descripcion = rs.getString("alias");
                    String idPersonaje = rs.getString("personaje_id");

                    Alias Alias = new Alias(id,descripcion,idPersonaje);
                    lista.add(Alias);
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
