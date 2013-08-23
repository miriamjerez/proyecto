package model.entities;

import javax.persistence.Entity;

@Entity
public class Servicio extends Instalacion{
	private String tipoServicio;

	public Servicio() {
		super();
	}

	public Servicio(String tipoServicio) {
		super();
		this.tipoServicio = tipoServicio;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	
}
