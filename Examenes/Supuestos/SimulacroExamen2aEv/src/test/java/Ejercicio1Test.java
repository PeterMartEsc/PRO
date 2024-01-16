import ies.puerto.Ejercicio1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test

    public void invertirCadena(){

        String cadena = ejercicio1.invertirCadena("Feliz Navidad");

        Assertions.assertEquals("dadivaN zileF", cadena, "No es el resultado esperado");

    }



}
