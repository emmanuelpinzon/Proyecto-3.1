package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelMostrarReporteMensualDirector extends JPanel {

	

	
    private JButton  btnVolverRmd;
    private JLabel imagenMostrarReporteMensualD;
    

    public PanelMostrarReporteMensualDirector() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        btnVolverRmd = new JButton("Volver");
        btnVolverRmd.setBounds(610, 594, 180, 70); // Posición ajustada
        btnVolverRmd.setOpaque(true);
        btnVolverRmd.setActionCommand("VOLVER");
        

        imagenMostrarReporteMensualD = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MostrarReporteMensualDirector.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMostrarReporteMensualD.setIcon(new ImageIcon(redimensionado1));
        imagenMostrarReporteMensualD.setBounds(0, 0, 1280, 683);


        
        
        
        add(btnVolverRmd);
        add(imagenMostrarReporteMensualD);
        
        
       
        
           }


	public JButton getBtnVolverRmd() {
		return btnVolverRmd;
	}


	public void setBtnVolverRmd(JButton btnVolverRmd) {
		this.btnVolverRmd = btnVolverRmd;
	}


	public JLabel getImagenMostrarReporteMensualD() {
		return imagenMostrarReporteMensualD;
	}


	public void setImagenMostrarReporteMensualD(JLabel imagenMostrarReporteMensualD) {
		this.imagenMostrarReporteMensualD = imagenMostrarReporteMensualD;
	}


}