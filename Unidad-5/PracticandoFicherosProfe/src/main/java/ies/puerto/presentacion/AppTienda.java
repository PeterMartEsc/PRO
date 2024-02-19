package ies.puerto.presentacion;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.entity.Articulo;
import ies.puerto.modelo.fichero.csv.implementacion.FileCsv;
import ies.puerto.negocio.abstractas.TiendaNegocio;

import java.util.List;


public class AppTienda {
    static TiendaNegocio tiendaNegocio;
    public static void main(String[] args) {
        tiendaNegocio = new TiendaNegocio();

        System.out.println(tiendaNegocio.obtenerArticulos());

    }




}
