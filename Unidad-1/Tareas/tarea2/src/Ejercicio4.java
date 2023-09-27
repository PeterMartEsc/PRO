
import java.util.Scanner;
/**
 * @author PeterMartEsc
 * Ejercicio numero 2
 */
public class Ejercicio2 {

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {

        int valorA, valorB, valorC;

        Scanner lectura = new Scanner (System.in);

        System.out.println("Ingrese el valor de la Variable A: ");
        valorA = lectura.nextInt();
        System.out.println("Valor de la variable A = "+valorA);

        System.out.println("Ingrese el valor de la Variable B: ");
        valorB = lectura.nextInt();
        System.out.println("Valor de la variable B = "+valorB);

        System.out.println("Ingrese el valor de la Variable C: ");
        valorC = lectura.nextInt();
        System.out.println("Valor de la variable C = "+valorC);

        if(valorA>valorB && valorA>valorC);

    }
}