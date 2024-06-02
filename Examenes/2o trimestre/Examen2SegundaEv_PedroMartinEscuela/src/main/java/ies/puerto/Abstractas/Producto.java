package ies.puerto.Abstractas;

import ies.puerto.Interfaces.IVendible;

import java.util.Objects;

public abstract class Producto implements IVendible {

    private String nombre;

    private float precio;

    private String fechaEntrada;

    private String id;

    public Producto(){

    }

    public Producto(String id) {
        this.id = id;
    }

    public Producto(String nombre, float precio, String fechaEntrada, String id) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
