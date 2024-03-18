package es.ies.puerto.examen.logica.cuatro;

import es.ies.puerto.examen.logica.utilidades.UtilClassTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PergaminoTest extends UtilClassTest {
    Pergamino pergamino;
    Object[] resultado;

    @BeforeEach
    public void beforeEach() {
        pergamino = new Pergamino();
        resultado = new Object[4];
    }


    @Test
    public void pergamitoPalabraTest() {
        String texto = "Hola";
        resultado = pergamino.analizador(texto);

        Assertions.assertEquals(1, resultado[0],MESSAGE_ERROR);
        Assertions.assertEquals(4.0, resultado[1],MESSAGE_ERROR);
        Assertions.assertEquals(1, resultado[2],MESSAGE_ERROR);
        Assertions.assertEquals("Hola", resultado[3],MESSAGE_ERROR);
    }

    @Test
    public void pergamitoNormalTest() {
        String texto = "Este es un ejemplo de texto. Con varias oraciones y palabras.";
        resultado = pergamino.analizador(texto);

        Assertions.assertEquals(11, resultado[0],MESSAGE_ERROR);
        Assertions.assertEquals(4.636363636363637, resultado[1],MESSAGE_ERROR);
        Assertions.assertEquals(2, resultado[2],MESSAGE_ERROR);
        Assertions.assertEquals("oraciones", resultado[3],MESSAGE_ERROR);
    }

    @Test
    public void pergamitoTextoNuloTest() {
        String texto = "";
        resultado = pergamino.analizador(texto);

        Assertions.assertEquals(0, resultado[0],MESSAGE_ERROR);
        Assertions.assertEquals(0, resultado[1],MESSAGE_ERROR);
        Assertions.assertEquals(0, resultado[2],MESSAGE_ERROR);
        Assertions.assertNull(resultado[3],MESSAGE_ERROR);
    }
}
