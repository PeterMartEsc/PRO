package es.ies.puerto.ejercicio.tres;

import es.ies.puerto.ejercicio.UtilClassTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HechiceroTest extends UtilClassTest {
    static Hechicero hechicero;
    String texto;
    char resultado = 'X';
    char resultadoFuncion;
    @BeforeAll
    public static void beforeAll() {
        hechicero = new Hechicero();
    }

    @Test
    public void vocalMasPorderosaUnoTest() {
        texto = "Rythm";
        resultado = ' ';
        resultadoFuncion = hechicero.vocalMasPoderosa(texto);
        Assertions.assertEquals(resultadoFuncion, resultado, MESSAGE_ERROR);
    }

    @Test
    public void vocalMasPorderosaETest() {
        texto = "Este es un texto de ejemplo";
        resultado = 'e';
        resultadoFuncion = hechicero.vocalMasPoderosa(texto);
        Assertions.assertEquals(resultado,resultadoFuncion, MESSAGE_ERROR);
    }

    @Test
    public void vocalMasPorderosaOTest() {
        texto = "Hobbits y orcos en una búsqueda épica";
        resultado = 'a';
        resultadoFuncion = hechicero.vocalMasPoderosa(texto);
        Assertions.assertEquals(resultado, resultadoFuncion, MESSAGE_ERROR);
    }
}
