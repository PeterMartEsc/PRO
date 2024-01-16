package ies.puerto;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo1 {
    public static void main(String[] args) {

        System.out.println("Hola chicos, esto será un error");


        try{
            File archivo = new File("archivo.txt");
            FileReader lector = new FileReader(archivo);

        } catch(ArithmeticException exeption){
            System.out.println("Es una Exeption Aritmetic");

        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("Es una excepción FileNotFoundExceptio");
        }

    }
}