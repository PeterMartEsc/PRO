package ies.puerto;

import java.util.Scanner;

/**
 * Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada en kilómetros por hora,
 * proporcione la velocidad en metros por segundo.
 */
public class Ejercicio7 {
    public static void main(String[] args){
        /** //TODO: Declaracion erronea de variables
        double velocidad_en_km_por_h, velocidad_en_m_por_s;
        System.out.print("Ingresa el valor de velocidad en km por h: ");
        velocidad_en_km_por_h = in.nextDouble();
        in.nextLine();
        velocidad_en_m_por_s=velocidad_en_km_por_h*10/36;
        System.out.println("Valor de velocidad en m por s: " + velocidad_en_m_por_s);
         **/
        Scanner in = new Scanner(System.in);
        double velocidadKm, velocidadMetros;
        System.out.print("Ingresa el valor de velocidad en km por h: ");
        velocidadKm = in.nextDouble();
        in.nextLine();
        velocidadMetros=velocidadKm*10/36;
        System.out.println("Valor de velocidad en m por s: " + velocidadMetros);

    }

}
