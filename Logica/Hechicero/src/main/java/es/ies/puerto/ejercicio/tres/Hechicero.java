package es.ies.puerto.ejercicio.tres;

import java.util.HashMap;
import java.util.Map;

public class Hechicero {

    public char vocalMasPoderosa(String texto) {
        char vocal = ' ';

        String textoDefinitivo = texto.toLowerCase();
        HashMap<Character, Integer> vocales = new HashMap<>();
        vocales.put('a', 0);
        vocales.put('e', 0);
        vocales.put('i', 0);
        vocales.put('o', 0);
        vocales.put('u', 0);

        for(int i = 0; i<textoDefinitivo.length() ; i++){
            char vocalSeleccionada = textoDefinitivo.charAt(i);
            if(vocales.containsKey(vocalSeleccionada)){
                vocales.replace(vocalSeleccionada, vocales.get(vocalSeleccionada)+1);
            }
        }

        Integer temp = 0;

        for(int i =0; i<vocales.size(); i++){
            Integer valor = vocales.get(i);
            if(valor>temp){
                temp = valor;
                valor= temp;
            }
        }

        vocal = 

        return vocal;
    }
}
