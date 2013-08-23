package model.entities;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumns;

@Entity @IdClass(LibroRegistroHotelId.class)
/*Esta clase es para tener un registro de las reservs de un hotel determinado
, y de aquí sale el imprimir factura
*/
public class LibroRegistroHotel {
	@Id
	private Reserva reserva;
	@Id
	private Cliente cliente;
	//@OneToMany
	@JoinColumn(name = "dni")
	private Empleado empleado;
	@Id
	private Hotel hotel;
	
	public LibroRegistroHotel() {
		super();
	}

	

	public LibroRegistroHotel(Reserva reserva, Cliente cliente,
			Empleado empleado, Hotel hotel) {
		super();
		this.reserva = reserva;
		this.cliente = cliente;
		this.empleado = empleado;
		this.hotel = hotel;
	}



	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Empleado getEmpleado() {
		return empleado;
	}



	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}



	public Hotel getHotel() {
		return hotel;
	}



	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	

}
