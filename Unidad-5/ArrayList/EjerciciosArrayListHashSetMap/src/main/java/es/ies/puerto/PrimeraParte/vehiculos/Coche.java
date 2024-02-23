package es.ies.puerto.PrimeraParte.vehiculos;

import es.ies.puerto.PrimeraParte.Abstractas.VehiculoAbstracta;
import es.ies.puerto.PrimeraParte.Interface.IVehiculo;

public class Coche extends VehiculoAbstracta implements IVehiculo {

    public Coche(){
        super();
    }

    public Coche(String matricula) {
        super(matricula);
    }

    public Coche(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }


    @Override
    public int velocidadMaxima() {
        return 180;
    }

    @Override
    public String toString() {
        return "Coches{" +
                "marca='" + getMarca() + ",\n" +
                " modelo='" + getModelo() + ",\n" +
                " matricula='" + getMatricula() + ",\n" +
                " velocidad=" + getVelocidad() +
                '}';
    }
}
