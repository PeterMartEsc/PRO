package ies.puerto.PrimeraParte.App;

import ies.puerto.PrimeraParte.vehiculos.Coche;
import ies.puerto.PrimeraParte.vehiculos.Concesionario;
import ies.puerto.PrimeraParte.vehiculos.Motocicleta;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    public static void main(String[] args) {
        concesionario = new Concesionario();

        coche1 = new Coche("Toyota","Corolla","ABC123",60);
        coche2 = new Coche("Honda","Civic","XYZ789",75);
        coche3 = new Coche("Ford","Mustang","DEF456",100);
        coche4 = new Coche("Chevrolet","Impala","GHI789",80);
        coche5 = new Coche("Volkswagen","Golf","JKL012",65);

        motocicleta1 = new Motocicleta("Harley-Davidson","Sportster","MNO345",50);
        motocicleta2 = new Motocicleta("Yamaha","YZF R6","PQR678",90);
        motocicleta3 = new Motocicleta("Ducati","Monster","STU901",70);
        motocicleta4 = new Motocicleta("Suzuki","GSX-R750","VWX234",80);
        motocicleta5 = new Motocicleta("Kawasaki","Ninja","ZAB567",85);

        coches = new HashSet<>();
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);

        motocicletas = new ArrayList<>();
        motocicletas.add(motocicleta1);
        motocicletas.add(motocicleta2);
        motocicletas.add(motocicleta3);
        motocicletas.add(motocicleta4);
        motocicletas.add(motocicleta5);

        concesionario.setCoches(coches);
        concesionario.setMotocicletas(motocicletas);

        System.out.println(concesionario);
        System.out.println();

        System.out.println("Velocidad media coches:" + concesionario.velocidadMediaCoches());
        System.out.println("Velocidad media motocicleta:" + concesionario.velocidadMediaMotocicletas());
        System.out.println("Velocidad media todo: " + concesionario.velocidadMediaVehiculos());
        System.out.println();


        concesionario.removeCoche(coche1);
        concesionario.removeMotocicleta(motocicleta3);

        System.out.println("Velocidad maxima coches:" + coche1.velocidadMaxima());
        System.out.println("Velocidad maxima motocicletas: " + motocicleta1.velocidadMaxima());
        System.out.println();

        System.out.println(concesionario);
    }

}
