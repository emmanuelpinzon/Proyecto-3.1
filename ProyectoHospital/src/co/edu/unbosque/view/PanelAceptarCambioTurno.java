package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelAceptarCambioTurno extends JPanel {

	

	
    private JButton  btnAceptarCambioTurno, btnVolverCt;
    private JLabel imagenAceptarCambioTurno;
    

    public PanelAceptarCambioTurno() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        
		


   
		
        btnAceptarCambioTurno = new JButton("Aceptar Cambiar Turno");
        btnAceptarCambioTurno.setBounds(950, 540, 180, 80); // Posición ajustada
        btnAceptarCambioTurno.setOpaque(true);
        btnAceptarCambioTurno.setActionCommand("REGISTRAR");

       
        btnVolverCt = new JButton("Volver");
        btnVolverCt.setBounds(230, 550, 180, 80); // Posición ajustada
        btnVolverCt.setOpaque(true);
        btnVolverCt.setActionCommand("VOLVER");
        

        imagenAceptarCambioTurno= new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/AceptarCambioTurnoEspecialista.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenAceptarCambioTurno.setIcon(new ImageIcon(redimensionado1));
        imagenAceptarCambioTurno.setBounds(0, 0, 1280, 720);


        
        
        
        add(btnAceptarCambioTurno);
        add(btnVolverCt);
        add(imagenAceptarCambioTurno);
        
        
       
        
           }


	public JButton getBtnAceptarCambioTurno() {
		return btnAceptarCambioTurno;
	}


	public void setBtnAceptarCambioTurno(JButton btnAceptarCambioTurno) {
		this.btnAceptarCambioTurno = btnAceptarCambioTurno;
	}


	public JButton getBtnVolverCt() {
		return btnVolverCt;
	}


	public void setBtnVolverCt(JButton btnVolverCt) {
		this.btnVolverCt = btnVolverCt;
	}


	public JLabel getImagenAceptarCambioTurno() {
		return imagenAceptarCambioTurno;
	}


	public void setImagenAceptarCambioTurno(JLabel imagenAceptarCambioTurno) {
		this.imagenAceptarCambioTurno = imagenAceptarCambioTurno;
	}


}