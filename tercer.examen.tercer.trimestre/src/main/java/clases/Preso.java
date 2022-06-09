package clases;

/**
 * Clase cuyas instancias representan a un preso en una cárcel.
 * @author Miguel Páramos
 *
 */
public class Preso {
	/** El dni, que identifica de forma unívoca al preso**/
	private String dni;
	/** El nombre de pila del preso **/
	private String nombre;
	/** El mote carcelario del preso **/
	private String mote;
	/** Los apellidos del preso **/
	private String apellidos;
	/** La peligrosidad que se le considera al preso. DEBE ESTAR ENTRE 1 y 10. Siendo 1 muy poco peligroso, y 10 muy peligroso. **/
	private byte peligrosidad;
	
	/**
	 * Constructor de preso con todas las variables internas, que inicializa a un preso
	 * @param dni el dni del preso
	 * @param nombre el nombre del preso
	 * @param apellidos los apellidos del preso 
	 * @param mote el mote carcelario del preso
	 * @param peligrosidad La peligrosidad que se le considera al preso. DEBE ESTAR ENTRE 1 y 10. Siendo 1 muy poco peligroso, y 10 muy peligroso
	 */
	public Preso(String dni, String nombre, String apellidos, String mote,byte peligrosidad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mote=mote;
		this.peligrosidad = peligrosidad;
	}
	
	/**
	 * OJO! CONSTRUCTOR SIN COMPLETAR - SOLO LO TIENES QUE HACER SI TU VERSIÓN DEL EXAMEN TE LO PIDE
	 * Constructor vacío de preso, que crea un preso con características aleatorias. No se mira si el dni coincide con otro dni ya existente, por lo improbable de que entre
	 * tantas combinaciones posibles, se creen dni repetidos. No importa si nombres, apellidos y mote coinciden.
	 */
	public Preso() {
		String[] nombresPosibles= {"ANTONIO","MANUEL","JOSE","FRANCISCO","DAVID","JUAN","JOSE ANTONIO","JAVIER","DANIEL","JOSE LUIS","FRANCISCO JAVIER","CARLOS","JESUS","ALEJANDRO","MIGUEL","JOSE MANUEL","RAFAEL","MIGUEL ANGEL","PEDRO","PABLO","ANGEL","SERGIO","JOSE MARIA","FERNANDO","JORGE","LUIS","ALBERTO","JUAN CARLOS","ALVARO","ADRIAN","JUAN JOSE","DIEGO","RAUL","IVAN","JUAN ANTONIO","RUBEN","ENRIQUE","OSCAR","RAMON","VICENTE","ANDRES","JUAN MANUEL","JOAQUIN","SANTIAGO","VICTOR","EDUARDO","MARIO","ROBERTO","JAIME","FRANCISCO JOSE","MARCOS","IGNACIO","ALFONSO","JORDI","HUGO","RICARDO","SALVADOR","GUILLERMO","EMILIO","GABRIEL","MARC","GONZALO","JULIO","JULIAN","MOHAMED","JOSE MIGUEL","TOMAS","MARTIN","AGUSTIN","JOSE RAMON","NICOLAS","ISMAEL","JOAN","FELIX","SAMUEL","CRISTIAN","AITOR","LUCAS","HECTOR","JUAN FRANCISCO","IKER","JOSEP","JOSE CARLOS","ALEX","MARIANO","DOMINGO","SEBASTIAN","ALFREDO","CESAR","JOSE ANGEL","FELIPE","JOSE IGNACIO","VICTOR MANUEL","RODRIGO","LUIS MIGUEL","MATEO","JOSE FRANCISCO","JUAN LUIS","XAVIER","ALBERT"};
		String[] apellidosPosibles = {"GARCIA","RODRIGUEZ","GONZALEZ","FERNANDEZ","LOPEZ","MARTINEZ","SANCHEZ","PEREZ","GOMEZ","MARTIN","JIMENEZ","HERNANDEZ","RUIZ","DIAZ","MORENO","MUÑOZ","ALVAREZ","ROMERO","GUTIERREZ","ALONSO","NAVARRO","TORRES","DOMINGUEZ","RAMOS","VAZQUEZ","RAMIREZ","GIL","SERRANO","MORALES","MOLINA","BLANCO","SUAREZ","CASTRO","ORTEGA","DELGADO","ORTIZ","MARIN","RUBIO","NUÑEZ","SANZ","MEDINA","IGLESIAS","CASTILLO","CORTES","GARRIDO","SANTOS","GUERRERO","LOZANO","CANO","MENDEZ","CRUZ","PRIETO","FLORES","HERRERA","PEÑA","LEON","MARQUEZ","CABRERA","GALLEGO","CALVO","VIDAL","CAMPOS","REYES","VEGA","FUENTES","CARRASCO","DIEZ","AGUILAR","CABALLERO","NIETO","SANTANA","PASCUAL","HERRERO","VARGAS","GIMENEZ","MONTERO","HIDALGO","LORENZO","SANTIAGO","IBAÑEZ","DURAN","BENITEZ","FERRER","ARIAS","MORA","CARMONA","VICENTE","ROJAS","SOTO","CRESPO","ROMAN","PASTOR","VELASCO","PARRA","SAEZ","MOYA","BRAVO","SOLER","GALLARDO","RIVERA"};
		String[] motesPosibles= {"EL MONAGUILLO", "EL MARCIANO", "EL COME VIDRIOS","EL HECHICERO","BUENAS NOCHES","EL CHUPA DEDO","EL CALESITA","EL TRAPITO","EL CHAMPÚ","LOCO DE LA COLCHA","EL GATO","EL BOLSITA","EL PESCADO","CARA DE CAMIÓN","EL CHISPITA","EL BASURILLA","EL ATROPELLAVIEJAS","EL GOMINOLO","EL TRONCHABURRAS","EL MASCACHAPAS","EL LACASITOS","EL JIERRO","CERMUZO","EL MOCOS","CHUPACABRA","CARNE DE PESCUEZO","EL PINCHAUVAS","El ABRAZAFAROLAS","EL CARNICERO","TONTO DEL PUEBLO","HINTELIJENTE","EL TRAGACHICLES","YO NO HE SIDO","GANGSTA WANNABE","ROMPETERRONES","PANZABURRA","CERO A LA IZQUIERDA","HITLER","BESAMONOS","EL LARGO","CHILLAMAÑANAS","SOPLAGAITAS","LLAMADA COMERCIAL","REDIRECCION DE PUERTOS","SUSPENDEDOR DE PROGRAMACION","EL JUANKER","BOCACHANCLA"};
	}

