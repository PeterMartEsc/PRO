package es.ies.puerto.file.tres;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileArmasCsv {

    List<Arma> armas;
    String path = "src/main/resources/tres.csv";
    String DELIMITADOR = ",";
    String DELIMITADOR2 = ",\"";
    String DELIMITADOR3 = "\"";

    public List<Arma> obtenerArmas() {

        armas = new ArrayList<>();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(DELIMITADOR);
                String[] datos2 = linea.split(DELIMITADOR2);
                String [] datos3 = datos2[1].split(DELIMITADOR3);

                if(datos3[0].contains(",")){
                    String id = datos[0];
                    String nombre = datos[1];
                    String descripcion = datos3[0];
                    String origen = datos[4];
                    int fuerza = Integer.parseInt(datos[5]);
                    Arma arma = new Arma(id, nombre, descripcion, origen, fuerza);
                    armas.add(arma);
                } else {
                    String id = datos[0];
                    String nombre = datos[1];
                    String descripcion = datos3[0];
                    String origen = datos[3];
                    int fuerza = Integer.parseInt(datos[4]);
                    Arma arma = new Arma(id, nombre, descripcion, origen, fuerza);
                    armas.add(arma);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return armas;
    }
    public Arma obtenerArma(Arma arma) {
        if(!armas.contains(arma)){
            return null;
        }

        int posicion = armas.indexOf(arma);
        return armas.get(posicion);
    }
    public void addArma(Arma arma) {
        if(armas.contains(arma)){
            return;
        }
        armas.add(arma);
        actualizarFichero(armas);
    }
    public void deleteArma(Arma arma) {
        if(armas.remove(arma)){
            actualizarFichero(armas);
        }
    }
    public void updateArma(Arma arma) {
        if(!armas.contains(arma)){
            return;
        }
        int posicion = armas.indexOf(arma);
        armas.set(posicion, arma);
        actualizarFichero(armas);
    }

    public void actualizarFichero(List<Arma> armas){

        try (FileWriter writer = new FileWriter(path);) {
            for(Arma arma : armas){
                writer.write(arma.toCsv()+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
