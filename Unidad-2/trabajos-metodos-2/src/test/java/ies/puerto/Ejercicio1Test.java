package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularSueldoHorasOkTest(){

        int resultado = ejercicio1.calcularSueldoHoras(10);

        Assertions.assertEquals(100, resultado, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void calcularSueldoHoras0OkTest(){

        int resultado = ejercicio1.calcularSueldoHoras(0);

        Assertions.assertEquals(0, resultado, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void calcularSueldoHoras40OkTest(){

        int resultado = ejercicio1.calcularSueldoHoras(400);

        Assertions.assertEquals(4000, resultado, "No se ha obtenido el resultado esperado");
    }
}
