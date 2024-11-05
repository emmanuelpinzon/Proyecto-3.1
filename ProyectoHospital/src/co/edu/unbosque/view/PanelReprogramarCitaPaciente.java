package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;


	public class PanelReprogramarCitaPaciente extends JPanel {

		private JButton btnVolverRr, btnContinuar;
		private JLabel imagenReprogramarCitaP;

	    public PanelReprogramarCitaPaciente() {
	    	
	    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
	    	
	        setLayout(null);
	        setVisible(true);
	        setSize(1280, 720);
	    
	        
	       
			
			
	        btnVolverRr = new JButton("volver");
	        btnVolverRr.setBounds(220, 530, 190, 100); 
	        btnVolverRr.setOpaque(true);
	        btnVolverRr.setActionCommand("VOLVER");


	        btnContinuar = new JButton("continuar");
	        btnContinuar.setBounds(950, 530, 190, 100); 
	        btnContinuar.setOpaque(true);
	        btnContinuar.setActionCommand("VOLVER");
	       
	        

	        imagenReprogramarCitaP = new JLabel();
	        ImageIcon imagen1 = new ImageIcon("src/media/ReprogramarCitaPaciente.png");
	        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
	        imagenReprogramarCitaP.setIcon(new ImageIcon(redimensionado1));
	        imagenReprogramarCitaP.setBounds(0, 0, 1280, 720);


	        
	        
	       
	        add(btnVolverRr);
	        add(btnContinuar);
	        add(imagenReprogramarCitaP);
	        
	       
	        
	        
	    }

		public JButton getBtnVolverRr() {
			return btnVolverRr;
		}

		public void setBtnVolverRr(JButton btnVolverRr) {
			this.btnVolverRr = btnVolverRr;
		}

		public JButton getBtnContinuar() {
			return btnContinuar;
		}

		public void setBtnContinuar(JButton btnContinuar) {
			this.btnContinuar = btnContinuar;
		}

		public JLabel getImagenReprogramarCitaP() {
			return imagenReprogramarCitaP;
		}

		public void setImagenReprogramarCitaP(JLabel imagenReprogramarCitaP) {
			this.imagenReprogramarCitaP = imagenReprogramarCitaP;
		}

	}