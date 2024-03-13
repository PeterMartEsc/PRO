package es.ies.puerto.facil;

public class NumerosPrimos {

    public static void main(String[] args) {

        int contador = 1;

        do{

            if(contador%2==0){
                //print imprime en la misma línea y println salta a la siguiente
                // \n salta dos veces cada línea
                System.out.print(contador+" ");
            }
            contador++;

        } while (contador <=100 );
    }


}
