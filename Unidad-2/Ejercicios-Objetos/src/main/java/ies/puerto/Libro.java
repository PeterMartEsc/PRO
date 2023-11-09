package ies.puerto;

public class Libro {

    private String titulo;

    private String autor;

    private int anioPublicacion;

    public Libro() {
    }

    /**
     * Constructor de la clase de Libro con todos sus parámetros
     * @param titulo del libro
     * @param autor del libro
     * @param anioPublicacion del libro
     */

    public Libro (String titulo, String autor, int anioPublicacion){

        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void imprimirLista (){
        System.out.println("Título:" + titulo);
        System.out.println("Autor:"+ autor);
        System.out.println("Año de Publicación" + anioPublicacion);
    }

    public String imprimirLinea (){
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion;
    }

}