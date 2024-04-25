package es.jpa.hibernate.example.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Alumno implements Serializable {

	private static final long serialVersionUID = -7250234396452258822L;

	@Id
	@TableGenerator(name = "gen_person", 
	                table = "table_keys", 
	                pkColumnName = "name_table", 
	                valueColumnName = "cod_key", 
	                pkColumnValue = "person", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen_person", strategy = GenerationType.TABLE)
	@Column(name = "id")
	private Integer id;
	private String name;
	private Integer age;

	@OneToOne(mappedBy = "alumno")
	private Aula aula;

	/**
	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			})
	 **/
	@ManyToMany
	@JoinTable(name = "alumno_profesor",
			joinColumns = { @JoinColumn(name = "alumno_id") },
			inverseJoinColumns = { @JoinColumn(name = "profesor_id")})
	private Set<Alumno> profesores;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Set<Alumno> getProfesores() {
		return profesores;
	}

	public void setProfesores(Set<Alumno> profesores) {
		this.profesores = profesores;
	}
}
