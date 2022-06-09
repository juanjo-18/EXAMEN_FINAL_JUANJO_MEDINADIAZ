package enumeraciones;

/**
 * Faltas que un preso puede cometer dentro de una C�rcel. Cuando las comete, su peligrosidad sube en funci�n de la falta.
 * @author Miguel P�ramos
 *
 */
public enum FaltaCarcelaria {
	METERSE_EN_PELEA,	//Si te metes en una pelea con otros presos
	ROBAR, //Si robas a otros presos, o material de la c�rcel
	MATAR, //Si matas a otro preso o a un carcelero
	INCUMPLIR_HORARIOS, //Si no est�s en el sitio al que se te llama en hora
	AGREDIR_CARCERLERO, //Si agredes a un carcelero
	PORTAR_ARMAS, //Si en un registro te encuentran armas
	TENENCIA_SUSTANCIAS, //Si en un registro te encuentran sustancias alucin�genas
	INTENTO_DE_ESCAPE, //Si intentas escapar de la prisi�n
	PARTICIPACION_MOTIN, //Si participas en un mot�n
	ENCABEZAR_MOTIN //Si eres uno de los cabecillas de un mot�n
}
