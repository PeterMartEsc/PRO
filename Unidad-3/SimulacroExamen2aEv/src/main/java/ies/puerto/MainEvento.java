package ies.puerto;

import java.util.Scanner;

public class MainEvento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el título de su evento: ");
        String titulo = scanner.nextLine();
        System.out.println("Introduzca la fecha de su evento en formato dd/MM/aaaa: ");
        String fecha = scanner.nextLine();

        Evento evento = new Evento(titulo, fecha);

        System.out.println("Información del Evento:");
        System.out.println(evento.informacion());
    }
}
