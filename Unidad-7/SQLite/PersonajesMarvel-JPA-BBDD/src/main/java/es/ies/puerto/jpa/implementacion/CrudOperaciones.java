package es.ies.puerto.jpa.implementacion;

import es.ies.puerto.modelo.abstractas.CrudAbstract;
import es.ies.puerto.modelo.entities.Superheroe;
import es.ies.puerto.modelo.interfaces.ICrud;

import javax.persistence.EntityManagerFactory;

public class CrudOperaciones extends CrudAbstract implements ICrud {

    public CrudOperaciones(EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public Superheroe getSuperheroe(int id) {
        Superheroe superheroe = new Superheroe(id);
        return getSuperheroe(superheroe);
    }

    @Override
    public Superheroe getSuperheroe(Superheroe superheroe) {
        return getEm().find(Superheroe.class,superheroe.getId());
    }

    @Override
    public boolean updateSuperheroe(Superheroe superheroe) {

        try {
            getEm().getTransaction().begin();
            getEm().merge(superheroe);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }

    @Override
    public boolean addSuperheroe(Superheroe superheroe) {
        try {
            getEm().getTransaction().begin();
            getEm().persist(superheroe);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }

    @Override
    public void deleteSuperheroe(int id) {
        deleteSuperheroe(new Superheroe(id));
    }

    @Override
    public void deleteSuperheroe(Superheroe superheroe) {
        try {
            getEm().getTransaction().begin();
            getEm().remove(superheroe);
            getEm().getTransaction().commit();
        }catch (Exception exception){
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }
}
