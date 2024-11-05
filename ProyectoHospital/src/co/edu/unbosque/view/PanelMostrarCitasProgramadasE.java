package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelMostrarCitasProgramadasE extends JPanel {

	

	
    private JButton  btnVolverMc;
    private JLabel imagenMostrarCitasP;
    

    public PanelMostrarCitasProgramadasE() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        btnVolverMc = new JButton("Volver");
        btnVolverMc.setBounds(610, 610, 180, 70); // Posición ajustada
        btnVolverMc.setOpaque(true);
        btnVolverMc.setActionCommand("VOLVER");
        

        imagenMostrarCitasP = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MostrarCitasProgramadasEspecialista.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMostrarCitasP.setIcon(new ImageIcon(redimensionado1));
        imagenMostrarCitasP.setBounds(0, 0, 1280, 720);


        
        
        
        add(btnVolverMc);
        add(imagenMostrarCitasP);
        
        
       
        
           }


	public JButton getBtnVolverMc() {
		return btnVolverMc;
	}


	public void setBtnVolverMc(JButton btnVolverMc) {
		this.btnVolverMc = btnVolverMc;
	}


	public JLabel getImagenMostrarCitasP() {
		return imagenMostrarCitasP;
	}


	public void setImagenMostrarCitasP(JLabel imagenMostrarCitasP) {
		this.imagenMostrarCitasP = imagenMostrarCitasP;
	}


}