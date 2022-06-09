package interfacesgraficas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Clase que hereda de JFrame, y que contendr� a las pantallas (Herederas de JPanel) del programa.
 * MODIFICA ESTA CLASE SOLO SI TU EXAMEN ESPEC�FICO TE LO PIDE
 * @author Miguel P�ramos
 *
 */
public class Ventana extends JFrame{
	
	
	/**
	 * Constructor de Ventana, que inicializa su tama�o, t�tulo e icono, y otras propiedades.
	 */
	public Ventana() {
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon ("./perroPirata.png").getImage());
		this.setResizable(false);
		this.setTitle("El �ltimo examen del a�o (o el pen�ltimo si suspendes)");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
	}
}
