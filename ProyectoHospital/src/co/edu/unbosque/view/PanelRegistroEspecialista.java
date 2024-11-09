package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelRegistroEspecialista extends JPanel {

	
	private JTextField nombre, numeroDocumento, correo, contraseña;
	private JComboBox<String> jcbTipoEspecialidad;
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
		


		String[] especialidad = {"Cirugía", "Oncología", "Dermatología", "Neumología", "Cardiología", "Medicina Interna" };
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(especialidad);

		jcbTipoEspecialidad = new JComboBox<>(modelo);
		jcbTipoEspecialidad.setBounds(530, 520, 260, 55);
		jcbTipoEspecialidad.setFont(new Font("Arial", Font.PLAIN, 16));
		

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
       	add(jcbTipoEspecialidad);
        add(btnRegistrarE);
        add(btnVolverEs);
        
        
        add(imagenRegistroE);
        
        

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




	public JComboBox<String> getJcbTipoEspecialidad() {
		return jcbTipoEspecialidad;
	}


	public void setJcbTipoEspecialidad(JComboBox<String> jcbTipoEspecialidad) {
		this.jcbTipoEspecialidad = jcbTipoEspecialidad;
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