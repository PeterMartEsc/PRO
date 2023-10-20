package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularFactorialTestOK() {

        int resultado = 0;
        int resultadoCorrecto = 120;

        resultado = ejercicio1.calcularFactorial(5);
        Assertions.assertEquals(120, resultado, "No es el resultado esperado");

    }
}
