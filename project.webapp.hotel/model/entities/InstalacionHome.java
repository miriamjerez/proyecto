package model.entities;

// Generated 22-ago-2013 19:07:55 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Instalacion.
 * @see model.entities.Instalacion
 * @author Hibernate Tools
 */
@Stateless
public class InstalacionHome {

	private static final Log log = LogFactory.getLog(InstalacionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Instalacion transientInstance) {
		log.debug("persisting Instalacion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Instalacion persistentInstance) {
		log.debug("removing Instalacion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Instalacion merge(Instalacion detachedInstance) {
		log.debug("merging Instalacion instance");
		try {
			Instalacion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Instalacion findById(Integer id) {
		log.debug("getting Instalacion instance with id: " + id);
		try {
			Instalacion instance = entityManager.find(Instalacion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