	/**
	 * Getter de DNI, devuelve el DNI de la persona
	 * @return el DNI de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Setter de DNI, tiene que tener una parte con 8 números, y una parte con una letra, o  se lanzará una excepción.
	 * SOLO TIENES QUE PROTEGER ESTE SETTER SI TU EXAMEN ESPECÍFICO TE PIDE QUE LO HAGAS
	 * @param dni el nuevo dni de la persona
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Getter de nombre de la persona, devuelve el nombre con la primera letra de cada palabra en mayúscula, y el resto en minúsculas.
	 * SOLO TIENES QUE HACER ESTO SI TU EXAMEN ESPECÍFICO TE LO PIDE
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter de nombre de la persona. No puede tener números
	 * SOLO TIENES QUE PROTEGER ESTE SETTER SI TU EXAMEN ESPECÍFICO TE PIDE QUE LO HAGAS
	 * @param nombre nuevo nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * Getter de mote de la persona, devuelve el mote con la primera letra de cada palabra en mayúscula, y el resto en minúsculas.
	 * SOLO TIENES QUE HACER ESTO SI TU EXAMEN ESPECÍFICO TE LO PIDE
	 * @return mote de la persona
	 */
	public String getMote() {
		return mote;
	}


	/**
	 * Setter de mote de la persona. No puede tener números
	 * SOLO TIENES QUE PROTEGER ESTE SETTER SI TU EXAMEN ESPECÍFICO TE PIDE QUE LO HAGAS
	 * @param mote nuevo mote de la persona
	 */
	public void setMote(String mote) {
		this.mote = mote;
	}

	/**
	 * Getter de apellidos de la persona, devuelve los apellidos con la primera letra de cada palabra en mayúscula, y el resto en minúsculas.
	 * SOLO TIENES QUE HACER ESTO SI TU EXAMEN ESPECÍFICO TE LO PIDE
	 * @return apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * Setter de apellidos de la persona. No puede tener números
	 * SOLO TIENES QUE PROTEGER ESTE SETTER SI TU EXAMEN ESPECÍFICO TE PIDE QUE LO HAGAS
	 * @param apellidos nuevos apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * getter de peligrosidad del preso. Devolverá un número entre 1 y 10.
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
	 * toString de la clase preso, muestra formateada toda la información del mismo
	 * @return String con toda la información del preso
	 */
	@Override
	public String toString() {
		return "Preso DNI Nº : "+this.dni+"\n---------------------------\n"+this.nombre+" \""+this.mote+"\" "+this.apellidos+"\nPeligrosidad: "+this.peligrosidad;
	}
	
	
	
	
	
	
}
