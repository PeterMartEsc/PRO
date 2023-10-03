package ies.puerto;

/**
 *
 * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos
 * entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10. Utilia un buble for y un bucle
 * while.
 */
public class Ejercicio3 {
    public static void main(String[] args){
        int suma = 0;

        for (int i=1; i <= 10; i++) {
            suma = suma + i; //suma += i;
        }
        System.out.println("Suma en bucle for:"+suma);

        suma = 0;

        int i = 0;
        while(i<=10) {
            suma += i;
            i++;
        }
        System.out.println("Suma en bucle while:"+suma);
    }

}
