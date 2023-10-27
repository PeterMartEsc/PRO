package ies.puerto;

public class Ejercicio3 {

    public int suma (int valor1, int valor2){

        return valor1+valor2;

    }

    public int sumaTresNum (int valor1, int valor2, int valor3){

        int resultado = suma (valor1, valor2);

        return suma (resultado, valor3);

    }

    public int sumaCuatroNum (int valor1, int valor2, int valor3, int valor4){

        int resultado = sumaTresNum (valor1, valor2, valor3);

        return suma (resultado, valor4);

    }

    public int sumaCincoNum (int valor1, int valor2, int valor3, int valor4, int valor5){

        int resultado = sumaCuatroNum (valor1, valor2, valor3, valor4);

        return suma (resultado, valor5);

    }

    public int mayor (int valor1, int valor2){

        int resultado = valor2;

        if (valor1>valor2){
            resultado = valor1;
        }

        return resultado;
    }

    public int mayorTresNum (int valor1, int valor2, int valor3){

        int resultado = mayor(valor1, valor2);

        return mayor (resultado, valor3);
    }

    public int mayorCuatroNum (int valor1, int valor2, int valor3, int valor4){

        int resultado = mayorTresNum (valor1, valor2, valor3);

        return mayor(resultado, valor4);
    }

    public int mayorCincoNum (int valor1, int valor2, int valor3, int valor4, int valor5){

        int resultado = mayorCuatroNum (valor1, valor2, valor3, valor4);

        return mayor (resultado, valor5);
    }
}


