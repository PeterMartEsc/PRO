package es.ies.puerto.presentacion;

import java.util.Objects;

public class Articulo {

    private String id;

    private String nombre;

    private float precio;

    private String fEntrada;

    private String fCaducidad;

    public Articulo() {

    }

    public Articulo(String id, String nombre, float precio, String fEntrada, String fCaducidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fEntrada = fEntrada;
        this.fCaducidad = fCaducidad;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
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
                ", fEntrada='" + fEntrada + '\'' +
                ", fCaducidad='" + fCaducidad + '\'' +
                '}';
    }
}
