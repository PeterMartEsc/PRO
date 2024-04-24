package es.ies.puerto.modelo;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Superheroe {

    private String id;
    private String nombre;
    private String alias;
    private String genero;
    private Set<Poder> poderes;

    public Superheroe() {
        poderes = new HashSet<>();
    }

    public Superheroe(String id) {
        this.id = id;
        poderes = new HashSet<>();
    }

    public Superheroe(String id, String nombre, String alias, String genero, Set<Poder> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<Poder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Superheroe that = (Superheroe) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Superheroe{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
