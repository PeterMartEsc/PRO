package es.ies.puerto.ejercicio.seis;

import es.ies.puerto.ejercicio.UtilClassTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BisiestoTest extends UtilClassTest {

    Bisiesto bisiesto;

    @BeforeEach
    public void beforeEach() {
        bisiesto = new Bisiesto();
    }

    @Test
    public void anio2020() {
        boolean respuesta = bisiesto.is(2020);
        Assertions.assertTrue(respuesta, MESSAGE_ERROR);
    }

    @Test
    public void anio1900() {
        boolean respuesta = bisiesto.is(1900);
        Assertions.assertFalse(respuesta, MESSAGE_ERROR);
    }

    @Test
    public void anio2000() {
        boolean respuesta = bisiesto.is(2000);
        Assertions.assertTrue(respuesta, MESSAGE_ERROR);
    }

    @Test
    public void anio2021() {
        boolean respuesta = bisiesto.is(2021);
        Assertions.assertFalse(respuesta, MESSAGE_ERROR);
    }
}
