package es.ies.puerto.interfaces;

import es.ies.puerto.modelo.abstractas.ProductoAbstract;

import java.util.List;

public interface ICrudOperaciones {
    public boolean crearProducto(ProductoAbstract productoAbstract);
    public boolean eliminarProducto(ProductoAbstract producto);
    public List<ProductoAbstract> obtenerProductos();
    public ProductoAbstract obtenerProducto(ProductoAbstract productoAbstract);
    public boolean actualizarProducto(ProductoAbstract productoAbstract);

}
