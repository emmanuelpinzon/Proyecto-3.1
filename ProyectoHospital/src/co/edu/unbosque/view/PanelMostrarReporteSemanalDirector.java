package co.edu.unbosque.view;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelMostrarReporteSemanalDirector extends JPanel {

	

	
    private JButton  btnVolverMsd;
    private JLabel imagenMostrarReporteSemanalD;
    

    public PanelMostrarReporteSemanalDirector() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        btnVolverMsd = new JButton("Volver");
        btnVolverMsd.setBounds(610, 595, 180, 70); // Posición ajustada
        btnVolverMsd.setOpaque(true);
        btnVolverMsd.setActionCommand("VOLVER");
        

        imagenMostrarReporteSemanalD = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MostrarReporteSemanalDirector.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMostrarReporteSemanalD.setIcon(new ImageIcon(redimensionado1));
        imagenMostrarReporteSemanalD.setBounds(0, 0, 1280, 683);


        
        
        
        add(btnVolverMsd);
        add(imagenMostrarReporteSemanalD);
        
        
       
        
           }


	public JButton getBtnVolverMsd() {
		return btnVolverMsd;
	}


	public void setBtnVolverMsd(JButton btnVolverMsd) {
		this.btnVolverMsd = btnVolverMsd;
	}


	public JLabel getImagenMostrarReporteSemanalD() {
		return imagenMostrarReporteSemanalD;
	}


	public void setImagenMostrarReporteSemanalD(JLabel imagenMostrarReporteSemanalD) {
		this.imagenMostrarReporteSemanalD = imagenMostrarReporteSemanalD;
	}

}