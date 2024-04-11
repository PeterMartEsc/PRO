package es.ies.puerto;

import es.ies.puerto.Utilities.UtilitiesTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test extends UtilitiesTest {
    Ejercicio3 ejercicio;
    int resultadoEsperado = 55;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio3();
    }

    @Test
    public void ejercicio1TradicionaTest() {
        Assertions.assertEquals(resultadoEsperado, ejercicio.sumaNumerosTradicional(10), MESSAGE);
    }

    @Test
    public void ejercicio1RecursivoTest() {
        Assertions.assertEquals(resultadoEsperado, ejercicio.sumaNumerosRecursivo(10), MESSAGE);
    }
}
