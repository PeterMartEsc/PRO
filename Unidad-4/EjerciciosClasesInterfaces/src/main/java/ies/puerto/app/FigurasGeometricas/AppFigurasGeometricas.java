package ies.puerto.app.FigurasGeometricas;

import ies.puerto.impl.FigurasGeometricas.Circulo;
import ies.puerto.impl.FigurasGeometricas.Cuadrado;
import ies.puerto.impl.FigurasGeometricas.Rectangulo;
import ies.puerto.interfaz.FigurasGeometricas.IFormaGeometrica;

public class AppFigurasGeometricas {

    static IFormaGeometrica circulo;
    static IFormaGeometrica cuadrado;
    static IFormaGeometrica rectangulo;

    public static void main(String[] args) {
        cuadrado = new Cuadrado(5f);
        circulo = new Circulo(5f);
        rectangulo = new Rectangulo(6f, 7f);

        System.out.println("Area Circulo: " +circulo.calcularArea());
        System.out.println("Area Cuadrado: " +cuadrado.calcularArea());
        System.out.println("Area Rectángulo: " +rectangulo.calcularArea());
    }
}
