package clases;

import excepciones.ValorInvalidoPeligrosidadException;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Random;

import Herencia.ObjetoConAtributos;

/**
 * Clase cuyas instancias representan a un preso en una cárcel.
 * 
 * @author Miguel Páramos
 *
 */
public class Preso extends ObjetoConAtributos {
	private String mote;
	/**
	 * La peligrosidad que se le considera al preso. DEBE ESTAR ENTRE 1 y 10. Siendo
	 * 1 muy poco peligroso, y 10 muy peligroso.
	 **/
	private byte peligrosidad;
	private LocalDate fechaIngreso;
	private LocalDate fechaSalida;

	public Preso(String dni, String nombre, String apellidos, String mote, byte peligrosidad, LocalDate fechaIngreso,
			LocalDate fechaSalida) throws ValorInvalidoPeligrosidadException {
		super(dni, nombre, apellidos);
		if (this.peligrosidadValida(peligrosidad) == false) {
			throw new ValorInvalidoPeligrosidadException("La peligrosidad es incorrecta tiene que estar entre 1 y 10");
		}
		this.mote = mote;
		this.peligrosidad = peligrosidad;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
	}

	public Preso(String dni, String nombre, String apellidos, String mote, byte peligrosidad)
			throws ValorInvalidoPeligrosidadException {
		super(dni, nombre, apellidos);
		if (this.peligrosidadValida(peligrosidad) == false) {
			throw new ValorInvalidoPeligrosidadException("La peligrosidad es incorrecta tiene que estar entre 1 y 10");
		}
		this.mote = mote;
		this.peligrosidad = peligrosidad;
	}

	/**
	 * OJO! CONSTRUCTOR SIN COMPLETAR - SOLO LO TIENES QUE HACER SI TU VERSIÓN DEL
	 * EXAMEN TE LO PIDE Constructor vacío de preso, que crea un preso con
	 * características aleatorias. No se mira si el dni coincide con otro dni ya
	 * existente, por lo improbable de que entre tantas combinaciones posibles, se
	 * creen dni repetidos. No importa si nombres, apellidos y mote coinciden.
	 * @throws ValorInvalidoPeligrosidadException 
	 */
	public Preso() throws ValorInvalidoPeligrosidadException {
		String[] nombresPosibles = { "ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO",
				"JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER", "CARLOS", "JESUS", "ALEJANDRO", "MIGUEL",
				"JOSE MANUEL", "RAFAEL", "MIGUEL ANGEL", "PEDRO", "PABLO", "ANGEL", "SERGIO", "JOSE MARIA", "FERNANDO",
				"JORGE", "LUIS", "ALBERTO", "JUAN CARLOS", "ALVARO", "ADRIAN", "JUAN JOSE", "DIEGO", "RAUL", "IVAN",
				"JUAN ANTONIO", "RUBEN", "ENRIQUE", "OSCAR", "RAMON", "VICENTE", "ANDRES", "JUAN MANUEL", "JOAQUIN",
				"SANTIAGO", "VICTOR", "EDUARDO", "MARIO", "ROBERTO", "JAIME", "FRANCISCO JOSE", "MARCOS", "IGNACIO",
				"ALFONSO", "JORDI", "HUGO", "RICARDO", "SALVADOR", "GUILLERMO", "EMILIO", "GABRIEL", "MARC", "GONZALO",
				"JULIO", "JULIAN", "MOHAMED", "JOSE MIGUEL", "TOMAS", "MARTIN", "AGUSTIN", "JOSE RAMON", "NICOLAS",
				"ISMAEL", "JOAN", "FELIX", "SAMUEL", "CRISTIAN", "AITOR", "LUCAS", "HECTOR", "JUAN FRANCISCO", "IKER",
				"JOSEP", "JOSE CARLOS", "ALEX", "MARIANO", "DOMINGO", "SEBASTIAN", "ALFREDO", "CESAR", "JOSE ANGEL",
				"FELIPE", "JOSE IGNACIO", "VICTOR MANUEL", "RODRIGO", "LUIS MIGUEL", "MATEO", "JOSE FRANCISCO",
				"JUAN LUIS", "XAVIER", "ALBERT" };
		String[] apellidosPosibles = { "GARCIA", "RODRIGUEZ", "GONZALEZ", "FERNANDEZ", "LOPEZ", "MARTINEZ", "SANCHEZ",
				"PEREZ", "GOMEZ", "MARTIN", "JIMENEZ", "HERNANDEZ", "RUIZ", "DIAZ", "MORENO", "MUÑOZ", "ALVAREZ",
				"ROMERO", "GUTIERREZ", "ALONSO", "NAVARRO", "TORRES", "DOMINGUEZ", "RAMOS", "VAZQUEZ", "RAMIREZ", "GIL",
				"SERRANO", "MORALES", "MOLINA", "BLANCO", "SUAREZ", "CASTRO", "ORTEGA", "DELGADO", "ORTIZ", "MARIN",
				"RUBIO", "NUÑEZ", "SANZ", "MEDINA", "IGLESIAS", "CASTILLO", "CORTES", "GARRIDO", "SANTOS", "GUERRERO",
				"LOZANO", "CANO", "MENDEZ", "CRUZ", "PRIETO", "FLORES", "HERRERA", "PEÑA", "LEON", "MARQUEZ", "CABRERA",
				"GALLEGO", "CALVO", "VIDAL", "CAMPOS", "REYES", "VEGA", "FUENTES", "CARRASCO", "DIEZ", "AGUILAR",
				"CABALLERO", "NIETO", "SANTANA", "PASCUAL", "HERRERO", "VARGAS", "GIMENEZ", "MONTERO", "HIDALGO",
				"LORENZO", "SANTIAGO", "IBAÑEZ", "DURAN", "BENITEZ", "FERRER", "ARIAS", "MORA", "CARMONA", "VICENTE",
				"ROJAS", "SOTO", "CRESPO", "ROMAN", "PASTOR", "VELASCO", "PARRA", "SAEZ", "MOYA", "BRAVO", "SOLER",
				"GALLARDO", "RIVERA" };
		String[] motesPosibles = { "EL MONAGUILLO", "EL MARCIANO", "EL COME VIDRIOS", "EL HECHICERO", "BUENAS NOCHES",
				"EL CHUPA DEDO", "EL CALESITA", "EL TRAPITO", "EL CHAMPÚ", "LOCO DE LA COLCHA", "EL GATO", "EL BOLSITA",
				"EL PESCADO", "CARA DE CAMIÓN", "EL CHISPITA", "EL BASURILLA", "EL ATROPELLAVIEJAS", "EL GOMINOLO",
				"EL TRONCHABURRAS", "EL MASCACHAPAS", "EL LACASITOS", "EL JIERRO", "CERMUZO", "EL MOCOS", "CHUPACABRA",
				"CARNE DE PESCUEZO", "EL PINCHAUVAS", "El ABRAZAFAROLAS", "EL CARNICERO", "TONTO DEL PUEBLO",
				"HINTELIJENTE", "EL TRAGACHICLES", "YO NO HE SIDO", "GANGSTA WANNABE", "ROMPETERRONES", "PANZABURRA",
				"CERO A LA IZQUIERDA", "HITLER", "BESAMONOS", "EL LARGO", "CHILLAMAÑANAS", "SOPLAGAITAS",
				"LLAMADA COMERCIAL", "REDIRECCION DE PUERTOS", "SUSPENDEDOR DE PROGRAMACION", "EL JUANKER",
				"BOCACHANCLA" };

		Random randon = new Random();
		
		int año = randon.nextInt(22)+2000;
		int mes = randon.nextInt(11)+1;
		int dia = randon.nextInt(31)+1;

		LocalDate fechaEntrada = LocalDate.of(año, mes, dia);
		año = randon.nextInt(22)+2000;
		mes = randon.nextInt(11)+1;
		dia = randon.nextInt(30)+1;
		LocalDate fechaSalida = LocalDate.of(año, mes, dia);
		int numeroDni=randon.nextInt(89999999)+10000000;
		char letra=(char) (randon.nextInt(122)+97);
		String dni=numeroDni+""+letra;
		String mote=motesPosibles[randon.nextInt(motesPosibles.length)];
		String nombre=nombresPosibles[randon.nextInt(nombresPosibles.length)];
		String apellido1=apellidosPosibles[randon.nextInt(apellidosPosibles.length)];
		String apellido2=apellidosPosibles[randon.nextInt(apellidosPosibles.length)];
		String apellidos=apellido1+" "+apellido2;
		byte peligrosidad=(byte) (randon.nextInt(9)+1);
		Preso preso=new Preso(dni,nombre,apellidos,mote,peligrosidad,fechaEntrada,fechaSalida);
		System.out.println(motesPosibles[randon.nextInt(motesPosibles.length)]);
		//System.out.println(rand.nextInt(motesPosibles.length));
		//String mote=motesPosibles[rand.nextInt(motesPosibles.length)];
		//System.out.println(mote);
		

	}

