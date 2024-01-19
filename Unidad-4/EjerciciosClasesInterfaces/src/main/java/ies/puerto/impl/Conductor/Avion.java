package ies.puerto.impl.Conductor;

import ies.puerto.abstrac.Conductor.ConductorAbstract;

public class Avion extends ConductorAbstract {
    @Override
    public String despegar() {
        return "El avión está despegando";
    }

    @Override
    public String aterrizar() {
        return "El avión está aterrizando";
    }

    @Override
    public String encenderMotores() {
        return "Ha encendido motores";
    }

    @Override
    public String apagarMotores() {
        return "Ha apagado motores";
    }
}
