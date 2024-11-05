package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelMostrarTratamientoGeneradoP extends JPanel {

	

	
    private JButton  btnVolverTP;
    private JLabel imagenMostrarTratamientoP;
    

    public PanelMostrarTratamientoGeneradoP() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        btnVolverTP = new JButton("Volver");
        btnVolverTP.setBounds(610, 600, 180, 70); // Posición ajustada
        btnVolverTP.setOpaque(true);
        btnVolverTP.setActionCommand("VOLVER");
        

        imagenMostrarTratamientoP = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MostrarTratamientoGenerado.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMostrarTratamientoP.setIcon(new ImageIcon(redimensionado1));
        imagenMostrarTratamientoP.setBounds(0, 0, 1280, 683);


        
        
        
        add(btnVolverTP);
        add(imagenMostrarTratamientoP);
        
        
       
        
           }


	public JButton getBtnVolverTP() {
		return btnVolverTP;
	}


	public void setBtnVolverTP(JButton btnVolverTP) {
		this.btnVolverTP = btnVolverTP;
	}


	public JLabel getImagenMostrarTratamientoP() {
		return imagenMostrarTratamientoP;
	}


	public void setImagenMostrarTratamientoP(JLabel imagenMostrarTratamientoP) {
		this.imagenMostrarTratamientoP = imagenMostrarTratamientoP;
	}


}