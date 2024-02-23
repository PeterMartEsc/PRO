package ies.puerto.modelo.entity;

import java.util.Objects;

public abstract class Articulo {
    public final String DELIMITADOR = ",";
    private String id;
    private String nombre;
    private float precio;
    private String fCaducidad;
    private String fEntrada;

    public Articulo(String id, String nombre, float precio, String fCaducidad, String fEntrada) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fCaducidad = fCaducidad;
        this.fEntrada = fEntrada;
    }

    public Articulo(String id, String nombre, float precio, String fEntrada) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fEntrada = fEntrada;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Articulo)) return false;
        Articulo articulo = (Articulo) o;
        return Objects.equals(id, articulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fCaducidad='" + fCaducidad + '\'' +
                ", fEntrada='" + fEntrada + '\'' +
                '}';
    }

    public String toCsv(){
        return nombre+ DELIMITADOR +precio+DELIMITADOR+fEntrada+DELIMITADOR+id+DELIMITADOR+fCaducidad;
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

    public String getfCaducidad() {
        return fCaducidad;
    }

    public String getfEntrada() {
        return fEntrada;
    }
}
