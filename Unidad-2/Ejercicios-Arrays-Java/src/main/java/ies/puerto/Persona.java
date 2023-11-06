package ies.puerto;

/**
 * @author Peter Mart Esc
 */

public class Persona {

    private String nombre;

    private int edad;

    private String email;

    private int telefono;

    /**
     * Persona vacío es constructor por defecto de la clase
     */

    public Persona(){

    }

    /**
     * Constructor con el parámetro nombre
     * @param nombre de la persona
     */

    public Persona (String nombre){
        this.nombre = nombre;
    }

    /**
     * Constructor de la clase con el nombre y la edad
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona (String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;

    }

    /**
     * Constructor de la clase de la persona
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     */
    public Persona (String nombre, int edad, String email ){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public Persona (String nombre, int edad, String email, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }


    /**
     *Getters/Setters de la clase
     */

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimir (){
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:"+ edad);
        System.out.println("Email" + email);
        System.out.println("Telefono:" + telefono);
    }

    public String imprimir(){
        return "Nombre:" + nombre + "Edad" + edad + "Email" + email + "Telefono" + telefono;
    }

}