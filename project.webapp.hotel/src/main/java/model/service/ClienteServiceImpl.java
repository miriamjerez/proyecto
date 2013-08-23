package model.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.dao.ClienteDAO;
import model.dao.ContactDAO;
import model.entities.Cliente;
import model.entities.Habitacion;
import model.entities.Instalacion;
import model.entities.Reserva;
import model.entities.Servicio;


public class ClienteServiceImpl implements ClienteService {

	@Override
	public boolean comprobarDisp(Instalacion instalacion, Date fechaInicio,
			Date fechaFin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String darAltaCliente(Cliente c) {
		// TODO Auto-generated method stub
		return null;
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
