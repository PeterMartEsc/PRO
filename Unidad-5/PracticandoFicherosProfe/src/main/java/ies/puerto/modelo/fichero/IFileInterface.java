package ies.puerto.modelo.fichero;

import ies.puerto.modelo.entity.Articulo;

import java.util.List;

public interface IFileInterface {
    public List<Articulo> lectura(String path, String articulo);
    public boolean escritura(String path, String contenido);
}
