package interfacesgraficas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Clase que hereda de JFrame, y que contendrá a las pantallas (Herederas de JPanel) del programa.
 * MODIFICA ESTA CLASE SOLO SI TU EXAMEN ESPECÍFICO TE LO PIDE
 * @author Miguel Páramos
 *
 */
public class Ventana extends JFrame{
	
	
	/**
	 * Constructor de Ventana, que inicializa su tamaño, título e icono, y otras propiedades.
	 */
	public Ventana() {
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon ("./perroPirata.png").getImage());
		this.setResizable(false);
		this.setTitle("El último examen del año (o el penúltimo si suspendes)");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
	}
}
