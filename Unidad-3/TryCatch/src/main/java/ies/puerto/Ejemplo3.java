package ies.puerto;

import java.io.File;

public class Ejemplo3 {
    public static void main(String[] args) {

        System.out.println("Hola chicos, soy el ejemplo 3");

        File archivo = new File("archivo.txt");

        System.out.println("Voy a generar un NullPointer" +archivo.getName());


    }

}

