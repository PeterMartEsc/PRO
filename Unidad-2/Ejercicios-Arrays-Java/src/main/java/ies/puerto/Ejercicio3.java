package ies.puerto;

public class Ejercicio3 {

    /**
     * Funcion que muestra el numero mayor
     * @param array lista de numeros para ver cual es el mayor de ellos
     * @return el numero mayor
     */
    public int mostrarMayor(int[] array) {

        int mayor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    /**
     * Funcion que muestra el numero menor
     * @param array lista de numeros para ver cual es el menor de ellos
     * @return el numero menor
     */
    public int mostrarMenor(int[] array) {
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
}