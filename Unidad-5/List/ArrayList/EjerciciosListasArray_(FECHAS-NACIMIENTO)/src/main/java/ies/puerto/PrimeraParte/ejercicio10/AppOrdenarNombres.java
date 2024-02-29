package ies.puerto.PrimeraParte.ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppOrdenarNombres {

    static Scanner scanner = new Scanner(System.in);
    static List<String> listaNombres = new ArrayList<>();

    public static void main(String[] args) {

        boolean exit=false;

        do{
            System.out.println("Introduzca los nombres deseados. Para salir introduzca 'exit': ");
            String nombre = scanner.nextLine();
            listaNombres.add(nombre);

            if(nombre.equals("exit")) {
                listaNombres.remove("exit");
                exit=true;
            }

        } while (!exit);

        System.out.println(listaNombres);

        //listaNombres.sort();

    }
}
