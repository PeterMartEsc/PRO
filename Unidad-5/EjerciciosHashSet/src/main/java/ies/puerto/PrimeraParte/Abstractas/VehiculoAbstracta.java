package ies.puerto.PrimeraParte.Abstractas;

import java.util.Objects;

public abstract class VehiculoAbstracta {

    private String marca;

    private String modelo;

    private String matricula;

    private int velocidad;

    public VehiculoAbstracta(){}

    public VehiculoAbstracta(String matricula){
        this.matricula = matricula;
    }

    public VehiculoAbstracta(String marca, String modelo, String matricula, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "VehiculoAbstracta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehiculoAbstracta that = (VehiculoAbstracta) o;
        return Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
