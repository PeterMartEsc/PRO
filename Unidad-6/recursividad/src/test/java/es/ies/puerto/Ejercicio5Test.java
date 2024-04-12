package es.ies.puerto;

import es.ies.puerto.Utilities.UtilitiesTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test extends UtilitiesTest {
    Ejercicio5 ejercicio;
    int base = 2;
    int exponente = 3;
    int resultadoEsperado = 8;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio5();
    }

    @Test
    public void potenciaTradicionalExponente0Test() {
        int resultado = ejercicio.potenciaTradicional(base, 0);
        Assertions.assertEquals(1, resultado, MESSAGE);
    }

    @Test
    public void potenciaTradicionalTest() {
       int resultado = ejercicio.potenciaTradicional(base, exponente);
        Assertions.assertEquals(resultadoEsperado, resultado, MESSAGE);
    }

    @Test
    public void potenciaRecursivoExponente0Test() {
        int resultado = ejercicio.potenciaRecursivo(base, 0);
        Assertions.assertEquals(1, resultado, MESSAGE);
    }
    @Test
    public void potenciaRecursivoTest() {
        int resultado = ejercicio.potenciaRecursivo(base, exponente);
        Assertions.assertEquals(resultadoEsperado, resultado, MESSAGE);
    }
}
