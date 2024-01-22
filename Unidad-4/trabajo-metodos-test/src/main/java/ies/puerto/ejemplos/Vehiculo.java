package ies.puerto.ejemplos;

public class Vehiculo {
    private String color;

    public Vehiculo(String color) {
        this.color = color;
    }

    public Vehiculo() {
    }

    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }

    public void miColor(){
        System.out.println("Mi color es:"+color);
    }


    private void apagar() {
        System.out.println("El vehículo se está moviendo.");
    }

    public String toString() {
        return "Mi color es:"+color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
