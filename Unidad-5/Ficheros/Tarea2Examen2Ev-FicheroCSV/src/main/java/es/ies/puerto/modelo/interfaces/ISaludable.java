package ies.puerto.modelo.interfaces;

import java.text.ParseException;

public interface ISaludable {

    int diasPreCaducidad() throws ParseException;

    boolean verificarCaducidad() throws ParseException;
}
