package es.ies.puerto.modelo.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name="Personajes")
public class Superheroe {

    @Id
    @Column(name="idSuperheroe")
    private String id;
    @Column(name="nombre")
    private String nombre;
    @OneToOne
    private Alias alias;
    @Column(name="genero")
    private String genero;
    @ManyToMany
    private Set<Poder> poderes;

    public Superheroe() {
        poderes = new HashSet<>();
    }

    public Superheroe(String id) {
        this.id = id;
        poderes = new HashSet<>();
    }

    public Superheroe(String id, String nombre, Alias alias, String genero, Set<Poder> poderes) {
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

    public Alias getAlias() {
        return alias;
    }

    public void setAlias(Alias alias) {
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
                ", alias=" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes +
                '}';
    }
}
