package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;


public class PanelMenuDirectorMedico extends JPanel {

	private JLabel imagenMenuD;
    private JButton btnIniciarSesionD, btnRegistrarseD, btnVolverDE;

    public PanelMenuDirectorMedico() {
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
        

        // Botón "Iniciar sesión"
        btnIniciarSesionD = new JButton("Iniciar Sesión");
        btnIniciarSesionD.setBounds(205, 520, 310, 50); // Posición ajustada
        btnIniciarSesionD.setOpaque(false);
        btnIniciarSesionD.setActionCommand("INICIARSESION");

        // Botón "Registrarse"
        btnRegistrarseD = new JButton("Registrarse");
        btnRegistrarseD.setBounds(800, 520, 320, 50); // Posición ajustada
        btnRegistrarseD.setOpaque(false);
        btnRegistrarseD.setActionCommand("REGISTRARSE");

        // Botón "Volver"
        btnVolverDE = new JButton("Volver");
        btnVolverDE.setBounds(585, 610, 150, 50); // Posición ajustada
        btnVolverDE.setOpaque(false);
        btnVolverDE.setActionCommand("VOLVER");
        

        imagenMenuD = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MenuDirectorMedico.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMenuD.setIcon(new ImageIcon(redimensionado1));
        imagenMenuD.setBounds(0, 0, 1280, 720);

        
        
       
        add(btnIniciarSesionD);
        add(btnRegistrarseD);
        add(btnVolverDE);
        add(imagenMenuD);
        
        
           }

	

	public JButton getBtnIniciarSesionD() {
		return btnIniciarSesionD;
	}

	public void setBtnIniciarSesionD(JButton btnIniciarSesionD) {
		this.btnIniciarSesionD = btnIniciarSesionD;
	}

	public JButton getBtnRegistrarseD() {
		return btnRegistrarseD;
	}

	public void setBtnRegistrarseD(JButton btnRegistrarseD) {
		this.btnRegistrarseD = btnRegistrarseD;
	}

	public JButton getBtnVolverDE() {
		return btnVolverDE;
	}

	public void setBtnVolverDE(JButton btnVolverDE) {
		this.btnVolverDE = btnVolverDE;
	}

	public JLabel getImagenMenuD() {
		return imagenMenuD;
	}

	public void setImagenMenuD(JLabel imagenMenuD) {
		this.imagenMenuD = imagenMenuD;
	}
    // Métodos getters y setters para las imágenes y los botones

}