package ies.puerto;

public class Tienda {

    Producto producto;

    public Tienda (Producto producto){
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}