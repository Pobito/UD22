package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.*;

public class Vista extends JFrame {

	private JPanel panelB, panelR;
	public JButton insertar, borrar, select, update;
	public JLabel respuesta;
	public JTextField texto;
	
	public Vista () {
		getContentPane().setLayout(new BorderLayout());
		
		panelB = new JPanel();
		panelB.setLayout(new FlowLayout());

		panelR = new JPanel();
		panelR.setLayout(new FlowLayout());
		
		insertar = new JButton ("Insertar");
		borrar = new JButton ("Borrar");
		select = new JButton ("Select");
		update = new JButton ("Udpate");
		
		respuesta = new JLabel("Respuesta: ");
		texto = new JTextField(20);
		
		panelB.add(borrar);
		panelB.add(insertar);
		panelB.add(select);
		panelB.add(update);
		
		panelR.add(respuesta);
		
		add(texto, BorderLayout.NORTH);
		add(panelB, BorderLayout.SOUTH);
		add(panelR, BorderLayout.CENTER);
	}
	

}
