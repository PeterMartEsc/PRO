package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3;
    @BeforeEach
    public void before() {
        ejercicio3 = new Ejercicio3();
    }

    @Test
    public void calcularCuadradoTest() {
        int ladoA = 3;
        int ladoB = 4;
        double resultadoOk = 0;
        double resultado = ejercicio3.areaCuadrado(ladoA);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void calcularRectanguloTest() {
        int ladoA = 3;
        int ladoB = 4;
        double resultadoOk = 0;
        double resultado = ejercicio3.areaRectangulo(ladoA,ladoA);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
}