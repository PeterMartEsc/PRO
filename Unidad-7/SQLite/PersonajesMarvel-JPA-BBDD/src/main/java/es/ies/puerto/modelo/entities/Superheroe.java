package es.ies.puerto.modelo.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="Personajes")
public class Superheroe {

    @Id
    @Column(name="personajeId")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @ManyToOne
    private Set<Alias> alias;
    @Column(name="genero")
    private String genero;
    @ManyToMany
    private List<Poder> poderes;

    public Superheroe(int id) {
        this.id = id;
    }

    public Superheroe(int id, String nombre, Set<Alias> alias, String genero, List<Poder> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.alias = new HashSet<>();
        this.genero = genero;
        this.poderes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Alias> getAlias() {
        return alias;
    }

    public void setAlias(Set<Alias> alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
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
        return "Superheroe{" +'\n' +
                "id='" + id + '\n' +
                ", nombre='" + nombre + '\n' +
                ", alias=" + alias + '\n' +
                ", genero='" + genero + '\n' +
                ", poderes=" + poderes + '\n' +
                '}';
    }
}
