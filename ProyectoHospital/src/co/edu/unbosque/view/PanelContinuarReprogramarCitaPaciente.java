package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelContinuarReprogramarCitaPaciente extends JPanel {

	

	
    private JButton  btnReprogramarCitaP, btnVolverCrp;
    private JLabel imagenReprogramarCita2;
    

    public PanelContinuarReprogramarCitaPaciente() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        
		


   
		
        btnReprogramarCitaP = new JButton("Reprogramar cita");
        btnReprogramarCitaP.setBounds(950, 540, 180, 80); // Posición ajustada
        btnReprogramarCitaP.setOpaque(true);
        btnReprogramarCitaP.setActionCommand("REPROGRAMAR");

       
        btnVolverCrp = new JButton("Volver");
        btnVolverCrp.setBounds(230, 550, 180, 80); // Posición ajustada
        btnVolverCrp.setOpaque(true);
        btnVolverCrp.setActionCommand("VOLVER");
        

        imagenReprogramarCita2 = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/ReprogramarCitaP2.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenReprogramarCita2.setIcon(new ImageIcon(redimensionado1));
        imagenReprogramarCita2.setBounds(0, 0, 1280, 720);


        
        
        
        add(btnReprogramarCitaP);
        add(btnVolverCrp);
        add(imagenReprogramarCita2);
        
        
       
        
           }


	public JButton getBtnReprogramarCitaP() {
		return btnReprogramarCitaP;
	}


	public void setBtnReprogramarCitaP(JButton btnReprogramarCitaP) {
		this.btnReprogramarCitaP = btnReprogramarCitaP;
	}


	public JButton getBtnVolverCrp() {
		return btnVolverCrp;
	}


	public void setBtnVolverCrp(JButton btnVolverCrp) {
		this.btnVolverCrp = btnVolverCrp;
	}


	public JLabel getImagenReprogramarCita2() {
		return imagenReprogramarCita2;
	}


	public void setImagenReprogramarCita2(JLabel imagenReprogramarCita2) {
		this.imagenReprogramarCita2 = imagenReprogramarCita2;
	}

}