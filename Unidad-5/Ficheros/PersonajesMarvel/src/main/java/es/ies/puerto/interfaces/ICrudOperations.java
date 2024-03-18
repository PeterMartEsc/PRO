package es.ies.puerto.interfaces;

import es.ies.puerto.impl.SuperHeroe;

import java.util.List;

public interface ICrudOperations {

    public List<SuperHeroe> obtenerSuperHeroes();

    public SuperHeroe obtenerSuperHeroe(SuperHeroe superHeroe);

    public void addHeroe(SuperHeroe superHeroe);

    public void deleteHeroe(SuperHeroe superHeroe);

    public void updateHeroe(SuperHeroe superHeroe);
}
