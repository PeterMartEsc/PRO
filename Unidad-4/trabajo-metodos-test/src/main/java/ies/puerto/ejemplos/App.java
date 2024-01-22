package ies.puerto.ejemplos;

public class App {
    static Coche miCoche;
    static Coche miCocheColor;

    static Coche miCocheMatricula;

    static Bicicleta miBicicleta;

    public static void main(String[] args) {
        miCoche = new Coche();
        miCoche.mover();
        System.out.println( miCoche.toString());

        miCocheColor = new Coche("Rojo");
        miCocheColor.mover();
        System.out.println(miCocheColor.toString());

        miCocheMatricula = new Coche("Azul","TF1965AK");
        miCocheMatricula.mover();

        System.out.println(miCocheMatricula.toString());


        miBicicleta = new Bicicleta("L", "Negra");
        miBicicleta.mover();
        miBicicleta.miColor();
        System.out.println(miBicicleta.toString());
    }
}
