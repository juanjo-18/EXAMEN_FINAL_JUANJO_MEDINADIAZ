package enumeraciones;

/**
 * Faltas que un preso puede cometer dentro de una Cárcel. Cuando las comete, su peligrosidad sube en función de la falta.
 * @author Miguel Páramos
 *
 */
public enum FaltaCarcelaria {
	METERSE_EN_PELEA,	//Si te metes en una pelea con otros presos
	ROBAR, //Si robas a otros presos, o material de la cárcel
	MATAR, //Si matas a otro preso o a un carcelero
	INCUMPLIR_HORARIOS, //Si no estás en el sitio al que se te llama en hora
	AGREDIR_CARCERLERO, //Si agredes a un carcelero
	PORTAR_ARMAS, //Si en un registro te encuentran armas
	TENENCIA_SUSTANCIAS, //Si en un registro te encuentran sustancias alucinógenas
	INTENTO_DE_ESCAPE, //Si intentas escapar de la prisión
	PARTICIPACION_MOTIN, //Si participas en un motín
	ENCABEZAR_MOTIN //Si eres uno de los cabecillas de un motín
}
