package es.ies.puerto.modelo.abstractas;

import java.util.Objects;

public abstract class ProductoAbstract extends ModelPropertiesAbstract {
    private String id;
    private String nombre;
    private float precio;
    private String fEntrada;

    public ProductoAbstract(String id) {
        this.id = id;
    }

    public ProductoAbstract(String id, String nombre, float precio, String fEntrada) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fEntrada = fEntrada;
    }
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getfEntrada() {
        return fEntrada;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setfEntrada(String fEntrada) {
        this.fEntrada = fEntrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoAbstract)) return false;
        ProductoAbstract productoAbstract = (ProductoAbstract) o;
        return Objects.equals(id, productoAbstract.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fEntrada='" + fEntrada ;
    }
    public String toCsv() {
        return id + CSV_DELIMITADOR +
                nombre + CSV_DELIMITADOR +
                precio + CSV_DELIMITADOR +
                fEntrada;
    }
}
