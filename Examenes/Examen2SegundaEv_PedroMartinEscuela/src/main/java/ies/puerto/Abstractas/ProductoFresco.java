package ies.puerto.Abstractas;

import ies.puerto.Interfaces.ISaludable;

public abstract class ProductoFresco extends Producto implements ISaludable {

    private String fechaCaducidad;

    public ProductoFresco(){

    }

    public ProductoFresco(String id) {
        super(id);
    }

    public ProductoFresco(String id, String fechaCaducidad) {
        super(id);
        this.fechaCaducidad = fechaCaducidad;
    }

    public ProductoFresco(String nombre, float precio, String fechaEntrada, String id, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, id);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                '}';
    }
}
