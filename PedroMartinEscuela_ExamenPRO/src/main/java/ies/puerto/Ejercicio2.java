package ies.puerto;

public class Ejercicio2 {

    /**
     * Declaramos las variables en privado
     */

    private String nombre;

    private int edad;

    private double peso;

    private double altura;

     double imc;

    /**
     * Método por defecto para que funcione
     */

    public Ejercicio2(){

    }

    /**
     * Constructor para obtener la primera variable
     * @param nombre del estudiante
     */

    public Ejercicio2(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor para obtener las dos primeras variable
     * @param nombre del estudiante
     * @param edad del estudiante
     */

    public Ejercicio2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Constructor para obtener las tres primeras variable
     * @param nombre del estudiante
     * @param edad del estudiante
     * @param peso del estudiante
     */

    public Ejercicio2(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    /**
     * Constructor para obtener las cuatro primeras variable
     * @param nombre del estudiante
     * @param edad del estudiante
     * @param peso del estudiante
     * @param altura del estudiante
     */

    public Ejercicio2(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Implemento todos los Getters y Setters de las variables
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC (double imc){

        this.imc=imc;

        imc = this.peso / (this.altura * this.altura);

        return imc;
    }

    /**
     * Método para imprimir por pantalla todos los datos
     */

    public void devolverDatos(){

        System.out.println("Nombre: " +this.nombre);
        System.out.println("Edad: " +this.edad);
        System.out.println("Peso: " +this.peso);
        System.out.println("Altura: " +this.altura);
        System.out.println("Indice de Masa Corporal: " +calcularIMC(imc));
    }
}
