
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

        int valorA, valorB, valorC;     //Declaramos las variables

        Scanner lectura = new Scanner (System.in);

        do {                                                                             //Iniciamos el bucle
            System.out.println("Ingrese el valor de la Variable A: ");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A = "+valorA);

            System.out.println("Ingrese el valor de la Variable B: ");                  //Pedimos al usuario que almacene el valor de las variables
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B = "+valorB);

            System.out.println("Ingrese el valor de la Variable C: ");
            valorC = lectura.nextInt();
            System.out.println("Valor de la variable C = "+valorC);

            if((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {       //Ponemos que si hay valores iguakles, repita el proceso
                System.out.println("Dos o más valores son iguales");
            }

        } while ((valorA == valorB) || (valorA == valorC) || (valorB == valorC));

        if(valorA>valorB && valorA>valorC){                                            //Especificamos cada resultado del programa
                System.out.println("EL valor de A es el mayor");
                if(valorC<valorB){
                System.out.println("El valor C es el menor");
                } else
                    System.out.println("Valor B es el menor");

        } else if(valorB>valorA && valorB>valorC){
                System.out.println("El valor de B es el mayor");
                if(valorA<valorC){
                    System.out.println("El valor A es el menor");
                } else
                    System.out.println("Valor C es el menor");

        } else {
                System.out.println("El valor de C es el mayor");
                if(valorA<valorB){
                    System.out.println("El valor A es el menor");
                } else
                    System.out.println("Valor B es el menor");
        }
    }
}