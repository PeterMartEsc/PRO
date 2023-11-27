package ies.puerto;

public class Ejemplo2 {
    public static void main(String[] args) {
        int numero=10;
        int divisor=0;



        try{
            int division = numero/divisor;
            System.out.println("Numero dividido por 0=" +division);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Se ha producido una Arithmetic Exception, mensaje:" +arithmeticException.getMessage());
        }
    }
}
