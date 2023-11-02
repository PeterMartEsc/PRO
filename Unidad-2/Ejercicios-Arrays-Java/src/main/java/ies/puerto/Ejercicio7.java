package ies.puerto;

import java.util.Arrays;

public class Ejercicio7 {

    public float[] ordenarNumeros(float[] numeros) {
        Arrays.sort(numeros);
        return numeros;
    }

    public float[] mostrarNumeros(float[] numeros) {
        for (float numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        return numeros;
    }
}
