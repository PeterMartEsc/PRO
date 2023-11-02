package ies.puerto;

public class Ejercicio5 {

    public static int encontrarPosicion(int[] arreglo, int valorABuscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorABuscar) {
                return i;
            }
        }
        return -1;
    }
}