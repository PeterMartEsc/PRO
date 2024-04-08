package es.ies.puerto.modelo.db.interfaces;

import es.ies.puerto.modelo.Superheroe;

import java.util.List;

public interface ICrudOperaciones {

    public List<Superheroe> obtenerSuperheroes();

    public Superheroe obtenerSuperheroe(Superheroe superHeroe);

    public void aniadirHeroe(Superheroe superheroe);

    public void borrarHeroe(Superheroe superheroe);

    public void actualizarHeroe(Superheroe superheroe);

}
