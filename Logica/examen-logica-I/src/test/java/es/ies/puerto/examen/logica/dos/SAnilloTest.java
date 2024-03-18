package es.ies.puerto.examen.logica.dos;

import es.ies.puerto.examen.logica.utilidades.UtilClassTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class SAnilloTest extends UtilClassTest {
    long resultado = -1;
    static SAnillo sAnillo;

    @BeforeAll
    public static void beforeAll() {
        sAnillo = new SAnillo();
    }

    @Test
    public void pokemonErrorUnoTest(){
        long dias = sAnillo.obtenerDiasDesdeRetornoRey(null);
        Assertions.assertEquals(resultado, dias, MESSAGE_ERROR);
    }

    @Test
    public void sAnilloErrorDosTest(){
        long dias = sAnillo.obtenerDiasDesdeRetornoRey("22222/3333/2100");
        Assertions.assertEquals(resultado, dias, MESSAGE_ERROR);
    }

    @Test
    public void sAnilloTresTest(){
        resultado = 35404;
        long dias = sAnillo.obtenerDiasDesdeRetornoRey("22/11/2100");
        Assertions.assertEquals(resultado, dias, MESSAGE_ERROR);
    }

    @Test
    public void sAnilloCuatroTest(){
        String fecha = "11/03/2023";
        long resultado = 7024;
        long dias = sAnillo.obtenerDiasDesdeRetornoRey(fecha);
        Assertions.assertEquals(resultado, dias, MESSAGE_ERROR);
    }

}
