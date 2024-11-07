package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelConfirmarCambioTurnoDirector extends JPanel {

	

	
    private JButton  btnConfirmarCambioTurno, btnVolverCtt;
    private JLabel imagenConfirmarCambioTurno;
    

    public PanelConfirmarCambioTurnoDirector() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        
		


   
		
        btnConfirmarCambioTurno = new JButton("confirmar Cambiar Turno");
        btnConfirmarCambioTurno.setBounds(680, 599, 450, 60); // Posición ajustada
        btnConfirmarCambioTurno.setOpaque(true);
        btnConfirmarCambioTurno.setActionCommand("REGISTRAR");

       
        btnVolverCtt = new JButton("Volver");
        btnVolverCtt.setBounds(360, 590, 180, 65); // Posición ajustada
        btnVolverCtt.setOpaque(true);
        btnVolverCtt.setActionCommand("VOLVER");
        

        imagenConfirmarCambioTurno= new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/ConfirmarCambioTurnoDirector.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenConfirmarCambioTurno.setIcon(new ImageIcon(redimensionado1));
        imagenConfirmarCambioTurno.setBounds(0, 0, 1280, 687);


        
        
        
        add(btnConfirmarCambioTurno);
        add(btnVolverCtt);
        add(imagenConfirmarCambioTurno);
        
        
       
        
           }


	public JButton getBtnConfirmarCambioTurno() {
		return btnConfirmarCambioTurno;
	}


	public void setBtnConfirmarCambioTurno(JButton btnConfirmarCambioTurno) {
		this.btnConfirmarCambioTurno = btnConfirmarCambioTurno;
	}


	public JButton getBtnVolverCtt() {
		return btnVolverCtt;
	}


	public void setBtnVolverCtt(JButton btnVolverCtt) {
		this.btnVolverCtt = btnVolverCtt;
	}


	public JLabel getImagenConfirmarCambioTurno() {
		return imagenConfirmarCambioTurno;
	}


	public void setImagenConfirmarCambioTurno(JLabel imagenConfirmarCambioTurno) {
		this.imagenConfirmarCambioTurno = imagenConfirmarCambioTurno;
	}


}