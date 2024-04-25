package es.jpa.hibernate.example.entities;

import es.jpa.hibernate.example.modelo.entities.Alumno;
import es.jpa.hibernate.example.modelo.entities.Profesor;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class ProfesorTest {
	public static final String ALUMNO_TEST = "personTest";
	public static final String PROFESOR_TEST = "Profesor_Test";
	public static final String NOMBRE_UPDATE = "nombre_update";
	static EntityManagerFactory emf;
	EntityManager em;

	Alumno alumno;
	Profesor profesor;

	@BeforeAll
	public static void setUp() {
		emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
	}

	@BeforeEach
	public void initEntityManager() {
		em = emf.createEntityManager();
		alumno = new Alumno();
		alumno.setName(ALUMNO_TEST);
		profesor = new Profesor();
		profesor.setNombre(PROFESOR_TEST);
		Set<Alumno> alumnos = new HashSet<>();
		alumnos.add(alumno);
		profesor.setAlumnos(alumnos);
		try {
			// Persist in database
			em.getTransaction().begin();
			em.persist(alumno);
			//em.persist(profesor);
			//em.getTransaction().commit();

			//em.getTransaction().begin();
			em.persist(profesor);
			//em.persist(profesor);
			em.getTransaction().commit();
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void persistFindProfesorTest() {
		try {
			Profesor profesorDB = em.find(Profesor.class,profesor.getId());
			Assertions.assertEquals(profesorDB.getNombre(), profesor.getNombre());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void updateProfesorTest() {
		try {
			Profesor profesorFind = em.find(Profesor.class,profesor.getId());
			Assertions.assertEquals(profesorFind.getNombre(), profesor.getNombre());
			profesorFind.setNombre(NOMBRE_UPDATE);

			// Persist in database
			em.getTransaction().begin();
			em.merge(profesorFind);
			em.getTransaction().commit();

			// Find by id
			Profesor profesorDBUpdate = em.find(Profesor.class, profesor.getId());
			Assertions.assertEquals(profesorDBUpdate.getNombre(), NOMBRE_UPDATE);
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void removeProfesor() {
		try {
			int id = this.profesor.getId();
			Profesor profesorFind = em.find(Profesor.class, id); // See file import.sql
			em.getTransaction().begin();
			em.remove(profesorFind);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Profesor profesorDB = em.find(Profesor.class, id); // See file import.sql

			Assertions.assertNull(profesorDB);

		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void closeEntityManager() {
		em.close();
		em = null;
	}

	@AfterAll
	public static void closeEntityManagerFactory() {
		emf.close();
	}

}
