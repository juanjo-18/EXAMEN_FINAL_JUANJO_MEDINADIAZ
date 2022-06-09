package clases;

import Herencia.ObjetoConAtributos;

/**
 * Clase cuyas instancias representan a un preso en una c�rcel.
 * @author Miguel P�ramos
 *
 */
public class Preso extends ObjetoConAtributos{
	private String mote;
	/** La peligrosidad que se le considera al preso. DEBE ESTAR ENTRE 1 y 10. Siendo 1 muy poco peligroso, y 10 muy peligroso. **/
	private byte peligrosidad;
	
	
	

	public Preso(String dni, String nombre, String apellidos, String mote, byte peligrosidad) {
		super(dni, nombre, apellidos);
		this.mote = mote;
		this.peligrosidad = peligrosidad;
	}

	/**
	 * OJO! CONSTRUCTOR SIN COMPLETAR - SOLO LO TIENES QUE HACER SI TU VERSI�N DEL EXAMEN TE LO PIDE
	 * Constructor vac�o de preso, que crea un preso con caracter�sticas aleatorias. No se mira si el dni coincide con otro dni ya existente, por lo improbable de que entre
	 * tantas combinaciones posibles, se creen dni repetidos. No importa si nombres, apellidos y mote coinciden.
	 */
	public Preso(String dni, String nombre, String apellidos) {
		super(dni, nombre, apellidos);
		String[] nombresPosibles= {"ANTONIO","MANUEL","JOSE","FRANCISCO","DAVID","JUAN","JOSE ANTONIO","JAVIER","DANIEL","JOSE LUIS","FRANCISCO JAVIER","CARLOS","JESUS","ALEJANDRO","MIGUEL","JOSE MANUEL","RAFAEL","MIGUEL ANGEL","PEDRO","PABLO","ANGEL","SERGIO","JOSE MARIA","FERNANDO","JORGE","LUIS","ALBERTO","JUAN CARLOS","ALVARO","ADRIAN","JUAN JOSE","DIEGO","RAUL","IVAN","JUAN ANTONIO","RUBEN","ENRIQUE","OSCAR","RAMON","VICENTE","ANDRES","JUAN MANUEL","JOAQUIN","SANTIAGO","VICTOR","EDUARDO","MARIO","ROBERTO","JAIME","FRANCISCO JOSE","MARCOS","IGNACIO","ALFONSO","JORDI","HUGO","RICARDO","SALVADOR","GUILLERMO","EMILIO","GABRIEL","MARC","GONZALO","JULIO","JULIAN","MOHAMED","JOSE MIGUEL","TOMAS","MARTIN","AGUSTIN","JOSE RAMON","NICOLAS","ISMAEL","JOAN","FELIX","SAMUEL","CRISTIAN","AITOR","LUCAS","HECTOR","JUAN FRANCISCO","IKER","JOSEP","JOSE CARLOS","ALEX","MARIANO","DOMINGO","SEBASTIAN","ALFREDO","CESAR","JOSE ANGEL","FELIPE","JOSE IGNACIO","VICTOR MANUEL","RODRIGO","LUIS MIGUEL","MATEO","JOSE FRANCISCO","JUAN LUIS","XAVIER","ALBERT"};
		String[] apellidosPosibles = {"GARCIA","RODRIGUEZ","GONZALEZ","FERNANDEZ","LOPEZ","MARTINEZ","SANCHEZ","PEREZ","GOMEZ","MARTIN","JIMENEZ","HERNANDEZ","RUIZ","DIAZ","MORENO","MU�OZ","ALVAREZ","ROMERO","GUTIERREZ","ALONSO","NAVARRO","TORRES","DOMINGUEZ","RAMOS","VAZQUEZ","RAMIREZ","GIL","SERRANO","MORALES","MOLINA","BLANCO","SUAREZ","CASTRO","ORTEGA","DELGADO","ORTIZ","MARIN","RUBIO","NU�EZ","SANZ","MEDINA","IGLESIAS","CASTILLO","CORTES","GARRIDO","SANTOS","GUERRERO","LOZANO","CANO","MENDEZ","CRUZ","PRIETO","FLORES","HERRERA","PE�A","LEON","MARQUEZ","CABRERA","GALLEGO","CALVO","VIDAL","CAMPOS","REYES","VEGA","FUENTES","CARRASCO","DIEZ","AGUILAR","CABALLERO","NIETO","SANTANA","PASCUAL","HERRERO","VARGAS","GIMENEZ","MONTERO","HIDALGO","LORENZO","SANTIAGO","IBA�EZ","DURAN","BENITEZ","FERRER","ARIAS","MORA","CARMONA","VICENTE","ROJAS","SOTO","CRESPO","ROMAN","PASTOR","VELASCO","PARRA","SAEZ","MOYA","BRAVO","SOLER","GALLARDO","RIVERA"};
		String[] motesPosibles= {"EL MONAGUILLO", "EL MARCIANO", "EL COME VIDRIOS","EL HECHICERO","BUENAS NOCHES","EL CHUPA DEDO","EL CALESITA","EL TRAPITO","EL CHAMP�","LOCO DE LA COLCHA","EL GATO","EL BOLSITA","EL PESCADO","CARA DE CAMI�N","EL CHISPITA","EL BASURILLA","EL ATROPELLAVIEJAS","EL GOMINOLO","EL TRONCHABURRAS","EL MASCACHAPAS","EL LACASITOS","EL JIERRO","CERMUZO","EL MOCOS","CHUPACABRA","CARNE DE PESCUEZO","EL PINCHAUVAS","El ABRAZAFAROLAS","EL CARNICERO","TONTO DEL PUEBLO","HINTELIJENTE","EL TRAGACHICLES","YO NO HE SIDO","GANGSTA WANNABE","ROMPETERRONES","PANZABURRA","CERO A LA IZQUIERDA","HITLER","BESAMONOS","EL LARGO","CHILLAMA�ANAS","SOPLAGAITAS","LLAMADA COMERCIAL","REDIRECCION DE PUERTOS","SUSPENDEDOR DE PROGRAMACION","EL JUANKER","BOCACHANCLA"};
	}

	

	
	/**
	 * Getter de mote de la persona, devuelve el mote con la primera letra de cada palabra en may�scula, y el resto en min�sculas.
	 * SOLO TIENES QUE HACER ESTO SI TU EXAMEN ESPEC�FICO TE LO PIDE
	 * @return mote de la persona
	 */
	public String getMote() {
		return mote;
	}


