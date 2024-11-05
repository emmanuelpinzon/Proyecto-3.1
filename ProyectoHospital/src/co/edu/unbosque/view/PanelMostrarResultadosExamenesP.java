package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelMostrarResultadosExamenesP extends JPanel {

	

	
    private JButton  btnVolverRE;
    private JLabel imagenMostrarResultados;
    

    public PanelMostrarResultadosExamenesP() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        btnVolverRE = new JButton("Volver");
        btnVolverRE.setBounds(610, 600, 180, 70); // Posición ajustada
        btnVolverRE.setOpaque(true);
        btnVolverRE.setActionCommand("VOLVER");
        

        imagenMostrarResultados = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MostrarResultadosExamenesP.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMostrarResultados.setIcon(new ImageIcon(redimensionado1));
        imagenMostrarResultados.setBounds(0, 0, 1280, 683);


        
        
        
        add(btnVolverRE);
        add(imagenMostrarResultados);
        
        
       
        
           }


	public JButton getBtnVolverRE() {
		return btnVolverRE;
	}


	public void setBtnVolverRE(JButton btnVolverRE) {
		this.btnVolverRE = btnVolverRE;
	}


	public JLabel getImagenMostrarResultados() {
		return imagenMostrarResultados;
	}


	public void setImagenMostrarResultados(JLabel imagenMostrarResultados) {
		this.imagenMostrarResultados = imagenMostrarResultados;
	}

}