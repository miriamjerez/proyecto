package model.service;

import java.util.Date;
import java.util.Iterator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.dao.ClienteDAO;
import model.entities.Cliente;
import model.entities.Habitacion;
import model.entities.Instalacion;
import model.entities.Reserva;
import model.entities.Servicio;


public class ClienteServiceImpl implements ClienteService {
	@Autowired
	 private ClienteDAO clienteDAO;
	@Override
	public boolean comprobarDisp(Instalacion instalacion, Date fechaInicio,
			Date fechaFin) {
		// TODO Auto-generated method stub
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
		return clienteDAO.darAltaCliente(c);
	}

	@Override
	public String modificarCliente(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String darBajaCliente(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findById(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Instalacion> verListInstalaciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instalacion verInstalacion(Instalacion i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reserva reservarInstalacion(Reserva r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserva> verListaReservaPorCliente(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
