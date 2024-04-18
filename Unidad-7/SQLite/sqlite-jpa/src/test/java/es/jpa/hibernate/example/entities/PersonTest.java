package es.jpa.hibernate.example.entities;

import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonTest {
	static EntityManagerFactory emf;
	EntityManager em;

	Person person;

	@BeforeAll
	public static void setUp() {
		emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
	}

	@BeforeEach
	public void initEntityManager() {
		em = emf.createEntityManager();
		person = new Person();
		person.setName("personTest");
		try {
			// Persist in database
			em.getTransaction().begin();
			em.persist(person);
			em.getTransaction().commit();
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testPersistFind() {
		try {
			Person personDB = em.find(Person.class, person.getId());
			Assertions.assertEquals(person.getName(), personDB.getName());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testUpdate() {
		try {
			Person personFind = em.find(Person.class, person.getId()); // See file import.sql
			personFind.setAge(22);

			// Persist in database
			em.getTransaction().begin();
			em.merge(personFind);
			em.getTransaction().commit();

			// Find by id
			Person personDBUpdate = em.find(Person.class, person.getId());
			Assertions.assertEquals(personFind.getAge(), personDBUpdate.getAge());
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void removePerson() {
		try {
			int personId = person.getId();
			Person person = em.find(Person.class, personId); // See file import.sql
			em.getTransaction().begin();
			em.remove(person);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Person personDB = em.find(Person.class, personId); // See file import.sql

			Assertions.assertNull(personDB);

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
