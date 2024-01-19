package ies.puerto.impl.ConexionRed;

import ies.puerto.abstrac.ConexionRed.ConexionRedAbstract;

public class ConexionBluetooth extends ConexionRedAbstract {
    @Override
    public String vincular() {
        return "El dispositivo está vinculado";
    }

    @Override
    public String desvincular() {
        return "El dispositivo está desvinculado";
    }
}
