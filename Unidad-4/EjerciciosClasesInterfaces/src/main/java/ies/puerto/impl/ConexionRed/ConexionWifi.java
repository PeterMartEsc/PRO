package ies.puerto.impl.ConexionRed;

import ies.puerto.interfaz.ConexionRed.IConexionRed;

public class ConexionWifi implements IConexionRed {
    @Override
    public String conectar() {
        return "Se ha estableido una conexión";
    }
}
