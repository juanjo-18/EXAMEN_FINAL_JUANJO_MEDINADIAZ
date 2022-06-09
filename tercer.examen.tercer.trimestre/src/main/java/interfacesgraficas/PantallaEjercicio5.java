package interfacesgraficas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.SwingConstants;

import clases.Preso;
import excepciones.ValorInvalidoPeligrosidadException;
import utils.UtilsDB;

import javax.swing.JList;
import javax.swing.JButton;

public class PantallaEjercicio5  extends JPanel{
	private Ventana ventana;
	public PantallaEjercicio5(Ventana v) {
		TreeSet<Preso> presos = new TreeSet<Preso>();
		
		Statement smt = UtilsDB.conectarBD();
		try {
			ResultSet cursor = smt.executeQuery("select * from preso ");
			while (cursor.next()) {
				String dni=cursor.getString("dni");

				String nombre=cursor.getString("nombre");
				String apellidos=cursor.getString("apellidos");
				String mote=cursor.getString("mote");
				byte peligrosidad=cursor.getByte("peligrosidad");
				Preso preso=new Preso(dni,nombre,apellidos,mote,(byte)peligrosidad);
				presos.add(preso);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (ValorInvalidoPeligrosidadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		UtilsDB.desconectarBD();
		
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
