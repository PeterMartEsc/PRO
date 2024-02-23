package ies.puerto.Impl;

import ies.puerto.Abstractas.ProductoRecomendable;

public class CuidadoPersonal extends ProductoRecomendable {

    public CuidadoPersonal() {
        super();
    }

    public CuidadoPersonal(String id) {
        super(id);
    }

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }

    @Override
    public boolean recomendarProducto() {
        return true;
    }

    @Override
    public int calcularPopularidad() {
        return 7;
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.8f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "CuidadoPersonal{}";
    }
}
