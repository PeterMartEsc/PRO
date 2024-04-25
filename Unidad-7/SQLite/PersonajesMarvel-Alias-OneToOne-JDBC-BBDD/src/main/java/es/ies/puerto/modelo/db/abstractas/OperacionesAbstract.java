package es.ies.puerto.modelo.db.abstractas;
import es.ies.puerto.exeption.SuperheroeException;
import es.ies.puerto.modelo.db.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacionesAbstract extends Conexion {
    public OperacionesAbstract() {
        super();
    }

    public void update(String query) throws SuperheroeException {
        Statement statement = null;
        try{
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception){
            throw new SuperheroeException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()){
                    statement.close();
                }
                closeConnection();

            } catch (SQLException e) {
                throw new SuperheroeException(e.getMessage(), e);
            }
        }
    }
    public void closeResources(Statement statement, ResultSet rs) throws SuperheroeException {
        try {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            closeConnection();

            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (Exception e) {
            throw new SuperheroeException(e.getMessage(), e);
        }
    }
}
