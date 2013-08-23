package model.entities;

import java.util.SortedSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Sort;
import org.hibernate.annotations.SortType;

@Entity
public class Instalacion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_instalacion;
	private String nombre;
	private Double precio;
	private String imagen;
	 @Sort(type=SortType.NATURAL)
	@OneToMany(cascade = CascadeType.ALL, mappedBy="instalaciones")
	private SortedSet<Reserva> listaReservas;
	
	
	public Instalacion() {
		super();
	}
	
	public Instalacion(Integer id_instalacion, String nombre, Double precio, String imagen) {
		super();
		this.id_instalacion = id_instalacion;
		this.nombre = nombre;
		this.precio = precio;
		this.imagen = imagen;
	}

	public Integer getId_Instalacion() {
		return id_instalacion;
	}

	public void setId_Instalacion(Integer id_Instalacion) {
		this.id_instalacion = id_Instalacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public SortedSet<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(SortedSet<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	
}
