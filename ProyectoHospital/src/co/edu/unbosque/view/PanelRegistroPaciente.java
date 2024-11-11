package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelRegistroPaciente extends JPanel {

	private JTextField nombre, numeroDocumento, correo, contraseña;
	private JComboBox<String> jcbGenero;
    private JButton  btnRegistrarP, btnVolverP1;
    private JLabel imagenRegistroP;
    

    public PanelRegistroPaciente() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
		nombre= new JTextField();
		nombre.setBounds(99, 348, 230, 60);
		nombre.setBorder(null);
		nombre.setOpaque(true);
		
		numeroDocumento = new JTextField();
		numeroDocumento.setBounds(130, 520, 230, 55);
		numeroDocumento.setBorder(null);
		numeroDocumento.setOpaque(true);

		correo = new JTextField();
		correo.setBounds(860, 344, 240, 34);
		correo.setBorder(null);
		correo.setOpaque(true);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(858, 515, 240, 45);
		contraseña.setBorder(null);
		contraseña.setOpaque(true);
		
		String[] genero = { "Femenino", "Masculino" };
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(genero);

		jcbGenero = new JComboBox<>(modelo);
		jcbGenero.setBounds(500, 490, 280, 60);
		jcbGenero.setBorder(null);
		jcbGenero.setFont(new Font("Arial", Font.PLAIN, 16));

	
        // Botón "Registrarse"
		
        btnRegistrarP = new JButton("Registrar");
        btnRegistrarP.setBounds(700, 600, 200, 65); // Posición ajustada
        btnRegistrarP.setOpaque(true);
        btnRegistrarP.setActionCommand("REGISTRAR");

        // Botón "Volver"
        btnVolverP1 = new JButton("Volver");
        btnVolverP1.setBounds(430, 600, 150, 65); // Posición ajustada
        btnVolverP1.setOpaque(true);
        btnVolverP1.setActionCommand("VOLVER");
        

        imagenRegistroP = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/RegistrarPaciente.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenRegistroP.setIcon(new ImageIcon(redimensionado1));
        imagenRegistroP.setBounds(0, 0, 1280, 720);


        
        add(imagenRegistroP);
    	add(jcbGenero);
        add(btnRegistrarP);
        add(btnVolverP1);
        add(nombre);
       	add(numeroDocumento);
       	add(correo);
       	add(contraseña);
       
        
       
        setVisible(true);

           }


	public JTextField getNombre() {
		return nombre;
	}


	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}


	public JTextField getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(JTextField numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public JTextField getCorreo() {
		return correo;
	}


	public void setCorreo(JTextField correo) {
		this.correo = correo;
	}


	public JTextField getContraseña() {
		return contraseña;
	}


	public void setContraseña(JTextField contraseña) {
		this.contraseña = contraseña;
	}


	public JComboBox<String> getJcbGenero() {
		return jcbGenero;
	}


	public void setJcbGenero(JComboBox<String> jcbGenero) {
		this.jcbGenero = jcbGenero;
	}


	public JButton getBtnRegistrarP() {
		return btnRegistrarP;
	}


	public void setBtnRegistrarP(JButton btnRegistrarP) {
		this.btnRegistrarP = btnRegistrarP;
	}


	public JButton getBtnVolverP1() {
		return btnVolverP1;
	}


	public void setBtnVolverP1(JButton btnVolverP1) {
		this.btnVolverP1 = btnVolverP1;
	}


	public JLabel getImagenRegistroP() {
		return imagenRegistroP;
	}


	public void setImagenRegistroP(JLabel imagenRegistroP) {
		this.imagenRegistroP = imagenRegistroP;
	}


	




    }
