package tercer.examen.tercer.trimestre;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import clases.Carcelero;
import clases.Preso;

/**
 * Clase principal que contiene el main
 * No se puede hacer una documentación exacta, porque su contenido depende del examen que vayas a hacer
 * @author Miguel Páramos
 *
 */
public class Principal { 

	/**
	 * Función main del programa. No se puede hacer una documentación exacta, porque su contenido depende del examen que vayas a hacer
	 * @param args No se puede hacer una documentación exacta, porque su contenido depende del examen que vayas a hacer
	 */
	public static void main(String[] args) {
		
		Queue<Preso> presos=new LinkedList<Preso>();
		presos.add(new Preso("32594323C","JAVIER","SANCHEZ PEREZ","CHILLAMAÑANAS",(byte)2));
		presos.add(new Preso("73941849F","CARLOS","DURAN ARIAS","CHUPACABRA",(byte)6));
		presos.add(new Preso("58493019Y","JESUS","CARMONA MORA","SOPLAGAITAS",(byte)1));
		presos.add(new Preso("91284738Q","ALEJANDRO","ROJAS SOTO","CARNE DE PESCUEZO",(byte)9));
		presos.add(new Preso("62913944T","AITOR","CASTILLO CORTES","EL JIERRO",(byte)4));
		presos.add(new Preso("18549232H","HECTOR","MARIN CANO","EL BASURILLA",(byte)4));
		
		
		Stack<Carcelero> carceleros=new Stack<Carcelero>();
		carceleros.add(new Carcelero("55402143J","FERNANDO","RAMIREZ GIL"));
		carceleros.add(new Carcelero("92934959R","JORGE","MORALES SERRANO"));
		carceleros.add(new Carcelero("40105043P","ADRIAN","BLANCO CASTRO"));
		carceleros.add(new Carcelero("27401233N","ALBERTO","ORTEGA SUAREZ"));
		
		
		
		
		
	}
	

}
