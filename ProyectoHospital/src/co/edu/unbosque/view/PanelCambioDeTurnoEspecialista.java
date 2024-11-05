package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelCambioDeTurnoEspecialista extends JPanel {

	

	
    private JButton  btnCambiarTurno, btnVolverRt;
    private JLabel imagenCambioTurno2;
    

    public PanelCambioDeTurnoEspecialista() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        
		


   
		
        btnCambiarTurno = new JButton("Cambiar Turno");
        btnCambiarTurno.setBounds(950, 540, 180, 80); // Posición ajustada
        btnCambiarTurno.setOpaque(true);
        btnCambiarTurno.setActionCommand("REGISTRAR");

       
        btnVolverRt = new JButton("Volver");
        btnVolverRt.setBounds(230, 550, 180, 80); // Posición ajustada
        btnVolverRt.setOpaque(true);
        btnVolverRt.setActionCommand("VOLVER");
        

        imagenCambioTurno2 = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/CambioDeTurnoE.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenCambioTurno2.setIcon(new ImageIcon(redimensionado1));
        imagenCambioTurno2.setBounds(0, 0, 1280, 720);


        
        
        
        add(btnCambiarTurno);
        add(btnVolverRt);
        add(imagenCambioTurno2);
        
        
       
        
           }


	public JButton getBtnCambiarTurno() {
		return btnCambiarTurno;
	}


	public void setBtnCambiarTurno(JButton btnCambiarTurno) {
		this.btnCambiarTurno = btnCambiarTurno;
	}


	public JButton getBtnVolverRt() {
		return btnVolverRt;
	}


	public void setBtnVolverRt(JButton btnVolverRt) {
		this.btnVolverRt = btnVolverRt;
	}


	public JLabel getImagenCambioTurno2() {
		return imagenCambioTurno2;
	}


	public void setImagenCambioTurno2(JLabel imagenCambioTurno2) {
		this.imagenCambioTurno2 = imagenCambioTurno2;
	}


}