package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelRegistroEspecialista extends JPanel {

	
	private JTextField nombre, numeroDocumento, correo, contraseña, tipoEspecialidad;
    private JButton  btnRegistrarE, btnVolverEs;
    private JLabel imagenRegistroE;
    

    public PanelRegistroEspecialista() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
		nombre= new JTextField();
		nombre.setBounds(155, 345, 300, 60);
		nombre.setOpaque(true);
		
		numeroDocumento = new JTextField();
		numeroDocumento.setBounds(160, 530, 300, 55);
		numeroDocumento.setOpaque(true);

		correo = new JTextField();
		correo.setBounds(780, 345, 300, 62);
		correo.setOpaque(true);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(930, 507, 300, 55);
		contraseña.setOpaque(true);
		
		tipoEspecialidad = new JPasswordField();
		tipoEspecialidad.setBounds(530, 520, 260, 55);
		tipoEspecialidad.setOpaque(true);

    

        // Botón "Registrarse"
		
        btnRegistrarE = new JButton("Registrar");
        btnRegistrarE.setBounds(690, 610, 160, 50); // Posición ajustada
        btnRegistrarE.setOpaque(true);
        btnRegistrarE.setActionCommand("REGISTRAR");

        // Botón "Volver"
        btnVolverEs = new JButton("Volver");
        btnVolverEs.setBounds(490, 610, 150, 50); // Posición ajustada
        btnVolverEs.setOpaque(true);
        btnVolverEs.setActionCommand("VOLVER");
        

        imagenRegistroE = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/RegistroEspecialista.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenRegistroE.setIcon(new ImageIcon(redimensionado1));
        imagenRegistroE.setBounds(0, 0, 1280, 720);


        
        
        add(nombre);
       	add(numeroDocumento);
       	add(correo);
       	add(contraseña);
       	add(tipoEspecialidad);
        add(btnRegistrarE);
        add(btnVolverEs);
        
        
        add(imagenRegistroE);
        
        
        setComponentZOrder(nombre, 0);
        setComponentZOrder(numeroDocumento, 1);
        setComponentZOrder(correo, 2);
        setComponentZOrder(contraseña, 3);
        setComponentZOrder(tipoEspecialidad, 4);
        setComponentZOrder(btnRegistrarE, 5);
        setComponentZOrder(btnVolverEs, 6);
        setComponentZOrder(imagenRegistroE, 7);
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


	public JTextField getTipoEspecialidad() {
		return tipoEspecialidad;
	}


	public void setTipoEspecialidad(JTextField tipoEspecialidad) {
		this.tipoEspecialidad = tipoEspecialidad;
	}


	public JButton getBtnRegistrarE() {
		return btnRegistrarE;
	}


	public void setBtnRegistrarE(JButton btnRegistrarE) {
		this.btnRegistrarE = btnRegistrarE;
	}


	public JButton getBtnVolverEs() {
		return btnVolverEs;
	}


	public void setBtnVolverEs(JButton btnVolverEs) {
		this.btnVolverEs = btnVolverEs;
	}


	public JLabel getImagenRegistroE() {
		return imagenRegistroE;
	}


	public void setImagenRegistroE(JLabel imagenRegistroE) {
		this.imagenRegistroE = imagenRegistroE;
	}


}