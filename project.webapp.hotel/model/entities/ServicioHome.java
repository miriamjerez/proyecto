package model.entities;

// Generated 22-ago-2013 19:07:55 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Servicio.
 * @see model.entities.Servicio
 * @author Hibernate Tools
 */
@Stateless
public class ServicioHome {

	private static final Log log = LogFactory.getLog(ServicioHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Servicio transientInstance) {
		log.debug("persisting Servicio instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Servicio persistentInstance) {
		log.debug("removing Servicio instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Servicio merge(Servicio detachedInstance) {
		log.debug("merging Servicio instance");
		try {
			Servicio result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Servicio findById(Integer id) {
		log.debug("getting Servicio instance with id: " + id);
		try {
			Servicio instance = entityManager.find(Servicio.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
