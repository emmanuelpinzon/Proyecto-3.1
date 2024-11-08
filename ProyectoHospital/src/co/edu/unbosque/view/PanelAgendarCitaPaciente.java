package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.toedter.calendar.JDateChooser;


	public class PanelAgendarCitaPaciente extends JPanel {

		private JButton btnVolverCc, btnAgregarCita;

		private JComboBox<String> jcbtipoEspecialista, jcbHora;
		private JLabel imagenAgendarCitaP;
	    private JDateChooser fechaCita;
		

	    public PanelAgendarCitaPaciente() {
	    	
	    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
	    	
	        setLayout(null);
	        setVisible(true);
	        setSize(1280, 720);
	    
	        
	       
			String[] genero = { "Cirugía", "Oncología", "Dermatología", "Neumología", "Cardiología", "Medicina Interna" };
			DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(genero);

			jcbtipoEspecialista = new JComboBox<>(modelo);
			jcbtipoEspecialista.setBounds(500, 550, 280, 50);
			jcbtipoEspecialista.setFont(new Font("Arial", Font.PLAIN, 16));

	        String[] horas24 = new String[24];
	        for (int i = 0; i < 24; i++) {
	            horas24[i] = String.format("%02d:00", i); 
	        }
	        jcbHora = new JComboBox<>(new DefaultComboBoxModel<>(horas24));
	        jcbHora.setBounds(750, 350, 280, 50);
	        jcbHora.setFont(new Font("Arial", Font.PLAIN, 16));
			
	        fechaCita = new JDateChooser();
	        fechaCita.setBounds(300, 350, 280, 50);
	        fechaCita.setDateFormatString("dd-MM-yyyy"); 


	        
	        btnVolverCc = new JButton("volver");
	        btnVolverCc.setBounds(240, 530, 170, 100); 
	        btnVolverCc.setOpaque(true);
	        btnVolverCc.setActionCommand("VOLVER");
	        
	        btnAgregarCita = new JButton("agregar cita");
	        btnAgregarCita.setBounds(950, 530, 170, 100); 
	        btnAgregarCita.setOpaque(true);
	        btnAgregarCita.setActionCommand("AGREGAR CITA");


	       
	        

	        imagenAgendarCitaP = new JLabel();
	        ImageIcon imagen1 = new ImageIcon("src/media/AgendarCitaPaciente.png");
	        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
	        imagenAgendarCitaP.setIcon(new ImageIcon(redimensionado1));
	        imagenAgendarCitaP.setBounds(0, 0, 1280, 720);


	        
	        
	       
	        add(btnVolverCc);
	        add(btnAgregarCita);
			add(jcbtipoEspecialista);
			  add(jcbHora);
		        add(fechaCita);
	        add(imagenAgendarCitaP);
	        
	       
	        
	        
	    }
	    

	    
		public JDateChooser getFechaCita() {
			return fechaCita;
		}



		public void setFechaCita(JDateChooser fechaCita) {
			this.fechaCita = fechaCita;
		}



		public JComboBox<String> getJcbHora() {
			return jcbHora;
		}


		public void setJcbHora(JComboBox<String> jcbHora) {
			this.jcbHora = jcbHora;
		}


		public JComboBox<String> getJcbtipoEspecialista() {
			return jcbtipoEspecialista;
		}


		public void setJcbtipoEspecialista(JComboBox<String> jcbtipoEspecialista) {
			this.jcbtipoEspecialista = jcbtipoEspecialista;
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