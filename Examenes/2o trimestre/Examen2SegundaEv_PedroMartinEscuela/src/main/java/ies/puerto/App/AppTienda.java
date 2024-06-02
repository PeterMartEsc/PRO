package ies.puerto.App;

import ies.puerto.Impl.*;

import java.text.ParseException;
import java.util.Scanner;

public class AppTienda {

    static Tienda tienda = new Tienda();



    public static void main(String[] args) throws ParseException {

        menu();
    }

    public static void menu() throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el número de la acción que desee realizar: \n" +
                "1.- Añadir producto. \n" +
                "2.- Eliminar Producto. \n" +
                "3.- Modificar productos. \n" +
                "4.- Mostrar información productos. \n");
        int eleccion = scanner.nextInt();

        menuEleccion(eleccion);
    }

    public static void menuEleccion(int eleccion) throws ParseException {
        Scanner scanner2 = new Scanner(System.in);

        switch (eleccion){

            case 1:
                System.out.println("¿Que desea añadir? (Alimento/Aparato/Souvenir/CuidadoPersonal)");
                String seleccionAniadir = scanner2.nextLine();

                seleccionAniadir = seleccionAniadir.toLowerCase();

                construirProducto(seleccionAniadir);
                System.out.println("Se ha añadido el " +seleccionAniadir+ " correctamente");
                break;

            case 2:
                System.out.println("¿Que desea eliminar? (Alimento/Aparato/Souvenir/CuidadoPersonal)");
                String seleccionEliminar = scanner2.nextLine();

                seleccionEliminar = seleccionEliminar.toLowerCase();

                eliminarProducto(seleccionEliminar);
                System.out.println("Se ha eliminado el " +seleccionEliminar+" correctamente");
                break;

            case 3:
                System.out.println("¿Que desea añadir? (Alimento/Aparato/Souvenir/Cuidado Personal)");
                String seleccionModificar = scanner2.nextLine();

                seleccionModificar = seleccionModificar.toLowerCase();

                modificarProducto(seleccionModificar);
                System.out.println("El " +seleccionModificar+ " se ha modificado correctamente");
                break;

            case 4:
                System.out.println("¿Sobre que producto desea ver la información? " +
                        "(Alimento/Aparato/Souvenir/CuidadoPersonal/Todos)");
                String seleccionMostrar = scanner2.nextLine();

                seleccionMostrar = seleccionMostrar.toLowerCase();

                mostrarProducto(seleccionMostrar);
                break;

            default:
                System.out.println("Cancelando. Introduzca una opción válida");
        }
    }

    public static void construirProducto(String seleccion){
        Scanner scanner = new Scanner(System.in);

        switch (seleccion){

            case "alimento":
                System.out.println("Introduzca el nombre del alimento: ");
                String nombreAlimento = scanner.nextLine();

                System.out.println("Introduzca el precio del alimento: ");
                float precioAlimento = scanner.nextFloat();

                System.out.println("Introduzca la fecha de entrada del alimento: ");
                String fechaEntradaAlimento = scanner.nextLine();

                System.out.println("Introduzca el id del alimento: ");
                String idAlimento = scanner.nextLine();
                idAlimento = idAlimento.toUpperCase();

                System.out.println("Introduzca la fecha de caducidad del alimento: ");
                String fechaCaducidadAlimento = scanner.nextLine();

                Alimento alimento = new Alimento(nombreAlimento, precioAlimento, fechaEntradaAlimento, idAlimento, fechaCaducidadAlimento);
                tienda.addAlimento(alimento);
                break;

            case "aparato":

                System.out.println("Introduzca el nombre del aparato: ");
                String nombreAparato = scanner.nextLine();

                System.out.println("Introduzca el precio del aparato: ");
                float precioAparato = scanner.nextFloat();

                System.out.println("Introduzca la fecha de entrada del aparato: ");
                String fechaEntradaAparato = scanner.nextLine();

                System.out.println("Introduzca el id del aparato: ");
                String idAparato = scanner.nextLine();
                idAparato = idAparato.toUpperCase();

                Aparato aparato = new Aparato(nombreAparato, precioAparato, fechaEntradaAparato, idAparato);
                tienda.addAparato(aparato);
                break;

            case "souvenir":
                System.out.println("Introduzca el nombre: ");
                String nombreSouvenir = scanner.nextLine();

                System.out.println("Introduzca el precio: ");
                float precioSouvenir = scanner.nextFloat();

                System.out.println("Introduzca la fecha de entrada: ");
                String fechaSouvenir = scanner.nextLine();

                System.out.println("Introduzca el id del aparato: ");
                String idSouvenir = scanner.nextLine();
                idSouvenir = idSouvenir.toUpperCase();

                Souvenir souvenir = new Souvenir(nombreSouvenir, precioSouvenir, fechaSouvenir, idSouvenir);
                tienda.addSouvenir(souvenir);
                break;

            case "cuidado personal":
                System.out.println("Introduzca el nombre: ");
                String nombreCuidado = scanner.nextLine();

                System.out.println("Introduzca el precio: ");
                float precioCuidado = scanner.nextFloat();

                System.out.println("Introduzca la fecha de entrada: ");
                String fechaCuidado = scanner.nextLine();

                System.out.println("Introduzca el id del aparato: ");
                String idCuidado = scanner.nextLine();
                idCuidado = idCuidado.toUpperCase();

                CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(nombreCuidado, precioCuidado, fechaCuidado, idCuidado);
                tienda.addCuidadoPersonal(cuidadoPersonal);
                break;
            default:
                System.out.println("Cancelando. Introduzca una opción válida");
                break;
        }
    }

    public static void eliminarProducto(String seleccion){
        Scanner scanner = new Scanner(System.in);

        switch(seleccion){

            case "alimento":
                System.out.println("Introduzca el id del alimento: " +tienda.getAlimentos());
                String idAlimentoEliminar = scanner.nextLine();

                idAlimentoEliminar = idAlimentoEliminar.toUpperCase();

                tienda.removeAlimento(tienda.obtenerAlimento(idAlimentoEliminar));
                break;

            case "aparato":
                System.out.println("Introduzca el id del aparato: " + tienda.getAparatos());
                String idAparatoEliminar = scanner.nextLine();

                idAparatoEliminar = idAparatoEliminar.toUpperCase();

                tienda.removeAparato(tienda.obtenerAparato(idAparatoEliminar));
                break;

            case "souvenir":
                System.out.println("Introduzca el id del souvenir: " +tienda.getSouvenirs());
                String idSouvenirEliminar = scanner.nextLine();

                idSouvenirEliminar = idSouvenirEliminar.toUpperCase();

                tienda.removeSouvenir(tienda.obtenerSouvenir(idSouvenirEliminar));
                break;

            case "cuidado personal":
                System.out.println("Introduzca el nombre del producto de cuidado personal: " +tienda.getCuidadosPersonales());
                String nombreCuidadoPersonalEliminar = scanner.nextLine();

                tienda.removeCuidadoPersonal(tienda.obtenerCuidadoPersonal(nombreCuidadoPersonalEliminar));
                break;

            default:
                System.out.println("Cancelando. Introduzca un elemento valido");
                break;
        }

    }

    public static void modificarProducto(String seleccion){
        Scanner scanner = new Scanner(System.in);

        switch(seleccion){

            case "alimento":
                System.out.println("Introduzca el id del alimento a modificar: " +tienda.getAlimentos());
                String idAlimentoModificar = scanner.nextLine();

                idAlimentoModificar = idAlimentoModificar.toUpperCase();

                tienda.removeAlimento(tienda.obtenerAlimento(idAlimentoModificar));

                construirProducto(seleccion);
                System.out.println("Se ha añadido el " +seleccion+ "correctamente");
                break;


            case "aparato":
                System.out.println("Introduzca el id del aparato: " + tienda.getAparatos());
                String idAparatoModificar = scanner.nextLine();

                idAparatoModificar = idAparatoModificar.toUpperCase();

                tienda.removeAparato(tienda.obtenerAparato(idAparatoModificar));
                System.out.println("Se ha añadido el " +seleccion+ "correctamente");
                break;

            case "souvenir":
                System.out.println("Introduzca el id del souvenir: " +tienda.getSouvenirs());
                String idSouvenirModificar = scanner.nextLine();

                idSouvenirModificar = idSouvenirModificar.toUpperCase();

                tienda.removeSouvenir(tienda.obtenerSouvenir(idSouvenirModificar));
                System.out.println("Se ha añadido el " +seleccion+ "correctamente");
                break;

            case "cuidado personal":
                System.out.println("Introduzca el nombre del producto de cuidado personal: " +tienda.getCuidadosPersonales());
                String nombreCuidadoPersonalEliminar = scanner.nextLine();

                tienda.removeCuidadoPersonal(tienda.obtenerCuidadoPersonal(nombreCuidadoPersonalEliminar));

            default:
                System.out.println("Cancelando. Introduzca un elemento valido");
                break;
        }

    }

    public static void mostrarProducto(String seleccion) throws ParseException {

        switch(seleccion){

            case "alimento":
                System.out.println("En la tienda hay: " +tienda.cantidadAlimentos());
                System.out.println(tienda.getAlimentos());
                System.out.println("El precio total de los alimentos es: " +tienda.precioTotalAlimentos());
                break;

            case "aparatos":
                System.out.println("En la tienda hay: " +tienda.cantidadAparatos());
                System.out.println(tienda.getAparatos());
                System.out.println("El precio total de los aparatos es: " +tienda.precioTotalAparatos());

            case "souvenirs":
                System.out.println("En la tienda hay: " +tienda.cantidadSouvenirs());
                System.out.println(tienda.getSouvenirs());
                System.out.println("El precio total de los souvenirs es: " +tienda.precioTotalSouvenirs());

            case "cuidado personal":
                System.out.println("En la tienda hay: " +tienda.cantidadCuidadoPersonal());
                System.out.println(tienda.getCuidadosPersonales());
                System.out.println("El precio total de los productos de cuidado personal es: " +tienda.precioTotalCuidadoPersonal());

            case "todos":
                System.out.println(tienda);
                System.out.println("El precio total de los alimentos es: " +tienda.precioTotalTienda());

            default:
                System.out.println("Cancelando. Introduzca una opción válida");
        }

    }

}
