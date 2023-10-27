package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularSueldoHorasOkTest(){
        float resultado = ejercicio1.calcularSueldoHoras(10);
        Assertions.assertEquals(100, resultado, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void calcularSueldoHoras0OkTest(){
        float resultado = ejercicio1.calcularSueldoHoras(0.5f);
        Assertions.assertEquals(5, resultado, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void calcularSueldoHoras40OkTest(){
        float resultado = ejercicio1.calcularSueldoHoras(405);
        Assertions.assertEquals(4050, resultado, "No se ha obtenido el resultado esperado");
    }
}
