package es.ies.puerto.facil;

public class FizzBuzz {

    public static void main(String[] args) {

        int contador=1;

        do{

            if(contador%3==0 && contador%5==0){
                System.out.println("fizzbuzz");
            } else if (contador%3==0) {
                System.out.println("fizz");
            } else if (contador%5==0) {
                System.out.println("buzz");
            } else {
                System.out.println(contador);
            }

            contador++;

        }while(contador <=100);
    }
}
