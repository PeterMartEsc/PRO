package ies.puerto.impl.Conductor;

import ies.puerto.interfaz.Conductor.IConductor;

public class Automovil implements IConductor {
    @Override
    public String arrancar() {
        return "El automovil está en marcha";
    }

    @Override
    public String detener() {
        return "El automovil está detenido";
    }

    public String conducir(){
        return "Está conduciendo el automovil";
    }
}
