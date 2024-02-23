package es.ies.puerto.modelo.ficheros.csv.implementacion;

import es.ies.puerto.modelo.entity.BibliotecaEntity;
import es.ies.puerto.modelo.entity.LibroEntity;
import es.ies.puerto.modelo.ficheros.abstractas.BibliotecaAbstractFile;
import es.ies.puerto.modelo.interfaces.IBiblioteca;

import java.util.List;

public class BibliotecaCsv extends BibliotecaAbstractFile implements IBiblioteca {

    @Override
    public BibliotecaEntity buscarBiblioteca(int id) {
        return null;
    }

    @Override
    public BibliotecaEntity buscarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity updateBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity deleteBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }


}
