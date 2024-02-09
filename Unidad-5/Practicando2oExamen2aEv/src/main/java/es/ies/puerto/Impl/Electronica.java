package es.ies.puerto.Impl;

import es.ies.puerto.Abstractas.ProductoAbstract;

public class Electronica extends ProductoAbstract {

    public Electronica() {
    }

    public Electronica(String udi) {
        super(udi);
    }

    public Electronica(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }


    @Override
    public float precioMaximo() {
        return getPrecio()*0.6f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "Electronica{" +
                "Nombre: " +getNombre() +
                "Precio: "+getPrecio() +
                "Fecha de entrada: "+getFechaEntrada() +
                "Udi: " +getUdi()+
                "}";
    }
}
