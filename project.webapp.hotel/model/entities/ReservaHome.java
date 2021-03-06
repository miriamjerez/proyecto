package model.entities;

// Generated 22-ago-2013 19:07:55 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Reserva.
 * @see model.entities.Reserva
 * @author Hibernate Tools
 */
@Stateless
public class ReservaHome {

	private static final Log log = LogFactory.getLog(ReservaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Reserva transientInstance) {
		log.debug("persisting Reserva instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Reserva persistentInstance) {
		log.debug("removing Reserva instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Reserva merge(Reserva detachedInstance) {
		log.debug("merging Reserva instance");
		try {
			Reserva result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Reserva findById(Integer id) {
		log.debug("getting Reserva instance with id: " + id);
		try {
			Reserva instance = entityManager.find(Reserva.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
