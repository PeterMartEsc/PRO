package ies.puerto;

public class Ejercicio7 {
    public static void main(String[] args) {
    }

    public String calcularDiaSemana(int dia) {
        String resultado = "Domingo";

        switch (dia){

            case 1:
                resultado = "Lunes";
            break;

            case 2:
                resultado = "Martes";
                break;

            case 3:
                resultado = "Miercoles";
                break;

            case 4:
                resultado = "Jueves";
                break;

            case 5:
                resultado = "Viernes";
                break;

            case 6:
                resultado = "Sabado";
                break;

            case 7:
                resultado = "Domingo";
                break;

            default:
                resultado = "No es un dia de la semana";
        }

        return resultado;
    }
}