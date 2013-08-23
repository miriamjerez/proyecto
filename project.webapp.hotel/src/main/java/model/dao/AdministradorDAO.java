package model.dao;


import java.util.List;

import model.entities.Empleado;
import model.entities.Persona;

public interface AdministradorDAO {
	public String darAltaEmpleado(Empleado em);
	public String modificarEmpleado(Empleado em);
	public String darBajaEmpleado(Empleado em);
	public List<Empleado> verListaEmpleado();
}
