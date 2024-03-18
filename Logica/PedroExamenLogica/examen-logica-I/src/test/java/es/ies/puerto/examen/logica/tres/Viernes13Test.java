package es.ies.puerto.examen.logica.tres;

import es.ies.puerto.examen.logica.utilidades.UtilClassTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class Viernes13Test extends UtilClassTest {
    Viernes13 viernes13;
    Calendar calendar;
    boolean resultado;
    @BeforeEach
    public void beforeEach(){
        viernes13 = new Viernes13();
        calendar = Calendar.getInstance();
        resultado = false;
    }
    @Test
    public void test13Septiembre2024th() {
        calendar.set(2024, Calendar.SEPTEMBER, 13);
        resultado = viernes13.esElFinDelMundo(calendar.getTime());
        Assertions.assertTrue(resultado, MESSAGE_ERROR);
    }

    @Test
    public void test12Enero2024th() {
        calendar.set(2024, Calendar.JANUARY, 12);
        resultado = viernes13.esElFinDelMundo(calendar.getTime());
        Assertions.assertFalse(resultado, MESSAGE_ERROR);
    }


    @Test
    public void test16Enero2024th() {
        calendar.set(2024, Calendar.JANUARY, 6);
        resultado = viernes13.esElFinDelMundo(calendar.getTime());
        Assertions.assertFalse(resultado, MESSAGE_ERROR);
    }

    @Test
    public void testDiaNull() {
        resultado = viernes13.esElFinDelMundo(null);
        Assertions.assertFalse(resultado, MESSAGE_ERROR);
    }
}
