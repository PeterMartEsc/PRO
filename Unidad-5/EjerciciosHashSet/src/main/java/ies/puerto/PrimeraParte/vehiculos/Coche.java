package ies.puerto.PrimeraParte.vehiculos;

import ies.puerto.PrimeraParte.Abstractas.VehiculoAbstracta;
import ies.puerto.PrimeraParte.Interface.IVehiculo;

public class Coche extends VehiculoAbstracta implements IVehiculo {
    public Coche(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }


    @Override
    public int velocidadMaxima() {

        return 180;
    }
}
