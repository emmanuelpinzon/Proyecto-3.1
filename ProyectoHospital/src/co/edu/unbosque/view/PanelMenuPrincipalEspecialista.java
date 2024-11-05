package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;


public class PanelMenuPrincipalEspecialista extends JPanel {

	private JLabel imagenMenuPpalE;
    private JButton btnRealizarCambioTurno, btnMostrarCitasProgramadas, btnAceptarCambioTurno, btnVolverEE;

    public PanelMenuPrincipalEspecialista() {
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        

        
        btnRealizarCambioTurno = new JButton("realizar cambio de turno");
        btnRealizarCambioTurno.setBounds(145, 435, 220, 170); // Posición ajustada
        btnRealizarCambioTurno.setOpaque(false);
        btnRealizarCambioTurno.setActionCommand("realizar cambio de turno");

       
        btnMostrarCitasProgramadas = new JButton("Mostrar citas programadas");
        btnMostrarCitasProgramadas.setBounds(565, 440, 220, 200); // Posición ajustada
        btnMostrarCitasProgramadas.setOpaque(false);
        btnMostrarCitasProgramadas.setActionCommand("MOSTRAR CITAS PROGRAMADAS");
        
        btnAceptarCambioTurno= new JButton("Aceptar cambio de turno");
        btnAceptarCambioTurno.setBounds(960, 420, 220, 200); // Posición ajustada
        btnAceptarCambioTurno.setOpaque(false);
        btnAceptarCambioTurno.setActionCommand("ACEPTAR CAMBIO TURNO");
        
       
        btnVolverEE = new JButton("Volver");
        btnVolverEE.setBounds(610, 280, 150, 65); // Posición ajustada
        btnVolverEE.setOpaque(false);
        btnVolverEE.setActionCommand("VOLVER");
        
        imagenMenuPpalE = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MenuPrincipalEspecialista.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMenuPpalE.setIcon(new ImageIcon(redimensionado1));
        imagenMenuPpalE.setBounds(0, 0, 1280, 720);
      

        
        
       
        add(btnRealizarCambioTurno);
        add(btnMostrarCitasProgramadas);
        add(btnAceptarCambioTurno);
        add(btnVolverEE);
        add(imagenMenuPpalE);
        
        
        
        
    }


	public JButton getBtnRealizarCambioTurno() {
		return btnRealizarCambioTurno;
	}

	public void setBtnRealizarCambioTurno(JButton btnRealizarCambioTurno) {
		this.btnRealizarCambioTurno = btnRealizarCambioTurno;
	}

	public JButton getBtnMostrarCitasProgramadas() {
		return btnMostrarCitasProgramadas;
	}

	public void setBtnMostrarCitasProgramadas(JButton btnMostrarCitasProgramadas) {
		this.btnMostrarCitasProgramadas = btnMostrarCitasProgramadas;
	}

	public JButton getBtnAceptarCambioTurno() {
		return btnAceptarCambioTurno;
	}

	public void setBtnAceptarCambioTurno(JButton btnAceptarCambioTurno) {
		this.btnAceptarCambioTurno = btnAceptarCambioTurno;
	}

	public JButton getBtnVolverEE() {
		return btnVolverEE;
	}

	public void setBtnVolverEE(JButton btnVolverEE) {
		this.btnVolverEE = btnVolverEE;
	}
	
	public JLabel getImagenMenuPpalE() {
		return imagenMenuPpalE;
	}

	public void setImagenMenuPpalE(JLabel imagenMenuPpalE) {
		this.imagenMenuPpalE = imagenMenuPpalE;
	}
}


    

	
