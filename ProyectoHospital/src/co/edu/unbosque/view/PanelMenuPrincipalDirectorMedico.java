package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;


public class PanelMenuPrincipalDirectorMedico extends JPanel {

	private JLabel imagenMenuPpalD;
    private JButton btnConfirmarCambioTurno, btnMostrarReporteSemanal, btnMostrarReporteMensual, btnAsignarTurno, btnVolverDME;

    public PanelMenuPrincipalDirectorMedico() {
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        

        
        btnConfirmarCambioTurno = new JButton("confirmar cambio de turno");
        btnConfirmarCambioTurno.setBounds(145, 435, 220, 200); // Posición ajustada
        btnConfirmarCambioTurno.setOpaque(false);
        btnConfirmarCambioTurno.setActionCommand("realizar cambio de turno");

       
        btnMostrarReporteSemanal = new JButton("Mostrar reporte semanal");
        btnMostrarReporteSemanal.setBounds(430, 440, 220, 200); // Posición ajustada
        btnMostrarReporteSemanal.setOpaque(false);
        btnMostrarReporteSemanal.setActionCommand("MOSTRAR CITAS PROGRAMADAS");
        
        btnMostrarReporteMensual= new JButton("Mostrar reporte mensual");
        btnMostrarReporteMensual.setBounds(690, 430, 220, 200); // Posición ajustada
        btnMostrarReporteMensual.setOpaque(false);
        btnMostrarReporteMensual.setActionCommand("ACEPTAR CAMBIO TURNO");
        
       
        btnAsignarTurno = new JButton("asignar turno");
        btnAsignarTurno.setBounds(945, 420, 220, 200); // Posición ajustada
        btnAsignarTurno.setOpaque(false);
        btnAsignarTurno.setActionCommand("VOLVER");
        
        btnVolverDME = new JButton("Volver");
        btnVolverDME.setBounds(610, 280, 150, 65); // Posición ajustada
        btnVolverDME.setOpaque(false);
        btnVolverDME.setActionCommand("VOLVER");
        
        imagenMenuPpalD = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MenuPrincipalDirectorMedico.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMenuPpalD.setIcon(new ImageIcon(redimensionado1));
        imagenMenuPpalD.setBounds(0, 0, 1280, 720);
      

        
        
       
        add(btnConfirmarCambioTurno);
        add(btnMostrarReporteSemanal);
        add(btnMostrarReporteMensual);
        add(btnAsignarTurno);
        add(btnVolverDME);
        add(imagenMenuPpalD);
        
        
        
        
    }

	public JLabel getImagenMenuPpalD() {
		return imagenMenuPpalD;
	}

	public void setImagenMenuPpalD(JLabel imagenMenuPpalD) {
		this.imagenMenuPpalD = imagenMenuPpalD;
	}

	public JButton getBtnConfirmarCambioTurno() {
		return btnConfirmarCambioTurno;
	}

	public void setBtnConfirmarCambioTurno(JButton btnConfirmarCambioTurno) {
		this.btnConfirmarCambioTurno = btnConfirmarCambioTurno;
	}

	public JButton getBtnMostrarReporteSemanal() {
		return btnMostrarReporteSemanal;
	}

	public void setBtnMostrarReporteSemanal(JButton btnMostrarReporteSemanal) {
		this.btnMostrarReporteSemanal = btnMostrarReporteSemanal;
	}

	public JButton getBtnMostrarReporteMensual() {
		return btnMostrarReporteMensual;
	}

	public void setBtnMostrarReporteMensual(JButton btnMostrarReporteMensual) {
		this.btnMostrarReporteMensual = btnMostrarReporteMensual;
	}

	public JButton getBtnAsignarTurno() {
		return btnAsignarTurno;
	}

	public void setBtnAsignarTurno(JButton btnAsignarTurno) {
		this.btnAsignarTurno = btnAsignarTurno;
	}

	public JButton getBtnVolverDME() {
		return btnVolverDME;
	}

	public void setBtnVolverDME(JButton btnVolverDME) {
		this.btnVolverDME = btnVolverDME;
	}


}