package model.entities;
// Generated 22-ago-2013 18:01:14 by Hibernate Tools 4.0.0


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class LibroRegistroHotel.
 * @see model.entities.LibroRegistroHotel
 * @author Hibernate Tools
 */
@Stateless
public class LibroRegistroHotelHome {

    private static final Log log = LogFactory.getLog(LibroRegistroHotelHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(LibroRegistroHotel transientInstance) {
        log.debug("persisting LibroRegistroHotel instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(LibroRegistroHotel persistentInstance) {
        log.debug("removing LibroRegistroHotel instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public LibroRegistroHotel merge(LibroRegistroHotel detachedInstance) {
        log.debug("merging LibroRegistroHotel instance");
        try {
            LibroRegistroHotel result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
}

