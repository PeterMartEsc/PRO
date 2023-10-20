package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2;
    @BeforeEach
    public void before() {
        ejercicio2 = new Ejercicio2();
    }

    @Test
    public void calcularCirculo() {
        int radio = 3;
        double resultadoOk = 0;
        double resultado = ejercicio2.areaCirculo(radio);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
}