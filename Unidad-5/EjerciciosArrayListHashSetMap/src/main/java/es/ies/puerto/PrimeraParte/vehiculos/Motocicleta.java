package es.ies.puerto.PrimeraParte.vehiculos;

import es.ies.puerto.PrimeraParte.Abstractas.VehiculoAbstracta;
import es.ies.puerto.PrimeraParte.Interface.IVehiculo;

public class Motocicleta extends VehiculoAbstracta implements IVehiculo {


    public Motocicleta(){
        super();
    }

    public Motocicleta(String matricula) {
        super(matricula);
    }

    public Motocicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }



    @Override
    public int velocidadMaxima() {
        return 120;
    }

    @Override
    public String toString() {
        return "Motocicletas{" +
                "marca='" + getMarca() + ",\n" +
                " modelo='" + getModelo() + ",\n" +
                " matricula='" + getMatricula() + ",\n" +
                " velocidad=" + getVelocidad() +
                '}';
    }
}
