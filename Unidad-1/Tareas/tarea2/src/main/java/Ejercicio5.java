
import java.util.Scanner;
/**
 * @author PeterMartEsc
 * Ejercicio numero 2
 */
public class Ejercicio5 {

    /**
     * Descripcion del algoritmo
     * @param comparar 3 numeros y ver cual es el mayor
     */
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