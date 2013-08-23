package model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.entities.Empleado;
import model.entities.Instalacion;
import model.entities.Persona;

public class AdministradorDAOImpl implements AdministradorDAO{

	@Autowired
	 private SessionFactory sessionFactory;
	 Session session = sessionFactory.getCurrentSession();

	 
	 /*session.beginTransaction();

            aqui un insert, un update o un delete

            session.getTransaction().commit();

	  * (non-Javadoc)
	  * @see model.dao.AdministradorDAO#darAltaEmpleado(model.entities.Empleado)
	  */
	
	@Override
	public String darAltaEmpleado(Empleado em) {
		// TODO Auto-generated method stub
		try{
			/*Para guardar el empleado en la bbdd, si lo guarda,
			 * no hace nada y sino devuelvo la excepción
			 */
			 session.beginTransaction();
			 session.save(em);
			 session.getTransaction().commit();
			
		}catch(HibernateException e){
			/*Si ha habido algún fallo con la bbdd deshace los cambios realizados desde el 
			 * úlimo commit
			 */
			
			session.getTransaction().rollback();
			return "Fallo al guardar el empleado:"+e.getMessage().toString();
		}
		
		return null;
	}

	@Override
	public String modificarEmpleado(Empleado em) {
		// TODO Auto-generated method stub
		try{
			/*Para modificar el empleado de la bbdd, si lo modifica
			 *  no devuelve nada y sino devuelvo la excepción
			 */
			session.beginTransaction();
			session.update(em); 
			session.getTransaction().commit();
		}catch(HibernateException e){
			session.getTransaction().rollback();
			return "Fallo al modificar el empleado:"+e.getMessage().toString();
		}
		
		return null;
	}

	@Override
	public String darBajaEmpleado(Empleado em) {
		// TODO Auto-generated method stub
		try{
			/*Para borrar el empleado de la bbdd, si lo borra
			 *  no devuelve nada y sino devuelvo la excepción
			 */
			session.beginTransaction();
			session.delete(em); 
			session.getTransaction().commit();
		}catch(HibernateException e){
			session.getTransaction().rollback();
			return "Fallo al guardar el empleado:"+e.getMessage().toString();
		}
		
		return null;
	}

	@Override
	public List<Empleado> verListaEmpleado() {
		// TODO Auto-generated method stub
		return	 sessionFactory.getCurrentSession().createCriteria(Empleado.class).list();
				
	}

}
