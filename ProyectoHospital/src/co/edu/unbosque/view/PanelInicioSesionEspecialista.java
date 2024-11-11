package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelInicioSesionEspecialista extends JPanel {

	private JTextField numeroDocumento, contraseña;

	private JButton btnIniciarSesionE, btnVolverE;
	private JLabel imagenInicioSesionE;

	public PanelInicioSesionEspecialista() {

		Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

		setLayout(null);
		setVisible(true);
		setSize(1280, 720);

		numeroDocumento = new JTextField();
		numeroDocumento.setBounds(138, 512, 300, 55);
		numeroDocumento.setBorder(null);
		numeroDocumento.setOpaque(true);

		contraseña = new JPasswordField();
		contraseña.setBounds(840, 507, 300, 55);
		contraseña.setBorder(null);
		contraseña.setOpaque(true);

		String[] especialista = { "Cirugía", "Oncología", "Dermatología", "Neumología", "Cardiología",
				"Medicina Interna" };
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(especialista);

		// Botón "Registrarse"

		btnIniciarSesionE = new JButton("Iniciar Sesion");
		btnIniciarSesionE.setBounds(685, 600, 200, 65); // Posición ajustada
		btnIniciarSesionE.setOpaque(true);
		btnIniciarSesionE.setActionCommand("INICIARSESION");

		// Botón "Volver"
		btnVolverE = new JButton("Volver");
		btnVolverE.setBounds(470, 598, 140, 65); // Posición ajustada
		btnVolverE.setOpaque(true);
		btnVolverE.setActionCommand("VOLVER");

		imagenInicioSesionE = new JLabel();
		ImageIcon imagen1 = new ImageIcon("src/media/InicioSesionEspecialista.png");
		Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenInicioSesionE.setIcon(new ImageIcon(redimensionado1));
		imagenInicioSesionE.setBounds(0, 0, 1280, 720);

		add(imagenInicioSesionE);
		add(numeroDocumento);
		add(contraseña);

		add(btnIniciarSesionE);
		add(btnVolverE);


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