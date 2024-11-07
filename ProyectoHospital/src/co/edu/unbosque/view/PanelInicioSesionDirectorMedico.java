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


	public class PanelInicioSesionDirectorMedico extends JPanel {

		
		private JTextField numeroDocumentoD, contraseñaD;
	    private JButton  btnIniciarSesionD, btnVolverD;
	    private JLabel imagenInicioSesionD;

	    public PanelInicioSesionDirectorMedico() {
	    	
	    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
	    	
	        setLayout(null);
	        setVisible(true);
	        setSize(1280, 720);
	    
	        
	       
			
			
			numeroDocumentoD = new JTextField();
			numeroDocumentoD.setBounds(220, 507, 300, 55);
			numeroDocumentoD.setOpaque(true);

			contraseñaD = new JPasswordField();
			contraseñaD.setBounds(780, 507, 300, 55);
			contraseñaD.setOpaque(true);
			

	    

	        // Botón "Registrarse"
			
	        btnIniciarSesionD = new JButton("Iniciar Sesion");
	        btnIniciarSesionD.setBounds(690, 590, 190, 70); // Posición ajustada
	        btnIniciarSesionD.setOpaque(true);
	        btnIniciarSesionD.setActionCommand("INICIAR SESION");

	        // Botón "Volver"
	        btnVolverD = new JButton("Volver");
	        btnVolverD.setBounds(450, 590, 170, 70); // Posición ajustada
	        btnVolverD.setOpaque(true);
	        btnVolverD.setActionCommand("VOLVER");
	        

	        imagenInicioSesionD = new JLabel();
	        ImageIcon imagen1 = new ImageIcon("src/media/InicioSesionDirector.png");
	        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
	        imagenInicioSesionD.setIcon(new ImageIcon(redimensionado1));
	        imagenInicioSesionD.setBounds(0, 0, 1280, 720);


	        
	        
	        
	       	add(numeroDocumentoD);
	        add(contraseñaD);
	        add(btnIniciarSesionD);
	        add(btnVolverD);
	        
	        add(imagenInicioSesionD);
	        
	       
	        
	       
	          
	    }

		public JTextField getNumeroDocumentoD() {
			return numeroDocumentoD;
		}

		public void setNumeroDocumentoD(JTextField numeroDocumentoD) {
			this.numeroDocumentoD = numeroDocumentoD;
		}

		public JTextField getContraseñaD() {
			return contraseñaD;
		}

		public void setContraseñaD(JTextField contraseñaD) {
			this.contraseñaD = contraseñaD;
		}

		public JButton getBtnIniciarSesionD() {
			return btnIniciarSesionD;
		}

		public void setBtnIniciarSesionD(JButton btnIniciarSesionD) {
			this.btnIniciarSesionD = btnIniciarSesionD;
		}

		public JButton getBtnVolverD() {
			return btnVolverD;
		}

		public void setBtnVolverD(JButton btnVolverD) {
			this.btnVolverD = btnVolverD;
		}

		public JLabel getImagenInicioSesionD() {
			return imagenInicioSesionD;
		}

		public void setImagenInicioSesionD(JLabel imagenInicioSesionD) {
			this.imagenInicioSesionD = imagenInicioSesionD;
		}
	
		

		
}