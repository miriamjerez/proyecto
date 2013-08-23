package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Columns;
import org.hibernate.validator.NotNull;
import org.hibernate.validator.Pattern;
import org.hibernate.validator.Size;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames= { "NUMEROTARJETA" })}) 
public class Cliente extends Persona{
	@Column(name = "NUMEROTARJETA")
	@NotNull
    @Size(min = 16, max = 16)
	@Pattern(regex = "[0-9]*", message = "sólo puede contener números")
	private Integer numeroTarjeta;

	public Cliente() {
		super();
	}

	public Cliente(Integer numeroTarjeta) {
		super();
		this.numeroTarjeta = numeroTarjeta;
	}

	public Integer getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Integer numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
		
}
