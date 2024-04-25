package es.ies.puerto.modelo.db;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exeption.SuperheroeException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion extends AppConfig {
    Connection con;

    /**
     * Default constructor of the class
     */
    public Conexion() {}

    /**
     * Create a connection
     *
     * @throws SuperheroeException
     */

    public Connection getConexion() throws SuperheroeException {
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:"+(getUrlDb()));
        } catch (Exception exception){
            throw new SuperheroeException("Could not establish connection with the database", exception);
        }
        return con;
    }

    /**
     * Close a connection
     * @throws SuperheroeException
     */

    public void closeConnection() throws SuperheroeException{
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            throw new SuperheroeException(e.getMessage(), e);
        }
    }
}
