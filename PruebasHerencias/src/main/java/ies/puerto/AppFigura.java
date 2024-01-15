package ies.puerto;

public class AppFigura {
    static Cuadrado cuadrado;
    static Triangulo triangulo;
    public static void main(String[] args) {
        cuadrado = new Cuadrado(5.0f);
        System.out.println("Valor cuadrado: "+cuadrado);
        System.out.println("Area= " +cuadrado.calcularArea());

        triangulo = new Triangulo(10f, 5f);
        System.out.println("Valor triangulo: "+triangulo);
        System.out.println("Area= " +triangulo.calcularArea());
    }
}
