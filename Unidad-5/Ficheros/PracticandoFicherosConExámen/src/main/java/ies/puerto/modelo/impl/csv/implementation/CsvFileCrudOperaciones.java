package ies.puerto.modelo.impl.csv.implementation;

import ies.puerto.modelo.abstractas.entity.Producto;
import ies.puerto.modelo.abstractas.file.FicheroAbstracta;
import ies.puerto.modelo.interfaces.file.IFileInterface;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvFileCrudOperaciones extends FicheroAbstracta implements IFileInterface {

    public CsvFileCrudOperaciones() {

        FICHERO_ALIMENTOS = "src/main/resources/alimentos.csv";
        FICHERO_APARATOS = "src/main/resources/aparatos.csv";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.csv";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.csv";

    }

    public List<Producto> obtenerAlimentos(){
        return lectura(FICHERO_ALIMENTOS,"alimento");
    }

    public List<Producto> obtenerAparatos(){
        return lectura(FICHERO_APARATOS,"aparato");
    }

    public List<Producto> obtenerSouvenirs(){
        return lectura(FICHERO_SOUVENIRS,"souvernir");
    }

    public List<Producto> obtenerCuidados(){
        return lectura(FICHERO_CUIDADO_PERSONAL,"cuidado");
    }

    @Override
    public List<Producto> lectura(String path, String articulo) {

        List<Producto> productos = new ArrayList<>();

        if(existeFichero(path)){
            try(BufferedReader newBR = new BufferedReader(new FileReader(path))){



            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }

    @Override
    public boolean escritura(String path, String contenido) {
        return false;
    }
}
