package es.ies.puerto.modelo.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name="Poderes")
public class Poder {
    @Id
    @Column(name="poderesId")
    private int id;
    @Column(name="poder")
    private String poder;
    @ManyToMany(mappedBy = "poderes")
    private List<Superheroe> superheroes;

    public Poder(int id) {
        this.id = id;
    }

    public Poder(int id, String poder, List<Superheroe> superheroes) {
        this.id = id;
        this.poder = poder;
        this.superheroes = superheroes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public List<Superheroe> getSuperheroes() {
        return superheroes;
    }

    public void setSuperheroes(List<Superheroe> superheroes) {
        this.superheroes = superheroes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poder poder = (Poder) o;
        return Objects.equals(id, poder.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Poder{" + '\n' +
                "id='" + id + '\n' +
                ", poder='" + poder + '\n' +
                ", superheroes=" + superheroes +
                '}';
    }
}
