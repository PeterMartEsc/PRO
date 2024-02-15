package es.ies.puerto.presentacion;

public class Alimento extends Articulo{

    public Alimento(){
        super();
    }

    public Alimento(String id, String nombre, float precio, String fEntrada, String fCaducidad) {
        super(id, nombre, precio, fEntrada, fCaducidad);
    }
}
