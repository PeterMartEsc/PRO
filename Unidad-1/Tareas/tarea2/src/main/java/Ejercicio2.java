
import java.util.Scanner;
/**
 * @author PeterMartEsc
 * Ejercicio numero 2
 */

/**
 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C
 * respectivamente. El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que
 * los tres valores introducidos por el teclado sean valores distintos. Presente un mensaje de alerta en caso de
 * que se detecte la introducción de valores iguales
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        int valorA, valorB, valorC;

        Scanner lectura = new Scanner (System.in);

        do {
            System.out.println("Ingrese el valor de la Variable A: ");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A = "+valorA);

            System.out.println("Ingrese el valor de la Variable B: ");
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B = "+valorB);

            System.out.println("Ingrese el valor de la Variable C: ");
            valorC = lectura.nextInt();
            System.out.println("Valor de la variable C = "+valorC);

        } while (valorA == valorB && valorB == valorC);

        if(valorA>valorB && valorA>valorC){
            System.out.println("EL valor de A es el mayor");
        } else {
            if(valorB>valorA && valorB>valorC){
                System.out.println("EL valor de B es el mayor");
            } else {
                System.out.println("El valor de C es el mayor");
            }
        }

    }
}