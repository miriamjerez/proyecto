package model.entities;

// Generated 22-ago-2013 19:07:55 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Hotel.
 * @see model.entities.Hotel
 * @author Hibernate Tools
 */
@Stateless
public class HotelHome {

	private static final Log log = LogFactory.getLog(HotelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Hotel transientInstance) {
		log.debug("persisting Hotel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Hotel persistentInstance) {
		log.debug("removing Hotel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Hotel merge(Hotel detachedInstance) {
		log.debug("merging Hotel instance");
		try {
			Hotel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Hotel findById(Integer id) {
		log.debug("getting Hotel instance with id: " + id);
		try {
			Hotel instance = entityManager.find(Hotel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
