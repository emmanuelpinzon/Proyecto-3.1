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


	public class PanelCancelarCitaPaciente extends JPanel {

		private JTextField codigoCita;
		private JButton btnVolverCa, btnCancelarCita;
		private JLabel imagenCancelarCitaP;

	    public PanelCancelarCitaPaciente() {
	    	
	    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
	    	
	        setLayout(null);
	        setVisible(true);
	        setSize(1280, 720);
	    
	        
	       
	        codigoCita = new JTextField();
			codigoCita.setBounds(460, 290, 350, 100);
			codigoCita.setBorder(null);
			codigoCita.setOpaque(true);
			
	        btnVolverCa = new JButton("volver");
	        btnVolverCa.setBounds(240, 530, 170, 100); 
	        btnVolverCa.setOpaque(true);
	        btnVolverCa.setActionCommand("VOLVER");
	        
	        btnCancelarCita = new JButton("cancelar cita");
	        btnCancelarCita.setBounds(950, 520, 170, 110); 
	        btnCancelarCita.setOpaque(true);
	        btnCancelarCita.setActionCommand("CANCELARCITA");

	       
	        

	        imagenCancelarCitaP = new JLabel();
	        ImageIcon imagen1 = new ImageIcon("src/media/CancelarCitaP.png");
	        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
	        imagenCancelarCitaP.setIcon(new ImageIcon(redimensionado1));
	        imagenCancelarCitaP.setBounds(0, 0, 1280, 720);


	        
	        
	        add(codigoCita);
	        add(btnVolverCa);
	        add(btnCancelarCita);
	        add(imagenCancelarCitaP);
	        
	       
	        
	        
	    }

		public JTextField getCodigoCita() {
			return codigoCita;
		}

		public void setCodigoCita(JTextField codigoCita) {
			this.codigoCita = codigoCita;
		}

		public JButton getBtnVolverCa() {
			return btnVolverCa;
		}

		public void setBtnVolverCa(JButton btnVolverCa) {
			this.btnVolverCa = btnVolverCa;
		}

		public JButton getBtnCancelarCita() {
			return btnCancelarCita;
		}

		public void setBtnCancelarCita(JButton btnCancelarCita) {
			this.btnCancelarCita = btnCancelarCita;
		}

		public JLabel getImagenCancelarCitaP() {
			return imagenCancelarCitaP;
		}

		public void setImagenCancelarCitaP(JLabel imagenCancelarCitaP) {
			this.imagenCancelarCitaP = imagenCancelarCitaP;
		}
}