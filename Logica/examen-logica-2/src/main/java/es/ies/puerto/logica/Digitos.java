package es.ies.puerto.logica;

public class Digitos {
    public  int sumaTradicional(int numero) {
        int suma = 0;
        while (numero != 0) {
            int ultimoDigito = numero % 10;
            suma += ultimoDigito;
            numero /= 10;
        }
        return suma;
    }

    public  int sumaRecursiva(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            int ultimoDigito = numero % 10;
            return ultimoDigito + sumaRecursiva(numero / 10);
        }
    }
}
