package es.ies.puerto.Productos;

import es.ies.puerto.Abstractas.ProductoAbstracta;

public class Souvenir extends ProductoAbstracta {

    public Souvenir() {
        super();
    }

    public Souvenir(String udi) {
        super(udi);
    }

    public Souvenir(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*0.4f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
