package interfaces;

import clases.Preso;

/**
 * Interfaz para la clase Carcelero, para que tenga funciones para a�adir y quitar un preso a su variable interna presosASuCargo.
 * @author Miguel P�ramos
 *
 */
public interface GestionPresos {
	/**
	 * Funci�n que permite a�adir un preso al cargo de un carcelero
	 * @param p preso que se va a a�adir al cargo de un carcelero
	 * @return true si el preso no estaba ya a su cargo, y se puede insertar. False si el preso ya estaba a su cargo antes, y por tanto no se puede insertar.
	 */
	public boolean a�adirPreso (Preso p);
	
	/**
	 * Funci�n que permite quitar un preso al cargo de un carcelero
	 * @param p preso que se va a quitar de la custodia de un carcelero
	 * @return true si el preso ya estaba a su cargo y se ha podido borrar. False si el preso no estaba a su cargo, y por tanto no puede eliminarlo.
	 */
	public boolean quitarPreso (Preso p);
	
}
