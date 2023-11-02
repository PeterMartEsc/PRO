import ies.puerto.Ejercicio2;
import ies.puerto.Ejercicio3;
import ies.puerto.Ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void mostrarMayorOkTest(){

        int [] array = {1, 2, 5, 3, 4, 8, 7, 6};
        int resultado0k = 8;
        int resultado = ejercicio3.mostrarMayor(array);

        Assertions.assertEquals(resultado0k, resultado, "No es el resultado esperado");
    }

    @Test
    public void mostrarMenorOkTest (){

        int [] array = {1, 2, 5, 3, 4, 8, 7, 6};
        int resultadoOk = 1;
        int resultado = ejercicio3.mostrarMenor(array);

        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

}
