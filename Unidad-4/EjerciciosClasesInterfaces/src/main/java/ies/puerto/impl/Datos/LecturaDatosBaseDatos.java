package ies.puerto.impl.Datos;

import ies.puerto.abstrac.Datos.LecturaDatosAbstract;

public class LecturaDatosBaseDatos extends LecturaDatosAbstract {

    @Override
    public String lectura() {
        return "Leyendo los datos desde BBDD";
    }

    @Override
    public String apertura() {
        return "Apertura de la BBDD";
    }

    @Override
    public String cierre() {
        return "Cierre de la BBDD";
    }
}
