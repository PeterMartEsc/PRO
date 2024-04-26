package es.ies.puerto.modelo.entities;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name="Poderes")
public class Poder {
    @Id
    @Column(name="idPodere")
    private String id;
    @ManyToMany(mappedBy = "poderes")
    private String poder;

    public Poder(String id) {
        this.id = id;
    }

    public Poder(String id, String poder) {
        this.id = id;
        this.poder = poder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
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
        return "Poder{" +
                "id='" + id + '\'' +
                ", poder='" + poder + '\'' +
                '}';
    }
}
