package es.ies.puerto.model.db.jdbc.impl;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.MyException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb extends AppConfig {
    Connection con;

    /**
     * Default constructor of the class
     */
    public ConnectionDb() {}

    /**
     * Create a connection
     * @throws MyException
     */

    public Connection getConnection() throws MyException {
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:"+(getUrlDb()));
        } catch (Exception exception){
            throw new MyException("Could not establish connection with the database", exception);
        }
        return con;
    }

    /**
     * Close a connection
     * @throws MyException
     */

    public void closeConnection() throws MyException{
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            throw new MyException(e.getMessage(), e);
        }
    }
}
