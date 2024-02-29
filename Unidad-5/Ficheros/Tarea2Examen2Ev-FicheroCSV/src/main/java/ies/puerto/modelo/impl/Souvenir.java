package ies.puerto.modelo.impl;

import ies.puerto.modelo.abstractas.entity.Producto;

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
        return "Souvenir{" +
                "Nombre: " +getNombre()+
                " Precio: " +getPrecio()+
                " Identificador: " +getId()+
                "}";
    }
}
