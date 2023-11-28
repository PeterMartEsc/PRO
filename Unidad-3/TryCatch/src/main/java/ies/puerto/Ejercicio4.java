package ies.puerto;

public class Ejercicio4 {

    public static void main(String[] args) {

        String vacio = null; /* Es como decir "vacio está muerto" */

        try{

            int tamanioTexto = vacio.length();

            System.out.println("La longitud del string es: " +tamanioTexto);

        }catch(NullPointerException e){
            System.out.println("Se ha producido un error NullPointException, el texto es null");
        }
    }
}
