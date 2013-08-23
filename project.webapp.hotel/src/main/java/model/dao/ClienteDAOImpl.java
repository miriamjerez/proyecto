package model.dao;

import java.util.Date;
import java.util.List;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.entities.Cliente;
import model.entities.Contact;
import model.entities.Habitacion;
import model.entities.Instalacion;
import model.entities.Reserva;
import model.entities.Servicio;

public class ClienteDAOImpl implements ClienteDAO {
	
	@Autowired
	 private SessionFactory sessionFactory;
	Session session = sessionFactory.getCurrentSession();

	public boolean comprobarDisp(Instalacion instalacion, Date fechaInicio,
			Date fechaFin) {
		/* Cada habitación tiene una lista de reservas.
		 * dicha lista está ordenada. Si
		 *  */
		boolean disp = false;
	
		if(instalacion.getListaReservas().isEmpty()){
			return true;
		}else{
			//Comprobamos si la fecha de fin de nuestra reserva es anterior a todas las de la lista,si es asi añadimos la reserva
			if(instalacion.getListaReservas().first().getFechaInicio().after(fechaFin)){
				
					disp=  true;
			}else{
				/*Recorremos toda la lista, de forma que encuentre el primero en el cual 
				la fecha fin sea anterior a la fecha inicio que quiero hacer la reserva
				y cuando la encuentra comprueba que la fecha inicio de la siguiente reserva
				sea posterior que la fecha fin de mi reserva*/
					Iterator<Reserva> it = instalacion.getListaReservas().iterator();
					while(it.hasNext()){
						
						if(it.next().getFechaFin().before(fechaInicio)){
							if(it.next().getFechaInicio().after(fechaFin))
								disp = true;
							else
								disp =  false;
						}
				}
		}
	}
		return disp;
		
	}

	@Override
	public String darAltaCliente(Cliente c) {
		// TODO Auto-generated method stub
		try{
			/*Para guardar el cliente en la bbdd si lo guarda,
			 * no hace nada y sino devuelvo la excepción
			 */
			session.beginTransaction();
			 sessionFactory.getCurrentSession().save(c); 
			session.getTransaction().commit();
		}catch(HibernateException e){
			return "Fallo al guardar el cliente:"+e.getMessage().toString();
		}
		
		return null;
	}

	@Override
	public String modificarCliente(Cliente c) {
		// TODO Auto-generated method stub
		try{
			/*Para modificar el cliente en la bbdd si lo modifica
			 *  no devuelve nada y sino devuelvo la excepción
			 */
			 sessionFactory.getCurrentSession().update(c); 
			
		}catch(HibernateException e){
			return "Fallo al modificar el cliente:"+e.getMessage().toString();
		}
		
		return null;
	}

	@Override
	public String darBajaCliente(Cliente c) {
		// TODO Auto-generated method stub
		try{
			/*Para borrar el cliente de la bbdd, si lo borra
			 * no devuelve nada y sino devuelvo la excepción
			 */
			 sessionFactory.getCurrentSession().delete(c); 
			
		}catch(HibernateException e){
			return "Fallo al guardar el cliente:"+e.getMessage().toString();
		}
		
		return null;
		
	}

	/*@Override
	public void verPantallaContraseña() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validarContraseña() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verPantallaCliente() {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public List<Instalacion> verListInstalaciones() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM instalacion"; 
		List<Instalacion> li = (List<Instalacion>) sessionFactory.getCurrentSession().createSQLQuery(sql);
		return li;
	}


	@Override
	public Instalacion verInstalacion(Instalacion i) {
		// TODO Auto-generated method stub
		Instalacion instalacion = (Instalacion) sessionFactory.getCurrentSession().load(
				 Instalacion.class, i.getId_Instalacion());
		return instalacion;
	}

	@Override
	public Reserva reservarInstalacion(Reserva r) {
		// TODO Auto-generated method stub
	 return (Reserva) sessionFactory.getCurrentSession().save(r);
	}


	@Override
	//Para buscar un Cliente a través de su DNI
	public Cliente findById(String dni) {
		// TODO Auto-generated method stub
		return (Cliente) sessionFactory.getCurrentSession().createCriteria(Cliente.class, dni);
	}

	@Override
	public List<Reserva> verListaReservaPorCliente(Cliente c) {
		// TODO Auto-generated method stub
		return session.createCriteria(Reserva.class, c.getDni()).list();
		
		
	}

	
	

}