	/**
	 * Getter de mote de la persona, devuelve el mote con la primera letra de cada
	 * palabra en mayúscula, y el resto en minúsculas. SOLO TIENES QUE HACER ESTO SI
	 * TU EXAMEN ESPECÍFICO TE LO PIDE
	 * 
	 * @return mote de la persona
	 */
	public String getMote() {
		return mote;
	}

	/**
	 * Setter de mote de la persona. No puede tener números SOLO TIENES QUE PROTEGER
	 * ESTE SETTER SI TU EXAMEN ESPECÍFICO TE PIDE QUE LO HAGAS
	 * 
	 * @param mote nuevo mote de la persona
	 */
	public void setMote(String mote) {
		this.mote = mote;
	}

	/**
	 * getter de peligrosidad del preso. Devolverá un número entre 1 y 10.
	 * 
	 * @return nivel de peligrosidad del preso. 1 es muy poco peligroso, 10 es muy
	 *         peligroso.
	 */
	public byte getPeligrosidad() {
		return peligrosidad;
	}

	/**
	 * Setter de peligrosidad del preso. DEBE SER UN NUMERO ENTRE 1 y 10.
	 * 
	 * @param peligrosidad es el nivel de peligrosidad del preso. DEBE SER UN NUMERO
	 *                     ENTRE 1 y 10. 1 es muy poco peligroso, 10 es muy
	 *                     peligroso.
	 */
	public boolean peligrosidadValida(byte peligrosidad) {
		if (peligrosidad < 1 && peligrosidad > 10) {
			return false;
		} else {
			return true;
		}

	}

	public void setPeligrosidad(byte peligrosidad) throws ValorInvalidoPeligrosidadException {
		if (this.peligrosidadValida(peligrosidad) == false) {
			throw new ValorInvalidoPeligrosidadException("La peligrosidad es incorrecta tiene que estar entre 1 y 10");
		}
		this.peligrosidad = peligrosidad;
	}

	/**
	 * toString de la clase preso, muestra formateada toda la información del mismo
	 * 
	 * @return String con toda la información del preso
	 */

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	@Override
	public String toString() {
		return "Preso DNI Nº : " + this.getDni() + " fecha ingreso: " + this.getFechaIngreso() + " fecha salida: "
				+ this.getFechaSalida();
	}

}
