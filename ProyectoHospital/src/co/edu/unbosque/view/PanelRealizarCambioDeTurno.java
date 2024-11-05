package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelRealizarCambioDeTurno extends JPanel {

	

	
    private JButton  btnContinuarRc, btnVolverRc;
    private JLabel imagenCambioTurno;
    

    public PanelRealizarCambioDeTurno() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        
		


   
		
        btnContinuarRc = new JButton("Continuar");
        btnContinuarRc.setBounds(950, 540, 180, 80); // Posición ajustada
        btnContinuarRc.setOpaque(true);
        btnContinuarRc.setActionCommand("REGISTRAR");

       
        btnVolverRc = new JButton("Volver");
        btnVolverRc.setBounds(230, 550, 180, 80); // Posición ajustada
        btnVolverRc.setOpaque(true);
        btnVolverRc.setActionCommand("VOLVER");
        

        imagenCambioTurno = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/RealizarCambioTurno.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenCambioTurno.setIcon(new ImageIcon(redimensionado1));
        imagenCambioTurno.setBounds(0, 0, 1280, 720);


        
        
        
        add(btnContinuarRc);
        add(btnVolverRc);
        add(imagenCambioTurno);
        
        
       
        
           }


	public JButton getBtnContinuarRc() {
		return btnContinuarRc;
	}


	public void setBtnContinuarRc(JButton btnContinuarRc) {
		this.btnContinuarRc = btnContinuarRc;
	}


	public JButton getBtnVolverRc() {
		return btnVolverRc;
	}


	public void setBtnVolverRc(JButton btnVolverRc) {
		this.btnVolverRc = btnVolverRc;
	}


	public JLabel getImagenCambioTurno() {
		return imagenCambioTurno;
	}


	public void setImagenCambioTurno(JLabel imagenCambioTurno) {
		this.imagenCambioTurno = imagenCambioTurno;
	}

}
	