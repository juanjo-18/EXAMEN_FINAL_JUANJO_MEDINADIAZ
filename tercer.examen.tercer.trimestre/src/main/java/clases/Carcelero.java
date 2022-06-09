package clases;

import java.util.ArrayList;

import Herencia.ObjetoConAtributos;

/**
 * Clase cuyas instancias representan a un carcelero, que se ocupa de vigilar a varios presos
 * @author Miguel Páramos
 *
 */
public class Carcelero extends ObjetoConAtributos{
	private ArrayList<Preso> presosASuCargo;
	
	/**
	 * Constructor de preso con todas las variables internas, menos el array de presos, que se inicializa vacío, de un carcelero.
	 * @param dni el dni del carcelero
	 * @param nombre el nombre del carcelero
	 * @param apellidos los apellidos del carcelero 
	 */
	
	
	
	
	public Carcelero(String dni, String nombre, String apellidos, ArrayList<Preso> presosASuCargo) {
		super(dni, nombre, apellidos);
		this.presosASuCargo = presosASuCargo;
	}

	/**
	 * toString de la clase carcelero, muestra formateada toda la información del mismo
	 * @return String con toda la información del carcelero
	 */
	@Override
	public String toString() {
		return "Carcelero DNI Nº : "+this.getDni();
	}
	
	
}
