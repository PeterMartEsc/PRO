package es.ies.puerto.modelo;

import es.ies.puerto.modelo.abstractas.ProductoAbstract;

public class Alimento extends ProductoAbstract {

    private String fCaducidad;

    public Alimento(String id) {
        super(id);
    }

    public Alimento(String id, String nombre, float precio, String fEntrada, String fCaducidad) {
        super(id, nombre, precio, fEntrada);
        this.fCaducidad = fCaducidad;
    }

    public String getfCaducidad() {
        return fCaducidad;
    }
}
