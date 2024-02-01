package ies.puerto.PrimeraParte.vehiculos;

import ies.puerto.PrimeraParte.Abstractas.VehiculoAbstracta;
import ies.puerto.PrimeraParte.Interface.IVehiculo;

public class Motocicleta extends VehiculoAbstracta implements IVehiculo {

    public Motocicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public int velocidadMaxima() {


        return 120;
    }
}
