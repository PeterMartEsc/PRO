package es.ies.puerto.logica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;
public class PalabraMasLargaTest extends LogicaTestUtls{
    static PalabraMasLarga palabraMasLarga;
    final String ESPERADO = "elefante";
    List<String> palabras = new ArrayList<>(Arrays.asList("gato", "perro", "elefante", "loro", "tigre"));

    @BeforeAll
    public static void beforeAll() {
        palabraMasLarga = new PalabraMasLarga();
    }

    @Test
    public void palabraMasLargaTradicionalNull() {
        Assertions.assertNull(palabraMasLarga.metodoTradicional(null),
                MESSAGE_ERROR);
    }

    @Test
    public void palabraMasLargaTradicionalEmpty() {
        Assertions.assertNull(palabraMasLarga.metodoTradicional(new ArrayList<>()),
                MESSAGE_ERROR);
    }

    @Test
    public void palabraMasLargaTradicional() {
        String resultado = palabraMasLarga.metodoTradicional(palabras);
        Assertions.assertEquals(ESPERADO, resultado,
                MESSAGE_ERROR);
    }

    @Test
    public void palabraMasLargaRecursivoNull() {
        Assertions.assertNull(palabraMasLarga.metodoRecursivo(null),
                MESSAGE_ERROR);
    }

    @Test
    public void palabraMasLargaRecursivoEmpty() {
        Assertions.assertNull(palabraMasLarga.metodoRecursivo(new ArrayList<>()),
                MESSAGE_ERROR);
    }

    @Test
    public void palabraMasLargaRecursivo() {
        String resultado = palabraMasLarga.metodoRecursivo(palabras);
        Assertions.assertEquals(ESPERADO, resultado,
                MESSAGE_ERROR);
    }


}
