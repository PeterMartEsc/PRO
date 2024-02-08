package es.ies.puerto.Productos;

import es.ies.puerto.Abstractas.ProductoAbstracta;

public class Electronica extends ProductoAbstracta {

    public Electronica() {
        super();
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
}
