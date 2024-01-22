package ies.puerto.ejemplos;

public class Perro extends Especie {

    public Perro(String nombre, int chip) {
        super(nombre, chip);
    }

    @Override
    public String suSonido() {
        return "guauuuuu";
    }
}
