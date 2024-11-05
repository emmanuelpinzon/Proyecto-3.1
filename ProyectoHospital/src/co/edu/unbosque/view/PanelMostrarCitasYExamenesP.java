package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelMostrarCitasYExamenesP extends JPanel {

	

	
    private JButton  btnVolverME;
    private JLabel imagenMostrarCitasYExamenes;
    

    public PanelMostrarCitasYExamenesP() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        btnVolverME = new JButton("Volver");
        btnVolverME.setBounds(610, 600, 180, 70); // Posición ajustada
        btnVolverME.setOpaque(true);
        btnVolverME.setActionCommand("VOLVER");
        

        imagenMostrarCitasYExamenes = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MostrarCitasYExamenesPaciente.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMostrarCitasYExamenes.setIcon(new ImageIcon(redimensionado1));
        imagenMostrarCitasYExamenes.setBounds(0, 0, 1280, 683);


        
        
        
        add(btnVolverME);
        add(imagenMostrarCitasYExamenes);
        
        
       
        
           }


	public JButton getBtnVolverME() {
		return btnVolverME;
	}


	public void setBtnVolverME(JButton btnVolverME) {
		this.btnVolverME = btnVolverME;
	}


	public JLabel getImagenMostrarCitasYExamenes() {
		return imagenMostrarCitasYExamenes;
	}


	public void setImagenMostrarCitasYExamenes(JLabel imagenMostrarCitasYExamenes) {
		this.imagenMostrarCitasYExamenes = imagenMostrarCitasYExamenes;
	}


}