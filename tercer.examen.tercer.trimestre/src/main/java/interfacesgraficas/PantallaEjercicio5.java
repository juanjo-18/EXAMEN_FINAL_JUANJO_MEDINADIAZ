package interfacesgraficas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JList;
import javax.swing.JButton;

public class PantallaEjercicio5  extends JPanel{
	private Ventana ventana;
	public PantallaEjercicio5(Ventana v) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel labelTitulo = new JLabel("Todos los Carceleros");
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
		add(labelTitulo, BorderLayout.NORTH);
		
		JList list = new JList();
		add(list, BorderLayout.CENTER);
		
		JButton botonAregarPreso = new JButton("Agregar Preso");
		botonAregarPreso.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(botonAregarPreso, BorderLayout.SOUTH);
	}

}
