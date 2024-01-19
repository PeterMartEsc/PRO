package ies.puerto.app.Conductor;

import ies.puerto.abstrac.Conductor.ConductorAbstract;
import ies.puerto.impl.Conductor.Automovil;
import ies.puerto.impl.Conductor.Avion;

public class AppConductor {
    static Automovil Automovil;
    static ConductorAbstract Avion;

    public static void main(String[] args) {
        Automovil = new Automovil();
        System.out.println(Automovil.arrancar());
        System.out.println(Automovil.detener());
        System.out.println(Automovil.conducir());

        Avion = new Avion();
        System.out.println(Avion.encenderMotores());
        System.out.println(Avion.apagarMotores());
        System.out.println(Avion.despegar());
        System.out.println(Avion.aterrizar());
    }
}
