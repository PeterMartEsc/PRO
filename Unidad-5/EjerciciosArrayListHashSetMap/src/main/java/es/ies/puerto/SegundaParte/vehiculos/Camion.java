package es.ies.puerto.SegundaParte.vehiculos;

import es.ies.puerto.PrimeraParte.Abstractas.VehiculoAbstracta;
import es.ies.puerto.PrimeraParte.Interface.IVehiculo;

public class Camion extends VehiculoAbstracta implements IVehiculo {

    public Camion(){
        super();
    }

    public Camion(String matricula) {
        super(matricula);
    }

    public Camion(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public int velocidadMaxima() {
        return 160;
    }

    @Override
    public String toString() {
        return "Camiones{" +
                "marca='" + getMarca() + ",\n" +
                " modelo='" + getModelo() + ",\n" +
                " matricula='" + getMatricula() + ",\n" +
                " velocidad=" + getVelocidad() +
                '}';
    }
}
