package model.dao;

import java.util.Date;
import java.util.List;


import model.entities.Cliente;
import model.entities.Habitacion;
import model.entities.Instalacion;
import model.entities.Reserva;
import model.entities.Servicio;

public interface ClienteDAO {
	
	/*public boolean comprobarDisp(Instalacion instalacion, Date fechaInicio, Date fechaFin);
	 * Lo ponemos en el servicio no aquí
	 */
	public String darAltaCliente(Cliente c);
	public String modificarCliente(Cliente c);
	public String darBajaCliente(Cliente c);
	public Cliente findById(String dni);
	//public void verPantallaContraseña();
	//public void validarContraseña();
	//public void verPantallaCliente();
	public List<Instalacion> verListInstalaciones();
	public Instalacion verInstalacion(Instalacion i);
	public Reserva reservarInstalacion(Reserva r);
	public List<Reserva> verListaReservaPorCliente(Cliente c);
}
