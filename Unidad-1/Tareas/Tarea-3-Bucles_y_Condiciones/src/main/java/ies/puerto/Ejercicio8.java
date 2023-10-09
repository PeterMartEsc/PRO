package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */

import java.util.Scanner;

/**
 * Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado
 */

public class Ejercicio8 {

    public static void main(String[] args) {

        int limSup;          //Se declaran las variables
        int limInf;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el valor inferior: ");
        limInf = scanner.nextInt();

        System.out.println("Introduzca el valor superior: ");
        limSup = scanner.nextInt();


        System.out.println("Se calcularán los números perfectos enteros hasta el " +limSup+ ":"); //Decimos hasta donde calculará el programa

        while(limInf <= limSup){             //Inicia el primer bucle, que hace que el proceso siguiente se repita desde 1 hasta 1000
            int sumatorio = 0;               //Declaramos la variable del sumatorio dentro del bucle, para que al acabar un ciclo, podamos reutilizarla ya que vuelve a ser 0
            for(int i=1; i<limInf ; i++){    //Iniciamos otro bucle en el cual iremos calculando los divisores de cada numero e iremos comprobando si son perfectos
                if(limInf % i == 0){         //Comprobamos si el numero es divisible
                    sumatorio += i;          //sumatorio = sumatorio + i
                }
            }
            if(sumatorio == limInf){         //Si los divisores sumados son igual al mismo numero, es un numero perfecto, así que imprimimos el numero
                System.out.println(limInf);
            }
            limInf++;                        //Aumentamos el valor del límite inferior para ir acercandonos poco a poco al superior y así acabar el programa
        }

    }
}
