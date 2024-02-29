package ies.puerto.modelo.impl;

import ies.puerto.modelo.abstractas.entity.ProductoRecomendable;

public class CuidadoPersonal extends ProductoRecomendable {

    public CuidadoPersonal() {
        super();
    }

    public CuidadoPersonal(String id) {
        super(id);
    }

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String id, int popularidad) {
        super(nombre, precio, fechaEntrada, id, popularidad);
    }

    @Override
    public boolean recomendarProducto() {

        if(calcularPopularidad() > 7){
            return true;
        }

        return false;
    }

    @Override
    public int calcularPopularidad() {

        return getPopularidad();

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
        return "Cuidado Personal{" +
                "Nombre: " +getNombre()+
                " Precio: " +getPrecio()+
                " Identificador: " +getId()+
                " Popularidad: " +getPopularidad()+
                "}";
    }
}
