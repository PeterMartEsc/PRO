package ies.puerto;

public class Ejercicio4 {
    public static void main(String[] args) {

        int contador = 0;
        String cadena = "Feliz Navidad";
        String nuevaCadena = "";

        for (int i = cadena.length(); i >= 0; i--) {
            char nuevoCaracter = cadena.charAt(i);
            System.out.println(cadena.charAt(i));
        }
    }
}
