package ies.puerto.impl.Reproductor;

import ies.puerto.interfaz.Reproductor.IReproductor;

public class ReproductorMp3 implements IReproductor {


    @Override
    public String reproducir() {
        return "Reproduciendo Mp3";
    }

    @Override
    public String detener() {
        return "Deteniendo Mp3";
    }
}
