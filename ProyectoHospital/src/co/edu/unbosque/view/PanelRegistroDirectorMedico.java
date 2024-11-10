package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelRegistroDirectorMedico extends JPanel {

	
	private JTextField nombreD, numeroDocumentoD, correoD, contraseñaD;
    private JButton  btnRegistrarDM, btnVolverDM;
    private JLabel imagenRegistroDM;
    

    public PanelRegistroDirectorMedico() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
        
    
        
       
		nombreD= new JTextField();
		nombreD.setBounds(155, 345, 300, 60);
		nombreD.setOpaque(true);
		
		numeroDocumentoD = new JTextField();
		numeroDocumentoD.setBounds(160, 507, 300, 55);
		numeroDocumentoD.setOpaque(true);

		correoD = new JTextField();
		correoD.setBounds(780, 345, 300, 62);
		correoD.setOpaque(true);
		
		contraseñaD = new JPasswordField();
		contraseñaD.setBounds(785, 507, 300, 55);
		contraseñaD.setOpaque(true);
		



	

    

      
		
        btnRegistrarDM = new JButton("Registrar");
        btnRegistrarDM.setBounds(640, 600, 200, 50); // Posición ajustada
        btnRegistrarDM.setOpaque(true);
        btnRegistrarDM.setActionCommand("REGISTRARDM");

        // Botón "Volver"
        btnVolverDM = new JButton("Volver");
        btnVolverDM.setBounds(490, 610, 150, 50); // Posición ajustada
        btnVolverDM.setOpaque(true);
        btnVolverDM.setActionCommand("VOLVER");
        

        imagenRegistroDM = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/RegistrarDirectorMedico.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenRegistroDM.setIcon(new ImageIcon(redimensionado1));
        imagenRegistroDM.setBounds(0, 0, 1280, 720);


        
        
        add(nombreD);
       	add(numeroDocumentoD);
       	add(correoD);
       	add(contraseñaD);
       	
        add(btnRegistrarDM);
        add(btnVolverDM);
        
        add(imagenRegistroDM);
        
        
       
           }


	public JTextField getNombreD() {
		return nombreD;
	}


	public void setNombreD(JTextField nombreD) {
		this.nombreD = nombreD;
	}


	public JTextField getNumeroDocumentoD() {
		return numeroDocumentoD;
	}


	public void setNumeroDocumentoD(JTextField numeroDocumentoD) {
		this.numeroDocumentoD = numeroDocumentoD;
	}


	public JTextField getCorreoD() {
		return correoD;
	}


	public void setCorreoD(JTextField correoD) {
		this.correoD = correoD;
	}


	public JTextField getContraseñaD() {
		return contraseñaD;
	}


	public void setContraseñaD(JTextField contraseñaD) {
		this.contraseñaD = contraseñaD;
	}


	public JButton getBtnRegistrarDM() {
		return btnRegistrarDM;
	}


	public void setBtnRegistrarDM(JButton btnRegistrarDM) {
		this.btnRegistrarDM = btnRegistrarDM;
	}


	public JButton getBtnVolverDM() {
		return btnVolverDM;
	}


	public void setBtnVolverDM(JButton btnVolverDM) {
		this.btnVolverDM = btnVolverDM;
	}


	public JLabel getImagenRegistroDM() {
		return imagenRegistroDM;
	}


	public void setImagenRegistroDM(JLabel imagenRegistroDM) {
		this.imagenRegistroDM = imagenRegistroDM;
	}


}