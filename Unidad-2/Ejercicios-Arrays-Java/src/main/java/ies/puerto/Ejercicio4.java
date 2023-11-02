package ies.puerto;

public class Ejercicio4 {

    /**
     * Funcion que muestra los numeros pares
     * @param numeros
     * @return
     */
    public static int[] numerosPares(int[] numeros) {
        int contadorPares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        int[] pares = new int[contadorPares];
        int indice = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[indice] = numero;
                indice++;
            }
        }
        return pares;
    }
}