	/**
	 * Setter de mote de la persona. No puede tener n�meros
	 * SOLO TIENES QUE PROTEGER ESTE SETTER SI TU EXAMEN ESPEC�FICO TE PIDE QUE LO HAGAS
	 * @param mote nuevo mote de la persona
	 */
	public void setMote(String mote) {
		this.mote = mote;
	}

	


	/**
	 * getter de peligrosidad del preso. Devolver� un n�mero entre 1 y 10.
	 * @return nivel de peligrosidad del preso. 1 es muy poco peligroso, 10 es muy peligroso.
	 */
	public byte getPeligrosidad() {
		return peligrosidad;
	}

	/**
	 * Setter de peligrosidad del preso. DEBE SER UN NUMERO ENTRE 1 y 10.
	 * @param peligrosidad es el nivel de peligrosidad del preso. DEBE SER UN NUMERO ENTRE 1 y 10. 1 es muy poco peligroso, 10 es muy peligroso.
	 */
	public void setPeligrosidad(byte peligrosidad) {
		this.peligrosidad = peligrosidad;
	}

	/**
	 * toString de la clase preso, muestra formateada toda la informaci�n del mismo
	 * @return String con toda la informaci�n del preso
	 */
	@Override
	public String toString() {
		return "Preso DNI N� : "+getDni();
	}
	
	
	
	
	
	
}
