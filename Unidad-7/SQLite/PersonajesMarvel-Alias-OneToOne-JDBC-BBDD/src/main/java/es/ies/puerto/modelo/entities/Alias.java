package es.ies.puerto.modelo.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name="Alias")
public class Alias implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlias")
    private int idAlias;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSuperheroe")
    private Superheroe superheroe;
    @Column(name = "alias")
    private String alias;

    /**
     * Default constructor of the class
     */
    public Alias (){}

    /**
     * Constructor of the class
     * @param idAlias of the heroCharacter's alias
     */
    public Alias(int idAlias) {
        this.idAlias = idAlias;
    }

    public Alias(int idAlias, Superheroe superheroe, String alias) {
        this.idAlias = idAlias;
        this.superheroe = superheroe;
        this.alias = alias;
    }

    /**
     * Getters and setters
     */
    public int getidAlias() {
        return idAlias;
    }

    public void setidAlias(int idAlias) {
        this.idAlias = idAlias;
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

    /**
     * Method equals and hashcode
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return idAlias == alias.idAlias;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlias);
    }

    @Override
    public String toString() {
        return "Alias{" +
                "idAlias=" + idAlias +
                ", superheroe=" + superheroe +
                ", alias='" + alias + '\'' +
                '}';
    }
}
