package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames= { "nombreHotel", "telefono","direccion" })}) 
public class Hotel {
	@Id
	private Integer id;
	private String nombreHotel;
	private String direccion;
	private int telefono;
	private int numEstrellas;
//	@ManyToOne(cascade = CascadeType.ALL, mappedBy="instalaciones")
	private ArrayList<Instalacion> instalaciones;
//	@OneToMany(cascade = CascadeType.ALL, mappedBy="dni")
	private ArrayList<Persona> listaEmpleados;
	public Hotel() {
		super();
	}
	public Hotel(Integer id, String nombreHotel, String direccion,
			int telefono, int numEstrellas, ArrayList<Instalacion> instalaciones,
			ArrayList<Persona> listaEmpleados) {
		super();
		this.id = id;
		this.nombreHotel = nombreHotel;
		this.direccion = direccion;
		this.telefono = telefono;
		this.numEstrellas = numEstrellas;
		this.instalaciones = instalaciones;
		this.listaEmpleados = listaEmpleados;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreHotel() {
		return nombreHotel;
	}
	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getNumEstrellas() {
		return numEstrellas;
	}
	public void setNumEstrellas(int numEstrellas) {
		this.numEstrellas = numEstrellas;
	}
	public List<Instalacion> getInstalaciones() {
		return instalaciones;
	}
	public void setInstalaciones(ArrayList<Instalacion> instalaciones) {
		this.instalaciones = instalaciones;
	}
	
	public List<Persona> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Persona> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	public List<Servicio> listarServiciosDisponibles(Date d){
		List<Servicio> ls = new ArrayList();
		
		return ls;
	}
}
