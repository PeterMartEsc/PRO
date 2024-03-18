package es.ies.puerto.examen.logica.cuatro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pergamino {

    Pergamino() {

    }
    Object[] analizador(String texto) {
        Object[] resultado = null;
        resultado = new Object[4];
        if (texto == null || texto.isEmpty()) {
            resultado[0] =0;
            resultado[1] =0;
            resultado[2] =0;
            resultado[3] =null;
            return resultado;
        }


        String[] palabras = texto.split("\\s+");

        int totalPalabras = palabras.length;

        int totalCaracteres = texto.replaceAll("\\s+", "").length();
        int numOraciones = texto.split("[.]").length;

        // Longitud media de las palabras
        double longitudMedia = (double) totalCaracteres / totalPalabras;

        // Encontrar la palabra más larga
        String palabraMasLarga = encontrarPalabraMasLarga(palabras);


        resultado[0] = totalPalabras;
        resultado[1] = longitudMedia;
        resultado[2] = numOraciones;
        resultado[3] = palabraMasLarga;

        return resultado;
    }

    public  String encontrarPalabraMasLarga(String[] palabras) {
        String palabraMasLarga = "";
        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }

}
