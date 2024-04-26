package es.ies.puerto.jpa.abstractas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class CrudAbstract {

    EntityManager em;

    EntityManagerFactory emf;

    public CrudAbstract(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEm() {
        if (em == null || (!em.isOpen())) {
            em = emf.createEntityManager();
        }
        return em;
    }

}
