package es.ies.puerto.modelo.ficheros.abstractas;

import es.ies.puerto.modelo.interfaces.IBiblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class BibliotecaAbstractFile{

    public static boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }

    public static boolean esDirectorio(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }

    public void lectura(String path) {

        // Crear un objeto File
        File fichero = new File(path);

        // Verificar si el fichero existe antes de intentar leerlo
        if (fichero.exists() && fichero.isFile()) {

            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

                String linea;
                // Leer cada línea del fichero
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
    }
}
