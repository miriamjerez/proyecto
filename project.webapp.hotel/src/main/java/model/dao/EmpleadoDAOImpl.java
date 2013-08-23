package model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.entities.Cliente;
import model.entities.Habitacion;
import model.entities.Hotel;
import model.entities.Instalacion;
import model.entities.LibroRegistroHotel;
import model.entities.Servicio;

public class EmpleadoDAOImpl implements EmpleadoDAO{

	@Autowired
	 private SessionFactory sessionFactory;
	
	@Override
	public String darAltaInstalacion(Instalacion i) {
		// TODO Auto-generated method stub
		try{
			/*Para dar de alta una instalación en la bbdd, si la
			 * registra, no hace nada y sino devuelvo la excepción
			 */
			 sessionFactory.getCurrentSession().save(i); 
			
		}catch(HibernateException e){
			return "Fallo al guardar la instalación:"+e.getMessage().toString();
		}
		
		return null;
	}

	@Override
	public String modificarInstalacion(Instalacion i) {
		// TODO Auto-generated method stub
		try{
			/*Para modificar la instalación de la bbdd, si la modifica
			 *  no devuelve nada y sino devuelvo la excepción
			 */
			 sessionFactory.getCurrentSession().update(i); 
			
		}catch(HibernateException e){
			return "Fallo al modificar la instalación:"+e.getMessage().toString();
		}
		
		return null;
	}

	@Override
	public String darBajaInstalacion(Instalacion i) {
		// TODO Auto-generated method stub
		try{
			/*Para borrar una instalación de la bbdd, si lo borra
			 * no devuelve nada y sino devuelvo la excepción
			 */
			 sessionFactory.getCurrentSession().delete(i); 
			
		}catch(HibernateException e){
			return "Fallo al guardar la instalación:"+e.getMessage().toString();
		}
		
		return null;
	}


	@Override
	public String alquilarInstalacion(LibroRegistroHotel lrh) {
		// TODO Auto-generated method stub
		try{
			/*Para dar de alta un alquiler de habitación en la bbdd, si la
			 * registra, no hace nada y sino devuelvo la excepción
			 */
			 sessionFactory.getCurrentSession().save(lrh); 
			
		}catch(HibernateException e){
			return "Fallo al guardar los datos de reserva del alquiler:"+e.getMessage().toString();
		}
		
		return null;
	}

	
}
