package model.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Pattern;
import org.hibernate.validator.Size;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames= { "seguridadSocial,numCuenta" })}) 

public class Empleado extends Persona{
	 @NotNull
	 @Size(min = 12, max = 12, message = "Introduzca un número correcto")
	 @Pattern(regex = "[0-9]*", message = "sólo puede contener números")
	private String seguridadSocial;
	private String permisos;
	@NotNull
	@Size(min = 16, max = 16)
	@Pattern(regex = "[0-9]*", message = "sólo puede contener números")
	private Integer numCuenta;
	
	public Empleado() {
		super();
	}

	public Empleado(String seguridadSocial, String permisos, Integer numCuenta) {
		super();
		this.seguridadSocial = seguridadSocial;
		this.permisos = permisos;
		this.numCuenta = numCuenta;
	}

	public String getSeguridadSocial() {
		return seguridadSocial;
	}

	public void setSeguridadSocial(String seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}

	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}

	public Integer getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(Integer numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	
	
}
