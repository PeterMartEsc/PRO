package es.ies.puerto.modelo.entity;

public class LibroEntity {

    private String isbn;
    private String titulo;
    private String autor;
    private String fechaPublicacion;

    private int id_biblioteca;

    public LibroEntity(){

    }

    public LibroEntity(String isbn, String titulo, String autor, String fechaPublicacion, int id_biblioteca) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.id_biblioteca = id_biblioteca;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

}
