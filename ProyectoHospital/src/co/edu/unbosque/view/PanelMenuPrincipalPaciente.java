package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;


public class PanelMenuPrincipalPaciente extends JPanel {

	private JLabel imagenMenuPpalP;
    private JButton btnAgendarCita, btnReprogramarCita, btnMostrarCitas, btnMostrarTratamiento, btnMostrarResultados, btnCancelarCita, btnVolverPP;

    public PanelMenuPrincipalPaciente() {
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        

        
        btnAgendarCita = new JButton("Agendar cita");
        btnAgendarCita.setBounds(60, 220, 220, 170); // Posición ajustada
        btnAgendarCita.setOpaque(false);
        btnAgendarCita.setActionCommand("agendar cita");

       
        btnReprogramarCita = new JButton("Reprogramar cita");
        btnReprogramarCita.setBounds(60, 460, 220, 150); // Posición ajustada
        btnReprogramarCita.setOpaque(false);
        btnReprogramarCita.setActionCommand("Reprogramar cita");
        
        btnMostrarCitas= new JButton("Mostrar citas");
        btnMostrarCitas.setBounds(382, 420, 220, 240); // Posición ajustada
        btnMostrarCitas.setOpaque(false);
        btnMostrarCitas.setActionCommand("MOSTRAR CITAS");
        
        btnMostrarTratamiento= new JButton("Mostrar tratamiento");
        btnMostrarTratamiento.setBounds(680, 440, 220, 200); // Posición ajustada
        btnMostrarTratamiento.setOpaque(false);
        btnMostrarTratamiento.setActionCommand("MOSTRAR TRATAMIENTO");
        
        btnMostrarResultados= new JButton("Mostrar resultados");
        btnMostrarResultados.setBounds(990, 440, 240, 200); // Posición ajustada
        btnMostrarResultados.setOpaque(false);
        btnMostrarResultados.setActionCommand("MOSTRAR RESULTADOS");
        
        btnCancelarCita= new JButton("Cancelar cita");
        btnCancelarCita.setBounds(1000, 225, 240, 170); // Posición ajustada
        btnCancelarCita.setOpaque(false);
        btnCancelarCita.setActionCommand("CANCELAR CITA");

       
        btnVolverPP = new JButton("Volver");
        btnVolverPP.setBounds(610, 280, 150, 65); // Posición ajustada
        btnVolverPP.setOpaque(false);
        btnVolverPP.setActionCommand("VOLVER");
        
        imagenMenuPpalP = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MenuPaciente1.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMenuPpalP.setIcon(new ImageIcon(redimensionado1));
        imagenMenuPpalP.setBounds(0, 0, 1280, 720);
      

        
        
       
        add(btnAgendarCita);
        add(btnReprogramarCita);
        add(btnMostrarCitas);
        add(btnMostrarTratamiento);
        add(btnMostrarResultados);
        add(btnCancelarCita);
        add(btnVolverPP);
        add(imagenMenuPpalP);
        
        
    }


    

	

	public JButton getBtnAgendarCita() {
		return btnAgendarCita;
	}

	public void setBtnAgendarCita(JButton btnAgendarCita) {
		this.btnAgendarCita = btnAgendarCita;
	}

	public JButton getBtnReprogramarCita() {
		return btnReprogramarCita;
	}

	public void setBtnReprogramarCita(JButton btnReprogramarCita) {
		this.btnReprogramarCita = btnReprogramarCita;
	}

	public JButton getBtnMostrarCitas() {
		return btnMostrarCitas;
	}

	public void setBtnMostrarCitas(JButton btnMostrarCitas) {
		this.btnMostrarCitas = btnMostrarCitas;
	}

	public JButton getBtnMostrarTratamiento() {
		return btnMostrarTratamiento;
	}

	public void setBtnMostrarTratamiento(JButton btnMostrarTratamiento) {
		this.btnMostrarTratamiento = btnMostrarTratamiento;
	}

	public JButton getBtnMostrarResultados() {
		return btnMostrarResultados;
	}

	public void setBtnMostrarResultados(JButton btnMostrarResultados) {
		this.btnMostrarResultados = btnMostrarResultados;
	}

	public JButton getBtnCancelarCita() {
		return btnCancelarCita;
	}

	public void setBtnCancelarCita(JButton btnCancelarCita) {
		this.btnCancelarCita = btnCancelarCita;
	}

	public JButton getBtnVolverPP() {
		return btnVolverPP;
	}

	public void setBtnVolverPP(JButton btnVolverPP) {
		this.btnVolverPP = btnVolverPP;
	}
	public JLabel getImagenMenuPpalP() {
		return imagenMenuPpalP;
	}

	public void setImagenMenuPpalP(JLabel imagenMenuPpalP) {
		this.imagenMenuPpalP = imagenMenuPpalP;
	}
}