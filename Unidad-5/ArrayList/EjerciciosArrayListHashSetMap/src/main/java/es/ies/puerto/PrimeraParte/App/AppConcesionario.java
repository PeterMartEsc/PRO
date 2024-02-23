package es.ies.puerto.PrimeraParte.App;

import es.ies.puerto.PrimeraParte.Abstractas.VehiculoAbstracta;
import es.ies.puerto.PrimeraParte.vehiculos.Coche;
import es.ies.puerto.PrimeraParte.vehiculos.Concesionario;
import es.ies.puerto.PrimeraParte.vehiculos.Motocicleta;
import es.ies.puerto.SegundaParte.vehiculos.Bicicleta;
import es.ies.puerto.SegundaParte.vehiculos.Camion;

import java.util.*;

public class AppConcesionario {
    static Concesionario concesionario;
    static HashSet<Coche> coches;
    static Coche coche1;
    static Coche coche2;
    static Coche coche3;
    static Coche coche4;
    static Coche coche5;
    static List<Motocicleta> motocicletas;
    static Motocicleta motocicleta1;
    static Motocicleta motocicleta2;
    static Motocicleta motocicleta3;
    static Motocicleta motocicleta4;
    static Motocicleta motocicleta5;

    static HashMap<String, Camion> camiones;
    static Camion camion1;
    static Camion camion2;
    static Camion camion3;
    static Camion camion4;
    static Camion camion5;

    static HashMap<String, Bicicleta> bicicletas;
    static Bicicleta bicicleta1;
    static Bicicleta bicicleta2;
    static Bicicleta bicicleta3;
    static Bicicleta bicicleta4;
    static Bicicleta bicicleta5;

    public static void main(String[] args) {

        iniciarVariables();

        aniadirCoches();
        aniadirMotocicletas();
        aniadirCamiones();
        aniadirBicicletas();

        menu();
    }

    public static void iniciarVariables(){

        concesionario = new Concesionario();

        coches = new HashSet<>();
        coche1 = new Coche("Toyota","Corolla","ABC123",60);
        coche2 = new Coche("Honda","Civic","XYZ789",75);
        coche3 = new Coche("Ford","Mustang","DEF456",100);
        coche4 = new Coche("Chevrolet","Impala","GHI789",80);
        coche5 = new Coche("Volkswagen","Golf","JKL012",65);

        motocicletas = new ArrayList<>();
        motocicleta1 = new Motocicleta("Harley-Davidson","Sportster","MNO345",50);
        motocicleta2 = new Motocicleta("Yamaha","YZF R6","PQR678",90);
        motocicleta3 = new Motocicleta("Ducati","Monster","STU901",70);
        motocicleta4 = new Motocicleta("Suzuki","GSX-R750","VWX234",80);
        motocicleta5 = new Motocicleta("Kawasaki","Ninja","ZAB567",85);

        camiones = new HashMap<>();
        camion1 = new Camion("Chevrolet","Silverado","UVW567",150);
        camion2 = new Camion("Ford","Ranger","LMN890",130);
        camion3 = new Camion("Toyota","Hilux","PQR123",140);
        camion4 = new Camion("Nissan","Navara","ABC456",145);
        camion5 = new Camion("Dodge","Ram","XYZ789",160);

        bicicletas = new HashMap<>();
        bicicleta1 = new Bicicleta("Trek","MountainBike","PQR456",30);
        bicicleta2 = new Bicicleta("Giant","CityBike","MNO789",25);
        bicicleta3 = new Bicicleta("Specialized","RoadBike","JKL012",28);
        bicicleta4 = new Bicicleta("Cannondale","HybridBike","DEF345",26);
        bicicleta5 = new Bicicleta("Schwinn","Cruiser","MNO678",22);

    }

    public static void aniadirCoches(){
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);

