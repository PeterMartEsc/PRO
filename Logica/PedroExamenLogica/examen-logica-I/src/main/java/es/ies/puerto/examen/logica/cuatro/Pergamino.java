package es.ies.puerto.examen.logica.cuatro;

public class Pergamino {

    Pergamino() {

    }
    Object[] analizador(String texto) {
        Object[] resultado = new Object[4];

        String delimitadorPalabras = " ";
        String delimitadorOraciones = "\\.+\\s";
        String [] palabras = new String[texto.length()];
        String [] frases = new String[texto.length()];

        for(int i = 0; i<4 ; i++){
            int tamanio = 0;
            double suma = 0;

            switch (i){

                case 0:
                    if(texto == ""){
                        resultado[i] = 0;
                        break;
                    }
                    palabras = texto.split(delimitadorPalabras);

                    resultado [i] = palabras.length;
                    break;

                case 1:
                    if(texto == ""){
                        resultado[i] = 0;
                        break;
                    }
                    for(String palabra : palabras){
                        tamanio = palabra.length();
                        suma += tamanio;
                    }
                    resultado[i] = suma/palabras.length;
                    break;

                case 2:
                    if(texto == ""){
                        resultado[i] = 0;
                        break;
                    }
                    frases = texto.split(delimitadorOraciones);
                    resultado [i] = frases.length;
                    break;

                case 3:
                    if(palabras.length == 0){
                        resultado[i] = null;
                        break;
                    }
                    String palabraLarga = "";
                    for(String palabra : palabras){
                        if(palabra.length() > tamanio){
                            palabraLarga = palabra;
                        }

                    }
                    resultado[i] = palabraLarga;
                    break;
            }
        }

        return resultado;
    }

}
