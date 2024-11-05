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


	public class PanelInicioSesionEspecialista extends JPanel {

		
		private JTextField numeroDocumento, contraseña, tipoEspecialidad;
	    private JButton  btnIniciarSesionE, btnVolverE;
	    private JLabel imagenInicioSesionE;

	    public PanelInicioSesionEspecialista() {
	    	
	    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
	    	
	        setLayout(null);
	        setVisible(true);
	        setSize(1280, 720);
	    
	        
	       
			
			
			numeroDocumento = new JTextField();
			numeroDocumento.setBounds(450, 507, 300, 55);
			numeroDocumento.setOpaque(true);

			contraseña = new JPasswordField();
			contraseña.setBounds(840, 507, 300, 55);
			contraseña.setOpaque(true);
			
			tipoEspecialidad = new JPasswordField();
			tipoEspecialidad.setBounds(140, 520, 245, 55);
			tipoEspecialidad.setOpaque(true);

	    

	        // Botón "Registrarse"
			
	        btnIniciarSesionE = new JButton("Iniciar Sesion");
	        btnIniciarSesionE.setBounds(720, 610, 140, 50); // Posición ajustada
	        btnIniciarSesionE.setOpaque(true);
	        btnIniciarSesionE.setActionCommand("INICIAR SESION");

	        // Botón "Volver"
	        btnVolverE = new JButton("Volver");
	        btnVolverE.setBounds(450, 610, 150, 50); // Posición ajustada
	        btnVolverE.setOpaque(true);
	        btnVolverE.setActionCommand("VOLVER");
	        

	        imagenInicioSesionE = new JLabel();
	        ImageIcon imagen1 = new ImageIcon("src/media/InicioSesionEspecialista.png");
	        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
	        imagenInicioSesionE.setIcon(new ImageIcon(redimensionado1));
	        imagenInicioSesionE.setBounds(0, 0, 1280, 720);


	        
	        
	        
	       	add(numeroDocumento);
	        add(contraseña);
	        add(tipoEspecialidad);
	        add(btnIniciarSesionE);
	        add(btnVolverE);
	        
	        add(imagenInicioSesionE);
	        
	       
	        
	        setComponentZOrder(numeroDocumento, 0);
	        setComponentZOrder(contraseña, 1);
	        setComponentZOrder(tipoEspecialidad, 2);
	        setComponentZOrder(btnIniciarSesionE, 3);
	        setComponentZOrder(btnVolverE, 4);
	        setComponentZOrder(imagenInicioSesionE, 5);
	          
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

		public JTextField getTipoEspecialidad() {
			return tipoEspecialidad;
		}

		public void setTipoEspecialidad(JTextField tipoEspecialidad) {
			this.tipoEspecialidad = tipoEspecialidad;
		}

		public JButton getBtnIniciarSesionE() {
			return btnIniciarSesionE;
		}

		public void setBtnIniciarSesionE(JButton btnIniciarSesionE) {
			this.btnIniciarSesionE = btnIniciarSesionE;
		}

		public JButton getBtnVolverE() {
			return btnVolverE;
		}

		public void setBtnVolverE(JButton btnVolverE) {
			this.btnVolverE = btnVolverE;
		}

		public JLabel getImagenInicioSesionE() {
			return imagenInicioSesionE;
		}

		public void setImagenInicioSesionE(JLabel imagenInicioSesionE) {
			this.imagenInicioSesionE = imagenInicioSesionE;
		}
		}