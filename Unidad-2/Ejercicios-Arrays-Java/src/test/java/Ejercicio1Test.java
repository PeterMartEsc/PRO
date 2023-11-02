import org.example.Ejercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void sumatorioArrayOkTest(){

        int[] array = {1, 2, 3, 4, 5};

        int resultadoOk = 15;

        int resultado = ejercicio1.sumatorioArray(array);

        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

}
