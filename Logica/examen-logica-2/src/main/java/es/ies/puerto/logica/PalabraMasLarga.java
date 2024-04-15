package es.ies.puerto.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalabraMasLarga {

    public String metodoTradicional(List<String> palabras) {
        String resultado = null;
        if (palabras == null || palabras.isEmpty()) {
            return null;
        }
        resultado = palabras.get(0);
        if (palabras.size() == 1) {
            return resultado;
        }
        for (String palabra:palabras) {
            if (palabra.length() > resultado.length()) {
                resultado = palabra;
            }
        }
        return resultado;
    }

    public String metodoRecursivo(List<String> palabras) {
        String resultado = null;
        if (palabras == null || palabras.isEmpty()) {
            return null;
        }
        resultado = palabras.get(0);
        if (palabras.size() == 1) {
            return resultado;
        } else {
            List<String> sublista = new ArrayList<>(palabras.subList(1, palabras.size()));
            String palabraMasLargaResto = metodoRecursivo(sublista);
            return resultado.length() >= palabraMasLargaResto.length() ? resultado : palabraMasLargaResto;
            }
        }
}
