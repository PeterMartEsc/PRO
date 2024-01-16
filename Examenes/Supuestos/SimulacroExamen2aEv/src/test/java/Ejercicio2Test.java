import ies.puerto.Ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test

    public void contarVocalesOk(){

        int cadena = ejercicio2.contadorVocales("Feliz Navidad");

        Assertions.assertEquals(5, cadena, "No es el resultado esperado");
    }
}
