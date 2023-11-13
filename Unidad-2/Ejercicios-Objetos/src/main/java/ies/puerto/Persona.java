package ies.puerto;

/**
 * @author PeterMartEsc
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
     * Constructor de la clase de la persona
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     * @param telefono de la persona
     */

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

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método para devolver los datos en formato de lista
     */
    public void imprimirLista (){
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:"+ edad);
        System.out.println("Email" + email);
        System.out.println("Telefono:" + telefono);
    }

    /**
     * Método para devolver los datos en formato línea.
     * @return
     */

    public String imprimirLinea(){
        return "Nombre:" + nombre + "Edad" + edad + "Email" + email + "Telefono" + telefono;
    }

}