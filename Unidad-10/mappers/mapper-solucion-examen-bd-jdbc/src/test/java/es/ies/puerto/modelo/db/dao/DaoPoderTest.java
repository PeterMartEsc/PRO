package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Set;

public class DaoPoderTest {
    static DaoPoder daoPoder;
    final String idPoder="idPoder";
    final String nombrePoder="nombrePoder";
    final String nombrePoderUpdate="nombrePoderUpdate";
    Poder poder;

    @BeforeAll
    public static void beforeAll() {
        try {
            daoPoder = new DaoPoder();
        }catch (Exception exception) {
            Assertions.fail("Se ha producido un error:"+exception.getMessage());
        }
    }

    @BeforeEach
    public void beforeEach() {
        try {
            poder = new Poder(idPoder,nombrePoder);
            daoPoder.updatePoder(poder);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }

    @Test
    public void findAllPoderTest() {
        try {
            Set<Poder> lista = daoPoder.findAllPoder();
            Assertions.assertNotNull(lista);
            Assertions.assertTrue(lista.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findPoderTest() {
        try {
            Poder poderFind = daoPoder.findPoder(poder);
            Assertions.assertNotNull(poderFind);
            Assertions.assertEquals(poder, poderFind);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updatePoderTest() {
        try {
            Poder poderFind = daoPoder.findPoder(poder);
            Assertions.assertNotNull(poderFind);
            poderFind.setNombre(nombrePoderUpdate);
            daoPoder.updatePoder(poderFind);
            Poder poderFindUpdate = daoPoder.findPoder(poder);
            Assertions.assertNotNull(poderFindUpdate);
            Assertions.assertEquals(poderFind, poderFindUpdate);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach()  {
        try {
            daoPoder.deletePoder(poder);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }
}
