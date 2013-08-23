package model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Reserva implements Comparable<Object>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO )
	private Integer id_reserva;
	private Double precio;
	private Date fechaInicio;
	private Date fechaFin;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name="id")
	private Instalacion instalaciones;
	
	public Reserva() {
		super();
	}

	public Reserva(Date fechaInicio, Instalacion instalaciones) {
		super();
		this.fechaInicio = fechaInicio;
		this.instalaciones = instalaciones;
	}

	public Reserva(Integer id, Double precio, Date fechaInicio, Date fechaFin,
			Cliente cliente, Instalacion instalaciones) {
		super();
		this.id_reserva = id;
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cliente = cliente;
		this.instalaciones = instalaciones;
	}

	public Integer getId() {
		return id_reserva;
	}

	public void setId(Integer id) {
		this.id_reserva = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Instalacion getInstalaciones() {
		return instalaciones;
	}

	public void setInstalaciones(Instalacion instalaciones) {
		this.instalaciones = instalaciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		return true;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.fechaInicio.compareTo(((Reserva)o).fechaInicio);
	}
	
	
	
	
}
