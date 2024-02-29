package ies.puerto.modelo.abstractas.entity;

import ies.puerto.modelo.interfaces.IRecomendable;

public abstract class ProductoRecomendable extends Producto implements IRecomendable {

    private int popularidad;

    public ProductoRecomendable() {
    }

    public ProductoRecomendable(String id) {
        super(id);
    }

    public ProductoRecomendable(String nombre, float precio, String fechaEntrada, String id, int popularidad) {
        super(nombre, precio, fechaEntrada, id);
        this.popularidad = popularidad;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "ProductoRecomendable{}";
    }
}
