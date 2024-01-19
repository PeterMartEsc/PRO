package ies.puerto.abstrac.Persona;

import ies.puerto.interfaz.Persona.ITrabajador;

public abstract class EmpleadoAbstract extends PersonaAbstract implements ITrabajador  {

    private float salario;

    public EmpleadoAbstract() {
    }

    public EmpleadoAbstract(String nombre, String fechaNacimiento, float salario) {
        super(nombre, fechaNacimiento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String trabajar() {
        return "Está trabajando";
    }

    @Override
    public abstract String toString();

    public float salario (float salario){

        return salario;
    }

}
