package es.jpa.hibernate.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "aula")
public class Aula implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
