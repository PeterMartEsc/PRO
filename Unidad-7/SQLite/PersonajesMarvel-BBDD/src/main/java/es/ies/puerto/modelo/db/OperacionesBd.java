package es.ies.puerto.modelo.db;

import es.ies.puerto.exeption.SuperheroeException;
import es.ies.puerto.modelo.Superheroe;
import es.ies.puerto.modelo.db.interfaces.ICrudOperaciones;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
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
                String nombre = rs.getString("nombre");
                String alias = rs.getString("alias");
                String genero = rs.getString("genero");

                List<String> poderes = null;

                Superheroe superheroe = new Superheroe(nombre, alias, genero, poderes);
                lista.add(superheroe);
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

    @Override
    public Set<Superheroe> obtenerSuperheroes() throws SuperheroeException {
        //Añadir poderes
        String query = "SELECT p.nombre, p.alias, p.genero, FROM Personajes as p";
        return obtener(query);
    }

    @Override
    public Superheroe obtenerSuperheroe(Superheroe superHeroe) throws SuperheroeException {
        //Añadir poderes
        String query = "SELECT p.nombre, p.alias, p.genero, FROM Personajes as p" +
                " WHERE p.alias='"+superHeroe.getAlias()+"'";
        Set<Superheroe> lista = obtener(query);
        if(lista.isEmpty()){
            return null;
        }

        return lista.iterator().next();
    }

    //Añadir poderes
    @Override
    public void aniadirHeroe(Superheroe superheroe) throws SuperheroeException {
        String query = "INSERT INTO Personajes (nombre, alias, genero)" +
                " VALUES ('"+superheroe.getNombre()+"', "+superheroe.getAlias()+", '"+superheroe.getGenero()+"')";
        actualizar(query);
    }
    //Borrar poderes
    @Override
    public void borrarHeroe(Superheroe superheroe) throws SuperheroeException {
        String query = "DELETE FROM Personajes as p" +
                " where p.alias='"+superheroe.getAlias()+"'";
        actualizar(query);
    }

    //Actualizar poderes
    @Override
    public void actualizarHeroe(Superheroe superheroe) throws SuperheroeException {
        String query = "UPDATE Personajes SET " +
                "nombre='"+superheroe.getNombre()+"', " +
                "genero='"+superheroe.getGenero()+"'";
        actualizar(query);
    }
}
