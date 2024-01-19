package ies.puerto.abstrac.Persona;

import ies.puerto.interfaz.Persona.ITrabajador;

public class EmpleadoAbstract extends PersonaAbstract implements ITrabajador  {
    public EmpleadoAbstract(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    @Override
    public String trabajar() {
        return "Está trabajando";
    }

    @Override
    public String anio(String anio) {
        return anio;
    }
}
