package model.entities;

// Generated 22-ago-2013 19:07:55 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Empleado.
 * @see model.entities.Empleado
 * @author Hibernate Tools
 */
@Stateless
public class EmpleadoHome {

	private static final Log log = LogFactory.getLog(EmpleadoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Empleado transientInstance) {
		log.debug("persisting Empleado instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Empleado persistentInstance) {
		log.debug("removing Empleado instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Empleado merge(Empleado detachedInstance) {
		log.debug("merging Empleado instance");
		try {
			Empleado result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Empleado findById(String id) {
		log.debug("getting Empleado instance with id: " + id);
		try {
			Empleado instance = entityManager.find(Empleado.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
