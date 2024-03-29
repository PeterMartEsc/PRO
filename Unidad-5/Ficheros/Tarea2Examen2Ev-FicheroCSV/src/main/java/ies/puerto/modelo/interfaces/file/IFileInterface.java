package ies.puerto.modelo.interfaces.file;

import ies.puerto.modelo.abstractas.entity.Producto;

import java.util.List;

public interface IFileInterface {

    public List<Producto> lectura(String path, String articulo);
    public boolean escritura(String path, String contenido);
}
