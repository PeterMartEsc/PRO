package ies.puerto;

/**
 * Clase que tiene como objetivo realizar
 * @author
 */
public class Ejercicio1 {
    public static void main(String[] args) {

    }

    /**
     * Funcion que calcula el factorial de un numero
     * @param numero de entrada para el calculo
     * @return resultado de la operaación factorial
     */
    public int calcularFactorial (int numero) {

        int resultado = 1;

        for (int i=2 ; i <= numero ; i++){
            resultado = resultado*i;
        }

        return resultado;
    }

}