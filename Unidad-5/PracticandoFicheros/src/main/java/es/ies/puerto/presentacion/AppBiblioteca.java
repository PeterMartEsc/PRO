package es.ies.puerto.presentacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {

    public static void main(String[] args) {
        List<Articulo> alimentos = lectura("src/main/resources/alimentos.csv");
        System.out.println(alimentos);
        //lectura("src/main/resources/aparatos.csv");
        //lectura("src/main/resources/souvenirs.csv");
    }

    public static List<Articulo> lectura(String path, String articulo) {

        File fichero = new File(path);

        List<Articulo> articulos = new ArrayList<>();

        if (fichero.exists() && fichero.isFile()) {

            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

                String linea;

                int i = 0;

                // Leer cada línea del fichero
                while ((linea = br.readLine()) != null) {

                    if(i>0) {

                        switch(articulo){
                            case "alimento":

                                break;

                            case "aparato":

                                break;

                            default: //mostrar error
                        }

                        String[] alimentoArray = linea.split(",");
                        Alimento alimento = new Alimento(alimentoArray[3], alimentoArray[0],
                                Float.parseFloat(alimentoArray[1]), alimentoArray[2], alimentoArray[4]);
                        articulos.add(alimento);
                    }
                    i ++;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }

        return articulos;
    }
}
