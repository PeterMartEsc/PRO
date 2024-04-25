package es.jpa.hibernate.example.entities;

import es.jpa.hibernate.example.modelo.entities.Aula;
import es.jpa.hibernate.example.modelo.implementacion.CrudAula;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AulaTest {

    public static final String NOMBRE_AULA = "NombreAula";
    static CrudAula crudAula;

    static EntityManagerFactory emf;

    Aula aula;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        crudAula = new CrudAula(emf);
    }

    @BeforeEach
    public void initEntityManager() {
        aula = new Aula();
        aula.setNombre(NOMBRE_AULA);
        crudAula.addAula(aula);
    }

    @Test
    public void findAulaTest() {
        try {
            Aula aulaFind=crudAula.getAula(aula.getId());
            Assertions.assertEquals(aula.getNombre(),aulaFind.getNombre());
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @AfterEach
    public void afterEach() {
        crudAula.deleteAula(aula);
    }
}
