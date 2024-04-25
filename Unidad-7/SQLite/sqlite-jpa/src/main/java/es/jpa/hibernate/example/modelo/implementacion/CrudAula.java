package es.jpa.hibernate.example.modelo.implementacion;

import es.jpa.hibernate.example.modelo.abstractas.CrudEntityAbstract;
import es.jpa.hibernate.example.modelo.entities.Aula;
import es.jpa.hibernate.example.modelo.interfaces.IAula;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class CrudAula extends CrudEntityAbstract implements IAula {

    public CrudAula(EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public Aula getAula(int id) {
        Aula aula = new Aula(id);
        return getAula(aula);
    }

    @Override
    public Aula getAula(Aula aula) {
        return getEm().find(Aula.class,aula.getId());
    }

    @Override
    public boolean updateAula(Aula aula) {
        try {
            getEm().getTransaction().begin();
            getEm().merge(aula);
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
    public boolean addAula(Aula aula) {
        try {
            getEm().getTransaction().begin();
            getEm().persist(aula);
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
    public void deleteAula(int id) {
        deleteAula(new Aula(id));
    }


    @Override
    public void deleteAula(Aula aula) {
        try {
            getEm().getTransaction().begin();
            getEm().remove(aula);
            getEm().getTransaction().commit();
        }catch (Exception exception){
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }
}
