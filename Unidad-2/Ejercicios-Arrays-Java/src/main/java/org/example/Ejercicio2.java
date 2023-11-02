package org.example;

public class Ejercicio2 {
    public float promedioArray (float[] array) {

        float suma = 0;

        float promedio;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        promedio = suma / array.length;

        return promedio;
    }
}