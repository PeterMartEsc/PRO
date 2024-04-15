package es.ies.puerto.logica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DigitosTest extends LogicaTestUtls {
    static Digitos digitos;
    int resultado123 = 6;

    @BeforeAll
    public static void beforeAll() {
        digitos = new Digitos();
    }

    @Test
    public void sumaTradicional0Test() {
        int resultado = digitos.sumaTradicional(0);
        Assertions.assertEquals(0, resultado, MESSAGE_ERROR);
    }


    @Test
    public void sumaTradicional5Test() {
        int resultado5 = 5;
        int resultado = digitos.sumaTradicional(5);
        Assertions.assertEquals(resultado5, resultado, MESSAGE_ERROR);
    }

    @Test
    public void sumaTradicional123Test() {
        int resultado = digitos.sumaTradicional(123);
        Assertions.assertEquals(resultado123, resultado, MESSAGE_ERROR);
    }

    @Test
    public void sumaRecursivo0Test() {
        int resultado = digitos.sumaRecursiva(0);
        Assertions.assertEquals(0, resultado, MESSAGE_ERROR);
    }

    @Test
    public void sumaRecursiva5Test() {
        int resultado5 = 5;
        int resultado = digitos.sumaRecursiva(5);
        Assertions.assertEquals(resultado5, resultado, MESSAGE_ERROR);
    }

    @Test
    public void sumaRecursivo123Test() {
        int resultado = digitos.sumaRecursiva(123);
        Assertions.assertEquals(resultado123, resultado, MESSAGE_ERROR);
    }
}
