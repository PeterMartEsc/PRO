package es.ies.puerto.modelo.file;

import es.ies.puerto.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.abstractas.FicheroAbstract;
import es.ies.puerto.modelo.abstractas.ProductoAbstract;

import java.io.File;
import java.util.List;

public class CsvFileCrupOperaciones extends FicheroAbstract implements ICrudOperaciones  {

    @Override
    public boolean crearProducto(ProductoAbstract productoAbstract) {

        return false;




    }

    @Override
    public boolean eliminarProducto(ProductoAbstract productoAbstract) {
        return false;
    }

    @Override
    public List<ProductoAbstract> obtenerProductos() {
        return null;
    }

    @Override
    public ProductoAbstract obtenerProducto(ProductoAbstract productoAbstract) {
        return null;
    }

    @Override
    public boolean actualizarProducto(ProductoAbstract productoAbstract) {
        return false;
    }
}
