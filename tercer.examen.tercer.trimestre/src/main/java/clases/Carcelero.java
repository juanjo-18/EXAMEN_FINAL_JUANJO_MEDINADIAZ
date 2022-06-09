package clases;

import java.util.ArrayList;

/**
 * Clase cuyas instancias representan a un carcelero, que se ocupa de vigilar a varios presos
 * @author Miguel P�ramos
 *
 */
public class Carcelero {
	/** El dni, que identifica de forma un�voca al carcelero**/
	private String dni;
	/** El nombre de pila del carcelero **/
	private String nombre;
	/** Los apellidos del carcelero **/
	private String apellidos;
	/** Los presos de los que el carcelero se ocupa **/
	private ArrayList<Preso> presosASuCargo;
	
	/**
	 * Constructor de preso con todas las variables internas, menos el array de presos, que se inicializa vac�o, de un carcelero.
	 * @param dni el dni del carcelero
	 * @param nombre el nombre del carcelero
	 * @param apellidos los apellidos del carcelero 
	 */
	public Carcelero(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.presosASuCargo=new ArrayList<Preso>();
	}
	
	
	/**
	 * Getter de DNI, devuelve el DNI de la persona
	 * @return el DNI de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Setter de DNI, tiene que tener una parte con 8 n�meros, y una parte con una letra, o  se lanzar� una excepci�n.
	 * SOLO TIENES QUE PROTEGER ESTE SETTER SI TU EXAMEN ESPEC�FICO TE PIDE QUE LO HAGAS
	 * @param dni el nuevo dni de la persona
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Getter de nombre de la persona, devuelve el nombre con la primera letra de cada palabra en may�scula, y el resto en min�sculas.
	 * SOLO TIENES QUE HACER ESTO SI TU EXAMEN ESPEC�FICO TE LO PIDE
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter de nombre de la persona. No puede tener n�meros
	 * SOLO TIENES QUE PROTEGER ESTE SETTER SI TU EXAMEN ESPEC�FICO TE PIDE QUE LO HAGAS
	 * @param nombre nuevo nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * Getter de apellidos de la persona, devuelve los apellidos con la primera letra de cada palabra en may�scula, y el resto en min�sculas.
	 * SOLO TIENES QUE HACER ESTO SI TU EXAMEN ESPEC�FICO TE LO PIDE
	 * @return apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * Setter de apellidos de la persona. No puede tener n�meros
	 * SOLO TIENES QUE PROTEGER ESTE SETTER SI TU EXAMEN ESPEC�FICO TE PIDE QUE LO HAGAS
	 * @param apellidos nuevos apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * toString de la clase carcelero, muestra formateada toda la informaci�n del mismo
	 * @return String con toda la informaci�n del carcelero
	 */
	@Override
	public String toString() {
		return "Carcelero DNI N� : "+this.dni+"\n---------------------------\n"+this.nombre+" "+this.apellidos;
	}
	
	
}
