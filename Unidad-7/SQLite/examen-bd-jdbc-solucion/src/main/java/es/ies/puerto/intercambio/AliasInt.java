package es.ies.puerto.intercambio;

public class AliasInt {

    String id;
    String descripcion;

    public AliasInt() {
    }

    public AliasInt(String id) {
        this.id = id;
    }

    public AliasInt(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
