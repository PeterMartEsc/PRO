package es.ies.puerto.facil;

public class InvertirCadena {

    public static void main(String[] args) {

        String cadena = "Hola mundo";
        int size = cadena.length();

        String cadenaInvertida="";

        for(int i = 0; i<size; i++){

            //Es el caracter en la posición final, menos el valor del bucle,
            // así irá disminuyendo según aumente el numero de vueltas. El -1
            // es por que la cadena empieza a contar desde 0

            char caracter = cadena.charAt(size-1-i);
            cadenaInvertida += caracter;
        }

        System.out.println(cadenaInvertida);
    }
}
