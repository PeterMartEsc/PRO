package ies.puerto.SegundaParte.abstrac;

public abstract class TrabajadorAbstract extends PersonaAbstract{

    private float salario;

    public TrabajadorAbstract(){}

    public TrabajadorAbstract(String nombre, int dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
