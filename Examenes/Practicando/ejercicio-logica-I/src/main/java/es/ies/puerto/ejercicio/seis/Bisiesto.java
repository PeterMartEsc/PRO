package es.ies.puerto.ejercicio.seis;

public class Bisiesto {
    public boolean is(int anio) {
        boolean resultado = false;

        if(anio%400==0){
            resultado=true;
        }

        if(anio%4==0){
            if(anio%10==0){
                resultado=true;
            }
        }

        return resultado;
    }
}
