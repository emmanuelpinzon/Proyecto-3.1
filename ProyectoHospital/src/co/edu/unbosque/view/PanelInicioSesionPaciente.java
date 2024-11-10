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


	public class PanelInicioSesionPaciente extends JPanel {

		
		private JTextField numeroDocumento, contraseña;
	    private JButton  btnIniciarSesion, btnVolverP;
	    private JLabel imagenInicioSesionP;

	    public PanelInicioSesionPaciente() {
	    	
	    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
	    	
	        setLayout(null);
	        setVisible(true);
	        setSize(1280, 720);
	    
	        
	       
			
			
			numeroDocumento = new JTextField();
			numeroDocumento.setBounds(200, 507, 300, 55);
			numeroDocumento.setBorder(null);
			numeroDocumento.setOpaque(true);

			contraseña = new JPasswordField();
			contraseña.setBounds(800, 507, 300, 55);
			contraseña.setBorder(null);
			contraseña.setOpaque(true);
			

	    

	        // Botón "Registrarse"
			
	        btnIniciarSesion = new JButton("Iniciar Sesion");
	        btnIniciarSesion.setBounds(720, 610, 140, 50); // Posición ajustada
	        btnIniciarSesion.setContentAreaFilled(false);
	        btnIniciarSesion.setBorderPainted(false);
	        btnIniciarSesion.setOpaque(true);
	        btnIniciarSesion.setActionCommand("INICIARSESION");

	        // Botón "Volver"
	        btnVolverP = new JButton("Volver");
	        btnVolverP.setBounds(450, 610, 150, 50); // Posición ajustada
	        btnVolverP.setOpaque(true);
	        btnVolverP.setActionCommand("VOLVER");
	        

	        imagenInicioSesionP = new JLabel();
	        ImageIcon imagen1 = new ImageIcon("src/media/InicioSesionPaciente.png");
	        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
	        imagenInicioSesionP.setIcon(new ImageIcon(redimensionado1));
	        imagenInicioSesionP.setBounds(0, 0, 1280, 720);


	        
	        
	        
	       	add(numeroDocumento);
	        add(contraseña);
	        add(btnIniciarSesion);
	        add(btnVolverP);
	        
	        add(imagenInicioSesionP);
	        
	       
	        
	        setComponentZOrder(numeroDocumento, 0);
	        setComponentZOrder(contraseña, 1);
	        setComponentZOrder(btnIniciarSesion, 2);
	        setComponentZOrder(btnVolverP, 3);
	        setComponentZOrder(imagenInicioSesionP, 4);
	           }


		

		public JTextField getNumeroDocumento() {
			return numeroDocumento;
		}


		public void setNumeroDocumento(JTextField numeroDocumento) {
			this.numeroDocumento = numeroDocumento;
		}


		public JTextField getContraseña() {
			return contraseña;
		}


		public void setContraseña(JTextField contraseña) {
			this.contraseña = contraseña;
		}


		public JButton getBtnIniciarSesion() {
			return btnIniciarSesion;
		}


		public void setBtnIniciarSesion(JButton btnIniciarSesion) {
			this.btnIniciarSesion = btnIniciarSesion;
		}


		public JButton getBtnVolverP() {
			return btnVolverP;
		}


		public void setBtnVolverP(JButton btnVolverP) {
			this.btnVolverP = btnVolverP;
		}
	    
		public JLabel getImagenInicioSesionP() {
			return imagenInicioSesionP;
		}


		public void setImagenInicioSesionP(JLabel imagenInicioSesionP) {
			this.imagenInicioSesionP = imagenInicioSesionP;
		}

	    

}
