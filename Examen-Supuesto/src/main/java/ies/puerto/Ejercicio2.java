package ies.puerto;

public class Ejercicio2 {

    public void bubbleSort(int[]array){
        int tamanio = array.length;
        boolean intrcambio;

        boolean intercambio;

        do {
            intercambio = false;
            for (int i = 1; i < tamanio - 1; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i-1] = temp;
                    intercambio = true;
                }
            }
            tamanio--;
        } while (intercambio);

    }
}
