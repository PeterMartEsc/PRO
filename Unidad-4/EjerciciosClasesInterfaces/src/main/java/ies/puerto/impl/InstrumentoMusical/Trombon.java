package ies.puerto.impl.InstrumentoMusical;

import ies.puerto.abstrac.InstrumentoMusical.InstrumentoMusicalAbstract;

public class Trombon extends InstrumentoMusicalAbstract {
    @Override
    public String sacarBomba() {
        return "Ha sacado";
    }

    @Override
    public String meterBomba() {
        return "Ha metido";
    }

    @Override
    public String tocarNota(String nota) {
        return nota;
    }
}
