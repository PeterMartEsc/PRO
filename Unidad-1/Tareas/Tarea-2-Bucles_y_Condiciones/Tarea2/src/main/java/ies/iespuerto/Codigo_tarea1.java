package ies.iespuerto;

/**
 * @author PeterMartEsc
 * Entrega num 2
 */

/**
 * El ejercicio consiste en escribir un programa que encuentre e imprima todos los números perfectos en un rango dado (por ejemplo, entre 1 y 1000).
 */

public class Codigo_tarea1 {

    public static void main(String[] args) {

    int limSup = 1000;          //Se declaran las variables
    int limInf = 1;


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