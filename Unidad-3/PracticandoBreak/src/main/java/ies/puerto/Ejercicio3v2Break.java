package ies.puerto;

public class Ejercicio3v2Break {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numeroBuscado = 7;

        for (int num : numeros) {
            System.out.println("Revisando número: " + num);

            if (num == numeroBuscado) {
                System.out.println("Número encontrado. Saliendo del bucle.");
                break;  // Sale del bucle cuando encuentra el número buscado.
            }
        }
    }
}
