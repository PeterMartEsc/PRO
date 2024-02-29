package es.ies.puerto.presentacion;

public class Aparato extends Articulo{

    public Aparato(){
        super();
    }

    public Aparato(String id, String nombre, float precio, String fEntrada) {
        super(id, nombre, precio, fEntrada, null);
    }
}
