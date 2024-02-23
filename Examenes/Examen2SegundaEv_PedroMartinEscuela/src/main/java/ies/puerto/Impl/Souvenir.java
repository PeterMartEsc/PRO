package ies.puerto.Impl;

import ies.puerto.Abstractas.Producto;

public class Souvenir extends Producto {

    public Souvenir() {
    }

    public Souvenir(String id) {
        super(id);
    }

    public Souvenir(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.3f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "Souvenir{}";
    }
}