        concesionario.setCoches(coches);
    }

    public static void aniadirMotocicletas(){
        motocicletas.add(motocicleta1);
        motocicletas.add(motocicleta2);
        motocicletas.add(motocicleta3);
        motocicletas.add(motocicleta4);
        motocicletas.add(motocicleta5);

        concesionario.setMotocicletas(motocicletas);
    }

    public static void aniadirCamiones(){
        camiones.put(camion1.getMatricula(), camion1);
        camiones.put(camion2.getMatricula(), camion2);
        camiones.put(camion3.getMatricula(), camion3);
        camiones.put(camion4.getMatricula(), camion4);
        camiones.put(camion5.getMatricula(), camion5);

        concesionario.setCamiones(camiones);
    }

    public static void aniadirBicicletas(){
        bicicletas.put(bicicleta1.getMatricula(), bicicleta1);
        bicicletas.put(bicicleta2.getMatricula(), bicicleta2);
        bicicletas.put(bicicleta3.getMatricula(), bicicleta3);
        bicicletas.put(bicicleta4.getMatricula(), bicicleta4);
        bicicletas.put(bicicleta5.getMatricula(), bicicleta5);

        concesionario.setBicicletas(bicicletas);
    }

    public static void menu(){
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Seleccione el número de la acción que desee realizar: ");
        System.out.println("1.- Añadir Vehiculo.");
        System.out.println("2.- Mostrar Vehiculo.");
        System.out.println("3.- Eliminar Vehiculo.");
        System.out.println("4.- Modificar Vehiculo.");
        System.out.println("5.- Velocidad media vehiculos.");System.out.println();

        int seleccion = scanner1.nextInt();

        menuSeleccion(seleccion);
    }

    public static void menuSeleccion(int seleccion){
        Scanner scanner2 = new Scanner(System.in);

        switch (seleccion) {

            case 1:

                System.out.println("Que tipo de vehiculo desea añadir? (Coche/Camion/Motocicleta/Bicicleta)");
                String vehiculoAniadir = scanner2.nextLine();

                vehiculoAniadir = vehiculoAniadir.toLowerCase();

                seleccionarAniadir(vehiculoAniadir);

                System.out.println("El " + vehiculoAniadir + " ha sido añadido");
                break;

            case 2:

                System.out.println("Que vehiculo desea ver? (Coche/Camion/Motocicleta/Bicicleta/Todos)");
                String vehiculoMostrar = scanner2.nextLine();

                vehiculoMostrar = vehiculoMostrar.toLowerCase();

                seleccionarMostrar(vehiculoMostrar);
                break;

            case 3:

                System.out.println("Que tipo de vehiculo desea eliminar? (Coche/Camion/Motocicleta/Bicicleta)");
                String vehiculoEliminar = scanner2.nextLine();

                vehiculoEliminar = vehiculoEliminar.toLowerCase();

                seleccionarEliminar(vehiculoEliminar);
                break;

            case 4:

                System.out.println("Que tipo vehiculo desea modificar? (Coche/Camion/Motocicleta/Bicicleta)");
                String vehiculoModificar = scanner2.nextLine();

                vehiculoModificar = vehiculoModificar.toLowerCase();

                seleccionarModificar(vehiculoModificar);
                break;

            case 5:

                System.out.println("De que tipo de vehiculo desea ver la velocidad media?" +
                        " (Coche/Camion/Motocicleta/Bicicleta/Todos)");

                String vehiculoVelocidad = scanner2.nextLine();

                vehiculoVelocidad = vehiculoVelocidad.toLowerCase();

                seleccionarVelocidad(vehiculoVelocidad);
                break;

            default:
                System.out.println("Cancelando. Seleccione una opcion valida");
                break;

        }

    }

    public static void seleccionarAniadir(String vehiculo) {

        switch (vehiculo) {

            case "coche":

                Coche coche = (Coche) especificacionesVehiculo(vehiculo);
                concesionario.addCoche(coche);
                break;

            case "motocicleta":

                Motocicleta motocicleta = (Motocicleta) especificacionesVehiculo(vehiculo);
                concesionario.addMotocicleta(motocicleta);
                break;

            case "camion":

                Camion camion = (Camion) especificacionesVehiculo(vehiculo);
                concesionario.addCamion(camion);
                break;

            case "bicicleta":

                Bicicleta bicicleta = (Bicicleta) especificacionesVehiculo(vehiculo);
                concesionario.addBicicleta(bicicleta);
                break;

            default:

                System.out.println("Cancelando. Seleccione una opcion valida");
                break;
        }
    }

    public static VehiculoAbstracta especificacionesVehiculo (String vehiculo) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Marca de " + vehiculo + ":");
        String marca = scanner.nextLine();

        System.out.println("Modelo de " + vehiculo + ":");
        String modelo = scanner.nextLine();

        System.out.println("Matricula de " + vehiculo + ":");
        String matricula = scanner.nextLine();

        System.out.println("Velocidad del vehiculo: " );
        int velocidad = scanner.nextInt();

        switch (vehiculo) {

            case "coche":

                Coche coche = new Coche(marca, modelo, matricula, velocidad);

                if (velocidad > coche.velocidadMaxima()) {
                    coche.setVelocidad(coche.velocidadMaxima());
                }

                return coche;

            case "motocicleta":

                Motocicleta motocicleta = new Motocicleta(marca, modelo, matricula, velocidad);

                if (velocidad > motocicleta.velocidadMaxima()) {
                    motocicleta.setVelocidad(motocicleta.velocidadMaxima());
                }

                return motocicleta;

            case "camion":

                Camion camion = new Camion(marca, modelo, matricula, velocidad);

                if (velocidad > camion.velocidadMaxima()) {
                    camion.setVelocidad(camion.velocidadMaxima());
                }

                return camion;

            case "bicicleta":

                Bicicleta bicicleta = new Bicicleta(marca, modelo, matricula, velocidad);

                if (velocidad > bicicleta.velocidadMaxima()) {

                    bicicleta.setVelocidad(bicicleta.velocidadMaxima());
                }

                return bicicleta;
        }

        return null;
    }

    public static void  seleccionarMostrar(String vehiculo) {

        switch (vehiculo) {

            case "coche":

                System.out.println("Lista de coches: " +concesionario.getCoches());
                break;

            case "motocicleta":

                System.out.println("Lista de motocicletas: " +concesionario.getMotocicletas());
                break;

            case "camion":

                System.out.println("Lista de camiones: " +concesionario.getCamiones());
                break;

            case "bicicleta":

                System.out.println("Lista de bicicletas: " + concesionario.getBicicletas());
                break;

            default:

                System.out.println("Cancelando. Seleccione una opcion valida");
                break;
        }
    }

    public static void seleccionarEliminar(String vehiculo){
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Introduzca la matricula del vehiculo a eliminar: \n" +concesionario);
        String matricula = scanner3.nextLine();

        matricula = matricula.toUpperCase();

        switch (vehiculo){

            case "coche":

                Coche coche =  new Coche(matricula);

                if(!concesionario.getCoches().contains(coche)){
                    System.out.println("La matrícula no está registrada para ningún vehiculo del concesionario");
                    break;
                }

                concesionario.removeCoche(coche);
                break;

            case "motocicleta":

                Motocicleta motocicleta = new Motocicleta(matricula);

                if (!concesionario.getMotocicletas().contains(motocicleta)) {
                    System.out.println("La matrícula no está registrada para ningún vehiculo del concesionario");
                    break;
                }

                concesionario.removeMotocicleta(motocicleta);
                break;

            case "camion":

                Camion camion = new Camion(matricula);

                if (!concesionario.getCamiones().containsValue(camion)) {
                    System.out.println("La matrícula no está registrada para ningún vehiculo del concesionario");
                    break;
                }

                concesionario.removeCamion(camion);
                break;

            case "bicicleta":

                Bicicleta bicicleta = new Bicicleta(matricula);

                if (!concesionario.getBicicletas().containsValue(bicicleta)) {
                    System.out.println("La matrícula no está registrada para ningún vehiculo del concesionario");
                    break;
                }

                concesionario.removeBicicleta(bicicleta);
                break;

            default:

                System.out.println("Cancelando. Seleccione una opcion valida");
                break;
        }
    }

    public static void seleccionarModificar (String vehiculo) {

        Scanner scanner = new Scanner(System.in);

        switch (vehiculo) {

            case "coche":

                System.out.println("Elija la matricula del coche a modificar: \n" + concesionario.getCoches());
                String matriculaCocheEliminar  = scanner.nextLine();

                Coche cocheEliminar = new Coche(matriculaCocheEliminar);
                Coche coche = (Coche) especificacionesVehiculo(vehiculo);

                concesionario.removeCoche(cocheEliminar);
                concesionario.addCoche(coche);

                break;

            case "motocicleta":

                System.out.println("Elija la matricula de la motocicleta a modificar: \n" +
                        concesionario.getMotocicletas());
                String matriculaMoto = scanner.nextLine();

                Motocicleta motoEliminar = new Motocicleta(matriculaMoto);
                Motocicleta motocicleta = (Motocicleta) especificacionesVehiculo(vehiculo);

                concesionario.removeMotocicleta(motoEliminar);
                concesionario.addMotocicleta(motocicleta);

                break;

            case "camion":

                System.out.println("Elija la matricula del camion a modificar: \n" + concesionario.getCamiones());
                String matriculaCamionEliminar = scanner.nextLine();

                Camion camionEliminar = new Camion(matriculaCamionEliminar);
                Camion camion = (Camion) especificacionesVehiculo(vehiculo);

                concesionario.removeCamion(camionEliminar);
                concesionario.addCamion(camion);

                break;

            case "bicicleta":

                System.out.println("Elija la matricula de la bicicleta a modificar: \n" +  concesionario.getBicicletas());
                String matriculaBicicleta = scanner.nextLine();

                Bicicleta bicicletaEliminar = new Bicicleta(matriculaBicicleta);
                Bicicleta bicicleta = (Bicicleta) especificacionesVehiculo(vehiculo);

                concesionario.removeBicicleta(bicicletaEliminar);
                concesionario.addBicicleta(bicicleta);

                break;

            default:

                System.out.println("Cancelando. Seleccione una opcion valida");
                break;
        }
    }

    public static void seleccionarVelocidad (String vehiculo) {

        switch (vehiculo) {

            case "coche":

                System.out.println(concesionario.velocidadMediaCoches());
                break;

            case "motocicleta":

                System.out.println(concesionario.velocidadMediaMotocicletas());
                break;

            case "camion":

                System.out.println(concesionario.velocidadMediaCamiones());
                break;

            case "bicicleta":

                System.out.println(concesionario.velocidadMediaBicicletas());
                break;

            case "todos":

                System.out.println(concesionario.velocidadMediaVehiculos());

            default:
                System.out.println("Cancelando. Seleccione una opcion valida");
        }
    }
}
