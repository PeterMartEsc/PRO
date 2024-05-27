package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.entidades.Personaje;
import org.junit.jupiter.api.*;

import java.util.Set;

public class DaoPersonajeTest {
    static DaoPersonaje daoPersonaje;
    final String idPersonaje="idPersonaje";
    final String nombrePersonaje="nombrePersonaje";
    final String generoPersonaje="nombrePersonaje";


    final String nombrePersonajeUpdate="nombrePersonajeUpdate";
    Personaje personaje;

    @BeforeAll
    public static void beforeAll() {
        try {
            daoPersonaje = new DaoPersonaje();
        }catch (Exception exception) {
            Assertions.fail("Se ha producido un error:"+exception.getMessage());
        }
    }

    @BeforeEach
    public void beforeEach() {
        try {
            personaje = new Personaje(idPersonaje,
                    nombrePersonaje,
                    generoPersonaje,null,null,null);
            daoPersonaje.updatePersonaje(personaje);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }

    @Test
    public void findAllPersonajeTest() {
        try {
            Set<Personaje> lista = daoPersonaje.findAllPersonaje();
            Assertions.assertNotNull(lista);
            Assertions.assertTrue(lista.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findPersonajeTest() {
        try {
            Personaje PersonajeFind = daoPersonaje.findPersonaje(personaje);
            Assertions.assertNotNull(PersonajeFind);
            Assertions.assertEquals(personaje, PersonajeFind);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updatePersonajeTest() {
        try {
            Personaje PersonajeFind = daoPersonaje.findPersonaje(personaje);
            Assertions.assertNotNull(PersonajeFind);
            PersonajeFind.setNombre(nombrePersonajeUpdate);
            daoPersonaje.updatePersonaje(PersonajeFind);
            Personaje PersonajeFindUpdate = daoPersonaje.findPersonaje(personaje);
            Assertions.assertNotNull(PersonajeFindUpdate);
            Assertions.assertEquals(PersonajeFind, PersonajeFindUpdate);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach()  {
        try {
            daoPersonaje.deletePersonaje(personaje);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }
}
