package es.ies.puerto.modelo.db.interfaces;

import es.ies.puerto.exeption.SuperheroeException;
import es.ies.puerto.modelo.entities.Superheroe;

import java.util.Set;

public interface ICrudOperaciones {

    public Set<Superheroe> obtener(String query) throws SuperheroeException ;
    public Set<Superheroe> obtenerSuperheroes() throws SuperheroeException ;
    public Superheroe obtenerSuperheroe(Superheroe superheroe) throws SuperheroeException ;
    public void aniadirSuperheroe(Superheroe superheroe) throws SuperheroeException;
    public void borrarSuperheroe(Superheroe heroCharacter) throws SuperheroeException ;
    public void actualizarSuperheroe(Superheroe superheroe) throws SuperheroeException ;

}
