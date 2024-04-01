package es.ies.puerto.modelo;

public class Usuario extends Persona{
    public Usuario(String id) {
        super(id);
    }

    public Usuario(String id, String nombre, int edad, String ciudad) {
        super(id, nombre, edad, ciudad);
    }
}
