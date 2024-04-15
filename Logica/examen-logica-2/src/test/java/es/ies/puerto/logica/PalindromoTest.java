package es.ies.puerto.logica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PalindromoTest extends LogicaTestUtls{
    static Palindromo palindromo;
    final String sPalindromaTrue = "Anita lava la tina";
    final String sPalindromaFalse = "Anita no lava la tina";

    @BeforeAll
    public static void beforeAll() {
        palindromo = new Palindromo();
    }

    @Test
    public void palindromoTradicionalNullTest() {
        Assertions.assertFalse(palindromo.palindromoTradicional(null));
    }

    @Test
    public void palindromoTradicionalVaciaTest() {
        Assertions.assertFalse(palindromo.palindromoTradicional(""));
    }

    @Test
    public void palindromoTradicionalOkTest() {
        Assertions.assertTrue(palindromo.palindromoTradicional(sPalindromaTrue),
                MESSAGE_ERROR);
    }
    @Test
    public void palindromoTradicionalFalseTest() {
        Assertions.assertFalse(palindromo.palindromoTradicional(sPalindromaFalse),
                MESSAGE_ERROR);
    }

    @Test
    public void palindromoRecursivoNullTest() {
        Assertions.assertFalse(palindromo.palindromoRecursivo(null));
    }

    @Test
    public void palindromoRecursivoVaciaTest() {
        Assertions.assertFalse(palindromo.palindromoRecursivo(""));
    }

    @Test
    public void palindromoRecursivoOkTest() {
        Assertions.assertTrue(palindromo.palindromoRecursivo(sPalindromaTrue),
                MESSAGE_ERROR);
    }
    @Test
    public void palindromoRecursivoFalseTest() {
        Assertions.assertFalse(palindromo.palindromoRecursivo(sPalindromaFalse),
                MESSAGE_ERROR);
    }
}
