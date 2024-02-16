package es.ies.puerto.negocio.abstractas;

import es.ies.puerto.presentacion.Articulo;

import java.util.List;

public class TiendaNegocio {

    //FileCsv fileCsv;

    public TiendaNegocio(){

    }

    public boolean buscarArticulo(Articulo articulo, List<Articulo> articulos){
        if(articulos.contains(articulo)){
            return true;
        }

        return false;
    }

    //List<Articulo> leerAlimentos(){
        //return fileCSV.lectura("", "");
    //}
}