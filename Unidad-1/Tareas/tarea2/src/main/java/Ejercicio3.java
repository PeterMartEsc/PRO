
import java.util.Scanner;
/**
 * @author PeterMartEsc
 * Ejercicio numero 2
 */

/**
 * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10,
 * es decir, 1 + 2 + 3 + .... + 10.
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        int suma=0;

        Scanner lectura = new Scanner (System.in);

        for(int i=1; i<=10; i++){
            suma = suma + i; //suma += i;
        }
        System.out.println("Suma en bucle for:"+suma);


    }
}