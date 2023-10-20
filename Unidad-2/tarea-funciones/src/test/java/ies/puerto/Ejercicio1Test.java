package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1;
    @BeforeEach
    public void before() {
        ejercicio1 = new Ejercicio1();
    }

    @Test
    public void calcularAreaTriangulo() {
        int base = 2;
        int altura = 3;
        int resultado = ejercicio1.areaTriangulo(base, altura);
        Assertions.assertEquals(resultado, 3, "No se ha obtenido el resultado esperado");
    }

}