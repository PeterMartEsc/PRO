package es.jpa.hibernate.example.modelo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "aula")
public class Aula implements Serializable {

    private static final long serialVersionUID = 1;

    public Aula() {
    }

    public Aula(Integer id) {
        this.id = id;
    }




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String nombre;

    @ManyToOne
    private Instituto instituto;

    @OneToOne
    private Alumno alumno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Alumno getPerson() {
        return alumno;
    }

    public void setPerson(Alumno alumno) {
        this.alumno = alumno;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
