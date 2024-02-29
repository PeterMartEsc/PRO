package ies.puerto.modelo.impl.csv.implementation;

import ies.puerto.modelo.abstractas.entity.Producto;
import ies.puerto.modelo.abstractas.file.FicheroAbstracta;
import ies.puerto.modelo.impl.Alimento;
import ies.puerto.modelo.impl.Aparato;
import ies.puerto.modelo.impl.CuidadoPersonal;
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

                String linea;
                int i = 0;

                while ((linea = newBR.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(",");
                        switch (articulo) {
                            case "alimento":
                                productos.add(splitToAlimento(arrayElemento));
                                break;
                            case "cuidado":
                                productos.add(splitToCuidadoPersonal(arrayElemento));
                                break;
                            default:
                                productos.add(splitToDefault(arrayElemento)) ;
                                break;//Mostrar error;
                        }
                    }
                    i++;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return productos;
    }

    @Override
    public boolean escritura(String path, String contenido) {
        return almacenarEnFichero(path, contenido);
    }

    private Alimento splitToAlimento(String[] splitArray){
        Alimento alimento = new Alimento( splitArray[0], splitArray[1], Float.parseFloat(splitArray[2]),
                splitArray[3], splitArray[4] );

        return alimento;
    }
    private Aparato splitToDefault(String[] splitArray) {
        Aparato aparato = new Aparato( splitArray[3], splitArray[0], Float.parseFloat(splitArray[1]),
                splitArray[2] );

        return aparato;
    }
    private CuidadoPersonal splitToCuidadoPersonal(String[] splitArray) {
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal( splitArray[3], splitArray[0],
                Float.parseFloat(splitArray[1]), splitArray[2], Integer.parseInt(splitArray[4]) );

        return cuidadoPersonal;
    }
}
