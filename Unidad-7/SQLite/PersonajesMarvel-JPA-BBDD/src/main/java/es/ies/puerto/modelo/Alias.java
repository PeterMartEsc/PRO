package es.ies.puerto.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Alias")
public class Alias {
    @Id
    @Column(name="aliasId")
    private String id;
    @OneToMany(mappedBy = "alias")
    private Superheroe superheroe;
    @Column(name="alias")
    private String alias;

    public Alias(String id) {
        this.id = id;
    }

    public Alias(String id, Superheroe superheroe, String alias) {
        this.id = id;
        this.superheroe = superheroe;
        this.alias = alias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return Objects.equals(id, alias.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Alias{" + '\n' +
                "id='" + id + '\n' +
                ", superheroe=" + superheroe + '\n' +
                ", alias='" + alias + '\n' +
                '}';
    }
}
