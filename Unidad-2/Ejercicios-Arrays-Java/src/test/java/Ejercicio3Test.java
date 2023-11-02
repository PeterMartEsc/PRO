import org.example.Ejercicio2;
import org.example.Ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void promedioArrayOkTest(){

        float[] array = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float resultadoOk = 3.5f;
        float resultado = ejercicio3.promedioArray(array);

        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

}
