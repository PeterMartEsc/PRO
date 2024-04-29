package es.ies.puerto.modelo.db.interfaces;

import es.ies.puerto.exeption.SuperheroeException;
import es.ies.puerto.modelo.entities.Superheroe;

import java.util.Set;

public interface ICrudOperaciones {

    public Set<Superheroe> obtenerSuperheroes() throws SuperheroeException;

    public Superheroe obtenerSuperheroe(Superheroe superHeroe) throws SuperheroeException;

    public void aniadirHeroe(Superheroe superheroe) throws SuperheroeException;

    public void borrarHeroe(Superheroe superheroe) throws SuperheroeException;

    public void actualizarHeroe(Superheroe superheroe) throws SuperheroeException;

}
