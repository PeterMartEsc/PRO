package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.entity.BibliotecaEntity;
import es.ies.puerto.modelo.entity.LibroEntity;

import java.util.List;

public interface IBiblioteca {

    public BibliotecaEntity buscarBiblioteca(int id);
    public BibliotecaEntity buscarBiblioteca(BibliotecaEntity bibliotecaEntity);

    public BibliotecaEntity updateBiblioteca(BibliotecaEntity bibliotecaEntity);

    public BibliotecaEntity deleteBiblioteca(BibliotecaEntity bibliotecaEntity);

    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity);
}
