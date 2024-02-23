package ies.puerto.negocio.abstractas;

import ies.puerto.modelo.entity.Articulo;
import ies.puerto.modelo.fichero.csv.implementacion.FileCsv;

import java.util.ArrayList;
import java.util.List;

public class TiendaNegocio {
    FileCsv fileCsv;
    public TiendaNegocio() {
        fileCsv = new FileCsv();
    }

    public boolean buscarArticulo(Articulo articulo, List<Articulo> articulos) {
        if (articulos.contains(articulo)) {
            return true;
        }
        return false;
    }

    List<Articulo> obtenerAlimentos() {
        return fileCsv.obtenerAlimentos();
    }

    List<Articulo> obtenerAparatos() {
        return fileCsv.obtenerAparatos();
    }

    List<Articulo> obtenerSouvenirs() {
        return fileCsv.obtenerSouvenirs();
    }

    List<Articulo> obtenerCuidados() {
        return fileCsv.obtenerCuidados();
    }

    public List<Articulo> obtenerArticulos() {
        List<Articulo> articulos = new ArrayList<>();
        articulos.addAll(fileCsv.obtenerAlimentos());
        articulos.addAll(fileCsv.obtenerAparatos());
        articulos.addAll(fileCsv.obtenerSouvenirs());
        articulos.addAll(fileCsv.obtenerCuidados());

        return articulos;
    }

}
