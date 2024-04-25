package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.entities.Superheroe;

public interface ICrud {
    public Superheroe getSuperheroe(int id);
    public Superheroe getSuperheroe(Superheroe superheroe);
    public boolean updateSuperheroe(Superheroe superheroe);
    public boolean addSuperheroe(Superheroe superheroe);
    public void deleteSuperheroe(int id);
    public void deleteSuperheroe(Superheroe superheroe);
}
