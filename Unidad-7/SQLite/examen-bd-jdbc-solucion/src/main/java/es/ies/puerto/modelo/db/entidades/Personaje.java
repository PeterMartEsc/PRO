package es.ies.puerto.modelo.db.entidades;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Personaje implements Serializable {
    private String id;
    private String nombre;
    private String genero;

    private Alias alias;
    private Set<Equipamiento> equipamientos;
    private Set<Poder> poderes;

    public Personaje() {
    }

    public Personaje(String id) {
        this.id = id;
    }

    public Personaje(String id, String nombre, String genero, Alias alias, Set<Equipamiento> equipamientos, Set<Poder> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.equipamientos = equipamientos;
        this.poderes = poderes;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Alias getAlias() {
        return alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    public Set<Equipamiento> getEquipamientos() {
        return equipamientos;
    }

    public void setEquipamientos(Set<Equipamiento> equipamientos) {
        this.equipamientos = equipamientos;
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
        if (!(o instanceof Personaje)) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

