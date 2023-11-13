package ies.puerto;

import java.util.Scanner;

/**
 * Programa para buscar la posición de un elemento en un array ordenado
 * @author PeterMartEsc
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Introduzca el valor a buscar en el array de tamaño 10: ");
        int valorBuscado = scanner.nextInt();

        int posicion = busquedaBinaria(array, valorBuscado);

        if (posicion != -1) {
            System.out.println("El elemento " + valorBuscado + " se encuentra en la posición " + posicion + ".");
        } else {
            System.out.println("El elemento " + valorBuscado + " no se encuentra en el array.");
        }
    }

    public static int busquedaBinaria(int[] array, int valorBuscado) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {

            int puntoMedio = (inicio + fin) / 2;

            if (array[puntoMedio] == valorBuscado) {
                return puntoMedio;

            } else if (array[puntoMedio] < valorBuscado) {
                    inicio = puntoMedio + 1;

            } else {
                    fin = puntoMedio - 1;
            }
        }

        return -1;
        }
        
}
