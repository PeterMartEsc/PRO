package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */

/**
 * Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
 * El día a verificar se debe de pedir por teclado.
 */

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");         // Solicitar al usuario que ingrese un número
        int numero = scanner.nextInt();


        String nombreDia;                                           // Utilizamos una estructura switch para determinar el nombre del día
        switch (numero) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Este día de la semana no existe";
        }

        // Imprimir el nombre del día correspondiente
        System.out.println("El día correspondiente es: " + nombreDia);
    }
}
