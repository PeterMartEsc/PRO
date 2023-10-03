
import java.util.Scanner;
/**
 * @author PeterMartEsc
 * Ejercicio numero 3
 */

/**
 * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10,
 * es decir, 1 + 2 + 3 + .... + 10.
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        int suma=0;                                     //Declaramos la variable

        Scanner lectura = new Scanner (System.in);

        for(int i=1; i<=10; i++){                       //Iniciamos el bucle
            suma = suma + i; //suma += i;
        }

        System.out.println("Suma en bucle for:"+suma);


    }
}