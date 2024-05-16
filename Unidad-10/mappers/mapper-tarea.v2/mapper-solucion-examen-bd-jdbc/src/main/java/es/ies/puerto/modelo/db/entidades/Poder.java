package es.ies.puerto.modelo.db.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Poder implements Serializable {
    String id;
    String nombre;

    public Poder() {
    }

    public Poder(String id) {
        this.id = id;
    }

    public Poder(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Poder)) return false;
        Poder poder = (Poder) o;
        return Objects.equals(id, poder.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
