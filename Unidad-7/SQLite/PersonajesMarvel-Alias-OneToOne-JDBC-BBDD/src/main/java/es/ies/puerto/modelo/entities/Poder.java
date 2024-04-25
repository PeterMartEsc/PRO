package es.ies.puerto.modelo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Poderes")
public class Poder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPoder")
    int idPoder;

    @Column(name = "poder")
    String poder;
    @ManyToMany(mappedBy = "poderes",cascade = CascadeType.ALL)
    Set<Superheroe> superheroes;

    /**
     * Default constructor of the class
     */
    public Poder(){}

    /**
     * Constructor of the class
     * @param idPoder identificator of a power
     */
    public Poder(int idPoder) {
        this.idPoder = idPoder;
    }

    /**
     * Constructor of the class
     * @param idPoder identificator of a power
     * @param poder name of a power
     */
    public Poder(int idPoder, String poder) {
        this.idPoder = idPoder;
        this.poder = poder;
    }

    public Poder(int idPoder, String poder, Set<Superheroe> heroCharacters) {
        this.idPoder = idPoder;
        this.poder = poder;
        this.superheroes = heroCharacters;
    }

    /**
     * Getters and setters
     */
    public int getidPoder() {
        return idPoder;
    }

    public void setidPoder(int idPoder) {
        this.idPoder = idPoder;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = this.poder;
    }

    public Set<Superheroe> getSuperheroes() {
        return superheroes;
    }

    public void setSuperheroes(Set<Superheroe> heroCharacters) {
        this.superheroes = heroCharacters;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poder poder = (Poder) o;
        return idPoder == poder.idPoder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPoder);
    }

    @Override
    public String toString() {
        return "Poder{" +
                "idPoder=" + idPoder +
                ", power='" + poder + '\'' +
                ", superheroes=" + superheroes +
                '}';
    }
}
