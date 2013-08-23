package model.entities;

import java.util.Map;

import java.util.SortedSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames= { "numeroHabitacion" })}) 
public class Habitacion extends Instalacion{
	private String tipoHabitacion;
	private Integer numeroPersonas;
	private Integer numeroHabitacion;
	private Integer planta;
	
	
	
	public Habitacion() {
		super();
		
	}

	public Habitacion(String tipoHabitacion, Integer numeroPersonas,
			Integer numeroHabitacion, Integer planta) {
		super();
		this.tipoHabitacion = tipoHabitacion;
		this.numeroPersonas = numeroPersonas;
		this.numeroHabitacion = numeroHabitacion;
		this.planta = planta;
	}
	
	

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public Integer getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(Integer numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public Integer getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(Integer numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public Integer getPlanta() {
		return planta;
	}

	public void setPlanta(Integer planta) {
		this.planta = planta;
	}	
	
}
