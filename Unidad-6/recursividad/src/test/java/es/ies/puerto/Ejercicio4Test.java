package es.ies.puerto;

import es.ies.puerto.Utilities.UtilitiesTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4Test extends UtilitiesTest {
    Ejercicio4 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio4();
    }

    @Test
    public void ejercicio1TradicionalTest() {
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(0,2,4,6,8,10));
        Assertions.assertEquals(resultadoEsperado, ejercicio.numerosParesTradicional(10), MESSAGE);
    }

    @Test
    public void ejercicio1RecursivoTest() {
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(10,8,6,4,2,0));
        Assertions.assertEquals(resultadoEsperado, ejercicio.numerosParesRecursivo(10), MESSAGE);
    }
}
