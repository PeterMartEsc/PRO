package ies.puerto.modelo.entity;

public class CuidadoPersonal extends Articulo{
    private int popularidad;
    public CuidadoPersonal(String id, String nombre, float precio, String fEntrada, int popularidad) {
        super(id, nombre, precio, fEntrada);
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id='" + this.getId() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fEntrada='" + getfEntrada() + '\'' +
                ", popularidad='" + popularidad + '\'' +
                '}';
    }

    @Override
    public String toCsv(){
        return getNombre()+ DELIMITADOR +getPrecio()
                +DELIMITADOR+getfEntrada()+DELIMITADOR+
                getId()+DELIMITADOR+popularidad;
    }

}
