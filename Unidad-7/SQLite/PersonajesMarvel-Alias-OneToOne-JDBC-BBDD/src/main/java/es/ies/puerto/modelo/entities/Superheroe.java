package es.ies.puerto.modelo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name="Personajes")
public class Superheroe implements Serializable {


    private static final long serialVersionUID = -7250234396452258822L;
    @Id
    @GeneratedValue(generator = "gen_person", strategy = GenerationType.IDENTITY)
    @Column(name = "idSuperheroe")
    private int idSuperheroe;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "genero")
    private String genero;
    @OneToOne(mappedBy = "superheroe", cascade = CascadeType.ALL)
    private Alias alias;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Personajes_Poderes", joinColumns = {
            @JoinColumn(name = "personaje_id",referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "poder_id",referencedColumnName = "id")})
    private Set<Poder> poderes;


    /**
     * Default constructor of the class
     */
    public Superheroe(){
        poderes = new HashSet<>();
    }

    /**
     * Constructor of the class
     * @param id of the character
     */
    public Superheroe(int id){
        this.idSuperheroe = id;
    }

    /**
     * Constructor of the table Personajes
     * @param idSuperheroe of the character
     * @param nombre of the character
     * @param genero of the character
     */

    public Superheroe(int idSuperheroe, String nombre, String genero) {
        this.idSuperheroe = idSuperheroe;
        this.nombre = nombre;
        this.genero = genero;
    }

    /**
     * Full constructor of the class
     * @param idSuperheroe of the character
     * @param nombre of the character
     * @param genero of the character
     * @param alias of the character
     * @param poderes of the character
     */
    public Superheroe(int idSuperheroe, String nombre, String genero, Alias alias, Set<Poder> poderes) {
        this.idSuperheroe = idSuperheroe;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.poderes = poderes;
    }

    /**
     * Getter and setters
     */
    public int getidSuperheroe() {
        return idSuperheroe;
    }

    public void setIdSuperheroe(int idSuperheroe) {
        this.idSuperheroe = idSuperheroe;
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
        return idSuperheroe == that.idSuperheroe;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSuperheroe);
    }

    @Override
    public String toString() {
        return "Superheroe{" +
                "idSuperheroe=" + idSuperheroe +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", alias=" + alias +
                ", poderes=" + poderes +
                '}';
    }
}
