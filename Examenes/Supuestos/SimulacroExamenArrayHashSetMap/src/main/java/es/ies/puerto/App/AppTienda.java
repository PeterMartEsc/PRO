package es.ies.puerto.App;

import es.ies.puerto.Abstractas.ProductoAbstracta;
import es.ies.puerto.Productos.Alimento;
import es.ies.puerto.Productos.Electronica;
import es.ies.puerto.Productos.Souvenir;
import es.ies.puerto.Productos.Supermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AppTienda {

    static Supermercado supermercado;

    static HashSet<Alimento> alimentos;

    static Alimento alimento1;
    static Alimento alimento2;
    static Alimento alimento3;
    static Alimento alimento4;
    static Alimento alimento5;
    static Alimento alimento6;
    static Alimento alimento7;
    static Alimento alimento8;
    static Alimento alimento9;
    static Alimento alimento10;

    static ArrayList<Electronica> electronicas;

    static Electronica electronica1;
    static Electronica electronica2;
    static Electronica electronica3;
    static Electronica electronica4;
    static Electronica electronica5;
    static Electronica electronica6;
    static Electronica electronica7;
    static Electronica electronica8;
    static Electronica electronica9;
    static Electronica electronica10;

    static HashMap<String, Souvenir> souvenirs;

    static Souvenir souvenir1;
    static Souvenir souvenir2;
    static Souvenir souvenir3;
    static Souvenir souvenir4;
    static Souvenir souvenir5;
    static Souvenir souvenir6;
    static Souvenir souvenir7;
    static Souvenir souvenir8;
    static Souvenir souvenir9;
    static Souvenir souvenir10;

    public static void main(String[] args) {

        iniciarVariables();

        aniadirAlimentos();
        aniadirElectronicas();
        aniadirSouvenirs();

        menu();
    }

    public static  void iniciarVariables(){

        supermercado = new Supermercado();

        alimentos = new HashSet<>();
        alimento1 = new Alimento("Alimento1",2.50f,"2024-01-01","udi1");
        alimento2 = new Alimento("Alimento2",3.50f,"2024-01-02","udi2");
        alimento3 = new Alimento("Alimento3",4.50f,"2024-01-03","udi3");
        alimento4 = new Alimento("Alimento4",2.50f,"2024-01-01","udi1");
        alimento5 = new Alimento("Alimento5",2.50f,"2024-01-01","udi1");
        alimento6 = new Alimento("Alimento6",2.50f,"2024-01-01","udi1");
        alimento7 = new Alimento("Alimento7",2.50f,"2024-01-01","udi1");
        alimento8 = new Alimento("Alimento8",2.50f,"2024-01-01","udi1");
        alimento9 = new Alimento("Alimento9",2.50f,"2024-01-01","udi1");
        alimento10 = new Alimento("Alimento2",2.50f,"2024-01-01","udi1");


        electronicas = new ArrayList<>();

        souvenirs = new HashMap<>();

    }

    public static void aniadirAlimentos(){

        alimentos.add(alimento1);
        alimentos.add(alimento2);
        alimentos.add(alimento3);
        alimentos.add(alimento4);
        alimentos.add(alimento5);
        alimentos.add(alimento6);
        alimentos.add(alimento7);
        alimentos.add(alimento8);
        alimentos.add(alimento9);
        alimentos.add(alimento10);

        supermercado.setAlimentos(alimentos);
    }

    public static void aniadirElectronicas(){

        electronicas.add(electronica1);
        electronicas.add(electronica2);
        electronicas.add(electronica3);
        electronicas.add(electronica4);
        electronicas.add(electronica5);
        electronicas.add(electronica6);
        electronicas.add(electronica7);
        electronicas.add(electronica8);
        electronicas.add(electronica9);
        electronicas.add(electronica10);

        supermercado.setElectronicas(electronicas);
    }

    public static void aniadirSouvenirs(){

        souvenirs.put(souvenir1.getUdi(), souvenir1);
        souvenirs.put(souvenir2.getUdi(), souvenir2);
        souvenirs.put(souvenir3.getUdi(), souvenir3);
        souvenirs.put(souvenir4.getUdi(), souvenir4);
        souvenirs.put(souvenir5.getUdi(), souvenir5);
        souvenirs.put(souvenir6.getUdi(), souvenir6);
        souvenirs.put(souvenir7.getUdi(), souvenir7);
        souvenirs.put(souvenir8.getUdi(), souvenir8);
        souvenirs.put(souvenir9.getUdi(), souvenir9);
        souvenirs.put(souvenir10.getUdi(), souvenir10);

        supermercado.setSouvenirs(souvenirs);
    }

    public static void menu(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el valor correspondiente a la acción que quiera realizar: " +
                "1.- Añadir Producto" +
                "2.- Mostrar Producto" +
                "3.- Eliminar Producto" +
                "4.- Modificar Producto");
        int seleccion = scanner.nextInt();

        switch (seleccion){

            case 1:

                System.out.println("¿Que producto desea añadir?: (Alimento/Electronica/Souvenir)");
                String tipoAniadir = scanner.nextLine();

                tipoAniadir = tipoAniadir.toLowerCase();

                aniadirProducto(tipoAniadir);
                System.out.println("El producto ha sido añadido");
                break;

            case 2:

                System.out.println("¿Que producto desea ver?: (Alimento/Electronica/Souvenir)");
                String tipoMostra = scanner.nextLine();

                tipoMostra = tipoMostra.toLowerCase();

                mostrarProducto(tipoMostra);
                break;

            case 3:

                System.out.println("¿Que producto desea eliminar?: (Alimento/Electronica/Souvenir)");
                String tipoEliminar = scanner.nextLine();

                tipoEliminar = tipoEliminar.toLowerCase();

                eliminarProducto(tipoEliminar);
                break;

            case 4:

                System.out.println("¿Que producto desea modificar?: (Alimento/Electronica/Souvenir)");
                String tipoModificar = scanner.nextLine();

                tipoModificar = tipoModificar.toLowerCase();

                modificarProducto(tipoModificar);
                break;

            default:
                System.out.println("Cancelando. Introduzca una opcion valida");
        }

    }

    public static void aniadirProducto(String producto){

        switch(producto){

            case "alimento":
                Alimento alimento = (Alimento) especificacionesProducto(producto);
                supermercado.addAlimento(alimento);
                break;

            case "electronica":
                Electronica electronica = (Electronica) especificacionesProducto(producto);
                supermercado.addElectronica(electronica);
                break;

            case "souvenir":
                Souvenir souvenir = (Souvenir) especificacionesProducto(producto);
                supermercado.addSouvenir(souvenir);
                break;

            default:
                System.out.println("Cancelando. Introduzca una opción valida");
        }

    }

    public static ProductoAbstracta especificacionesProducto(String producto){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre del " + producto + ":");
        String nombre = scanner.nextLine();

        System.out.println("Modelo de " + producto + ":");
        float precio = scanner.nextFloat();

        System.out.println("Matricula de " + producto + ":");
        String fechaEntrada = scanner.nextLine();

        System.out.println("Velocidad del vehiculo: " );
        String udi = scanner.nextLine();

        switch (producto){

            case "alimento":
                Alimento alimento = new Alimento(nombre, precio, fechaEntrada, udi);

                if()
        }

    }

    public static void mostrarProducto(String tipoMostra){

    }
}
