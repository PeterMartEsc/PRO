package ies.puerto.app.Datos;

import ies.puerto.abstrac.Datos.LecturaDatosAbstract;
import ies.puerto.impl.Datos.LecturaDatosBaseDatos;
import ies.puerto.interfaz.Datos.ILecturaDatos;

public class AppLecturaDatos {

    static LecturaDatosAbstract lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosBaseDatos();
        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.lectura());
        System.out.println(lecturaDatos.cierre());
        //tipo(lecturaDatos);
    }

    public static void tipo(ILecturaDatos lecturaDatos){
        System.out.println(lecturaDatos.getClass().getName());
    }
}
