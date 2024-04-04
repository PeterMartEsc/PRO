package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.UsuarioException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private Connection con;
    private String url;
    private String user;
    private String password;

    public Conexion(String url) {
        this.url = "jdbc:sqlite:" + url;
    }

    public Conexion(String url, String user, String password) {
        this.url = "jdbc:sqlite:" + url;
        this.user = user;
        this.password = password;
    }

    public Connection getConexion() throws UsuarioException {

        try {
            this.con = DriverManager.getConnection(url);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw new UsuarioException("No se ha podido establecer conexión", exception);
        }

        return con;
    }
}
