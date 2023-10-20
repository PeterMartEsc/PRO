package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void verificarDiaSemanaTestOK() {
        verificarDiaSemana("Lunes", 1);
        verificarDiaSemana("Martes", 2);
        verificarDiaSemana("Miercoles", 3);
        verificarDiaSemana("Jueves", 4);
        verificarDiaSemana("Viernes", 5);
        verificarDiaSemana("Sabado", 6);
        verificarDiaSemana("Domingo", 7);
        verificarDiaSemana("No es un dia de la semana", 8);

        verificarDiaSemana("No es un dia de la semana", 11);

    }

    @Test
    public void verificarDiaSemana(String strDia, int numeroDia) {

        String resultado = "";

        resultado = ejercicio7.calcularDiaSemana(numeroDia);

        Assertions.assertEquals(strDia, resultado, "No se ha obtenido el resultado esperado");



    }
}
