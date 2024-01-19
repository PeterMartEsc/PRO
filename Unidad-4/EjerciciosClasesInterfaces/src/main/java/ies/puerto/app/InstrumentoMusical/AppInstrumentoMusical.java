package ies.puerto.app.InstrumentoMusical;

import ies.puerto.abstrac.InstrumentoMusical.InstrumentoMusicalAbstract;
import ies.puerto.impl.InstrumentoMusical.Guitarra;
import ies.puerto.impl.InstrumentoMusical.Trombon;

public class AppInstrumentoMusical {

    static Guitarra Guitarra;
    static InstrumentoMusicalAbstract Trombon;

    public static void main(String[] args) {
        Guitarra = new Guitarra();
        System.out.println(Guitarra.tocarNota("Sol#"));
        System.out.println(Guitarra.afinar());
        System.out.println(Guitarra.cambiarCuerdas());

        System.out.println();

        Trombon = new Trombon();
        System.out.println(Trombon.sacarBomba());
        System.out.println(Trombon.meterBomba());
        System.out.println(Trombon.tocarNota("Sib"));
    }
}
