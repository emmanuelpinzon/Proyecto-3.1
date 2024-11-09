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
    
        
       
		nombre= new JTextField("nombre");
		nombre.setBounds(155, 345, 300, 60);
		nombre.setOpaque(true);
		
		numeroDocumento = new JTextField("cedula");
		numeroDocumento.setBounds(160, 507, 300, 55);
		numeroDocumento.setOpaque(true);

		correo = new JTextField("correo");
		correo.setBounds(780, 345, 300, 62);
		correo.setOpaque(true);
		
		contraseña = new JPasswordField("contraseña");
		contraseña.setBounds(785, 507, 300, 55);
		contraseña.setOpaque(true);
		
		String[] genero = { "Femenino", "Masculino" };
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(genero);

		jcbGenero = new JComboBox<>(modelo);
		jcbGenero.setBounds(500, 500, 280, 50);
		jcbGenero.setFont(new Font("Arial", Font.PLAIN, 16));
		add(jcbGenero);

		

		setVisible(true);

	

    

        // Botón "Registrarse"
		
        btnRegistrarP = new JButton("Registrar");
        btnRegistrarP.setBounds(640, 600, 200, 50); // Posición ajustada
        btnRegistrarP.setOpaque(true);
        btnRegistrarP.setActionCommand("REGISTRAR");

        // Botón "Volver"
        btnVolverP1 = new JButton("Volver");
        btnVolverP1.setBounds(490, 610, 150, 50); // Posición ajustada
        btnVolverP1.setOpaque(true);
        btnVolverP1.setActionCommand("VOLVER");
        

        imagenRegistroP = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/RegistrarPaciente.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenRegistroP.setIcon(new ImageIcon(redimensionado1));
        imagenRegistroP.setBounds(0, 0, 1280, 720);


        
        
        add(nombre);
       	add(numeroDocumento);
       	add(correo);
       	add(contraseña);
       	add(jcbGenero);
        add(btnRegistrarP);
        add(btnVolverP1);
        
        add(imagenRegistroP);
        
        
        setComponentZOrder(nombre, 0);
        setComponentZOrder(numeroDocumento, 1);
        setComponentZOrder(correo, 2);
        setComponentZOrder(contraseña, 3);
        setComponentZOrder(jcbGenero, 4);
        setComponentZOrder(btnRegistrarP, 5);
        setComponentZOrder(btnVolverP1, 6);
        setComponentZOrder(imagenRegistroP, 7);
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