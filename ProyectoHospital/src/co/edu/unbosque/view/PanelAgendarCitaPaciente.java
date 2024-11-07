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


	public class PanelAgendarCitaPaciente extends JPanel {

		private JButton btnVolverCc, btnAgregarCita;
		private JLabel imagenAgendarCitaP;

	    public PanelAgendarCitaPaciente() {
	    	
	    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
	    	
	        setLayout(null);
	        setVisible(true);
	        setSize(1280, 720);
	    
	        
	       
			
			
	        btnVolverCc = new JButton("volver");
	        btnVolverCc.setBounds(240, 530, 170, 100); 
	        btnVolverCc.setOpaque(true);
	        btnVolverCc.setActionCommand("VOLVER");
	        
	        btnAgregarCita = new JButton("agregar cita");
	        btnAgregarCita.setBounds(950, 530, 170, 100); 
	        btnAgregarCita.setOpaque(true);
	        btnAgregarCita.setActionCommand("VOLVER");


	       
	        

	        imagenAgendarCitaP = new JLabel();
	        ImageIcon imagen1 = new ImageIcon("src/media/AgendarCitaPaciente.png");
	        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
	        imagenAgendarCitaP.setIcon(new ImageIcon(redimensionado1));
	        imagenAgendarCitaP.setBounds(0, 0, 1280, 720);


	        
	        
	       
	        add(btnVolverCc);
	        add(btnAgregarCita);
	        add(imagenAgendarCitaP);
	        
	       
	        
	        
	    }

		public JButton getBtnVolverCc() {
			return btnVolverCc;
		}

		public void setBtnVolverCc(JButton btnVolverCc) {
			this.btnVolverCc = btnVolverCc;
		}

		public JButton getBtnAgregarCita() {
			return btnAgregarCita;
		}

		public void setBtnAgregarCita(JButton btnAgregarCita) {
			this.btnAgregarCita = btnAgregarCita;
		}

		public JLabel getImagenAgendarCitaP() {
			return imagenAgendarCitaP;
		}

		public void setImagenAgendarCitaP(JLabel imagenAgendarCitaP) {
			this.imagenAgendarCitaP = imagenAgendarCitaP;
		}

	
}