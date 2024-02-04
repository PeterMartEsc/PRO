package es.ies.puerto.SegundaParte.vehiculos;

import es.ies.puerto.PrimeraParte.Abstractas.VehiculoAbstracta;
import es.ies.puerto.PrimeraParte.Interface.IVehiculo;

public class Bicicleta extends VehiculoAbstracta implements IVehiculo {

    public Bicicleta() {
        super();
    }

    public Bicicleta(String matricula) {
        super(matricula);
    }

    public Bicicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public int velocidadMaxima() {
        return 40;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + getMarca() + ",\n" +
                " modelo='" + getModelo() + ",\n" +
                " matricula='" + getMatricula() + ",\n" +
                " velocidad=" + getVelocidad() +
                '}';
    }
}
