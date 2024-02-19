package ies.puerto.Abstractas;

import ies.puerto.Interfaces.IRecomendable;

public abstract class ProductoRecomendable extends Producto implements IRecomendable {

    public ProductoRecomendable() {
    }

    public ProductoRecomendable(String id) {
        super(id);
    }

    public ProductoRecomendable(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }

    @Override
    public String toString() {
        return "ProductoRecomendable{}";
    }
}
