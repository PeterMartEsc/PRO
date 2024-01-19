package ies.puerto.impl.InstrumentoMusical;

import ies.puerto.interfaz.InstrumentoMusical.IInstrumentoMusical;

public class Guitarra implements IInstrumentoMusical {
    @Override
    public String tocarNota(String nota) {
        return nota;
    }

    @Override
    public String afinar() {
        return "La guitarra está afinada";
    }

    public String cambiarCuerdas(){
        return "Ha cambiado la cuerda";
    }
}
