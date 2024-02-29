package ies.puerto.modelo.impl;

import ies.puerto.modelo.abstractas.entity.Producto;

public class Aparato extends Producto {

    public Aparato() {
    }

    public Aparato(String id) {
        super(id);
    }

    public Aparato(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.42f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "Aparato{" +
                "Nombre: " +getNombre() +
                " Precio: " +getPrecio() +
                " Fecha de entrada: " +getFechaEntrada() +
                " id: " +getId()+
                "}";
    }
}
