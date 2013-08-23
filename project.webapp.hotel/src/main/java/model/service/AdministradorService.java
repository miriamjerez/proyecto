package model.service;

import java.util.List;

import model.entities.Empleado;


public interface AdministradorService {
	public String darAltaEmpleado(Empleado em);
	public String modificarEmpleado(Empleado em);
	public String darBajaEmpleado(Empleado em);
	public List<Empleado> verListaEmpleado();
}
