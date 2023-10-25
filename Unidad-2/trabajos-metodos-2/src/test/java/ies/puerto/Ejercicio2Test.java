package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void tipoNumeroOkTest(){

        int numero = -12;

        String resultado = ejercicio2.tipoNumero(numero);

        Assertions.assertEquals("El numero es negativo y par", resultado, "No se ha obtenido el resultado esperado");

    }

    @Test
    public void tipoNumeroPositivoTest(){

        int numero = 345;

        String resultado = ejercicio2.tipoNumero(345);

        Assertions.assertEquals("El numero es positivo e impar", resultado, "No se ha obtenido el resultado esperado");

    }


}
