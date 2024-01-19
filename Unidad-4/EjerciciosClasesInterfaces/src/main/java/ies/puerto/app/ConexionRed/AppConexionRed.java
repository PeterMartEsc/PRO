package ies.puerto.app.ConexionRed;

import ies.puerto.abstrac.ConexionRed.ConexionRedAbstract;
import ies.puerto.impl.ConexionRed.ConexionBluetooth;
import ies.puerto.impl.ConexionRed.ConexionEthernet;
import ies.puerto.impl.ConexionRed.ConexionWifi;
import ies.puerto.interfaz.ConexionRed.IConexionRed;

public class AppConexionRed {

    static IConexionRed ConexionEthernet;
    static IConexionRed ConexionWifi;
    static ConexionRedAbstract ConexionBluetooth;

    public static void main(String[] args) {
        ConexionEthernet = new ConexionEthernet();
        System.out.println(ConexionEthernet.conectar());

        ConexionWifi = new ConexionWifi();
        System.out.println(ConexionWifi.conectar());

        ConexionBluetooth = new ConexionBluetooth();
        System.out.println(ConexionBluetooth.vincular());
        System.out.println(ConexionBluetooth.desvincular());
    }
}
