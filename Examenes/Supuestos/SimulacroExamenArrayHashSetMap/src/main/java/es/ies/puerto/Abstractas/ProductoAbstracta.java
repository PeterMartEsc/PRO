package es.ies.puerto.Abstractas;

import es.ies.puerto.Interfaces.IProducto;

import java.util.Objects;

public abstract class ProductoAbstracta implements IProducto {

    private String nombre;

    private float precio;

    private String fechaEntrada;

    private String udi;

    public ProductoAbstracta(){

    }

    public ProductoAbstracta(String udi) {
        this.udi = udi;
    }

    public ProductoAbstracta(String nombre, float precio, String fechaEntrada, String udi) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.udi = udi;
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

    public String getUdi() {
        return udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoAbstracta that = (ProductoAbstracta) o;
        return Objects.equals(udi, that.udi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udi);
    }

    @Override
    public String toString() {
        return "ProductoAbstracta{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", udi='" + udi + '\'' +
                '}';
    }
}
