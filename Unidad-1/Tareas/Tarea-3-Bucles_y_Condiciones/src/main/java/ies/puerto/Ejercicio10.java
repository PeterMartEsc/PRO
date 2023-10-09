package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */

/**
 * Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario
 *  utilizando un bucle do-while.
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroMax;
        int sumaPares = 0;
        int numeroActual = 2;  // Empezamos desde el primer número par (2)

        System.out.print("Ingrese un número: ");
        numeroMax = scanner.nextInt();


        do {                                // Uso un bucle do-while para sumar los números pares

            sumaPares += numeroActual;      //sumaPares = sumaPares + numeroActual

            numeroActual += 2;              // Incrementamos en 2 para obtener el siguiente número par

        } while (numeroActual <= numeroMax);

        System.out.println("La suma de los números pares entre 1 y " + numeroMax + " es: " + sumaPares);

    }
}