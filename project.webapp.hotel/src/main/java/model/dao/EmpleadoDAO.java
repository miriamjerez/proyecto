package model.dao;

import java.util.List;


import model.entities.Cliente;
import model.entities.Hotel;
import model.entities.Instalacion;
import model.entities.LibroRegistroHotel;


public interface EmpleadoDAO {
	public String darAltaInstalacion(Instalacion i);
	public String modificarInstalacion(Instalacion i);
	public String darBajaInstalacion(Instalacion i);
	public String alquilarInstalacion(LibroRegistroHotel lrh);

}
