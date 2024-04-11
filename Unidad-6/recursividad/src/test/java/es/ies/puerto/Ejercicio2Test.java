package es.ies.puerto;

import es.ies.puerto.Utilities.UtilitiesTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2Test extends UtilitiesTest {
    Ejercicio2 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio2();
    }

    @Test
    public void ejercicio1Test() {
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,0));
        List<Integer> resultado;
        resultado = ejercicio.cuentaDescencenteTradicional(10);
        Assertions.assertEquals(resultadoEsperado, resultado, MESSAGE);
    }

    @Test
    public void ejercicio1RecursivaTest() {
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,0));
        List<Integer> resultado;
        resultado = ejercicio.cuentaDescencenteRecursiva(10);
        Assertions.assertEquals(resultadoEsperado, resultado, MESSAGE);
    }
}
