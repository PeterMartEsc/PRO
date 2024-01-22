package ies.puerto.abstrac.Animales;

public abstract class Animal {
    private int chip;
    private String nombre;

    public Animal() {

    }

    public Animal(String nombre) {

    }

    public Animal(int chip) {

    }

    public Animal(String nombre, int chip) {
        this.nombre = nombre;
        this.chip = chip;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String suSonido() {
        return "Soy un sonido de Animal";
    }

    @Override
    public String toString() {
        return "Nombre:"+nombre+",chip:"+chip;
    }
}
