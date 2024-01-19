package ies.puerto.impl.ConexionRed;

import ies.puerto.interfaz.ConexionRed.IConexionRed;

public class ConexionEthernet implements IConexionRed {
    @Override
    public String conectar() {
        return "Se ha establecido una conexión";
    }
}
