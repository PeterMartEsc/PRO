package ies.puerto;

public class AppFigura {
    static Cuadrado cuadrado;
    static Triangulo triangulo;
    static Rectangulo rectangulo;
    public static void main(String[] args) {
        cuadrado = new Cuadrado(5.0f);
        System.out.println("Valor cuadrado: "+cuadrado);
        mostrarArea(cuadrado);

        triangulo = new Triangulo(10f, 5f);
        System.out.println("Valor triangulo: "+triangulo);
        mostrarArea(triangulo);

        rectangulo = new Rectangulo(4f, 3f);
        System.out.println("Valor rectangulo: " +rectangulo);
        mostrarArea(rectangulo);
    }

    public static void mostrarArea(Figura figura){
        System.out.println("Valor del Area: " +figura.calcularArea());
    }
}
