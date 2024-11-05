package co.edu.unbosque.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPrincipal extends JPanel {

	private JLabel imagenPpal;
	private JButton btnPaciente, btnEspecialista, btnDirectorM;

	public MenuPrincipal() {

		setLayout(null);
		setSize(1280, 720);
		setVisible(true);

		imagenPpal = new JLabel();
		ImageIcon imagen1 = new ImageIcon("src/media/MenuPrincipal.png");

		Image redimensionado = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPpal.setIcon(new ImageIcon(redimensionado));
		imagenPpal.setBounds(0, 0, 1280, 720);

		btnPaciente = new JButton("paciente");
		btnPaciente.setBounds(100, 470, 300, 105);
		btnPaciente.setOpaque(false);
		btnPaciente.setActionCommand("PACIENTE");

		btnEspecialista = new JButton("especialista ");
		btnEspecialista.setBounds(900, 470, 320, 105);
		btnEspecialista.setOpaque(false);
		btnEspecialista.setActionCommand("ESPECIALISTA");
		
		btnDirectorM = new JButton("director medico ");
		btnDirectorM.setBounds(450, 470, 370, 105);
		btnDirectorM.setOpaque(false);
		btnDirectorM.setActionCommand("DIRECTOR MEDICO");
		
		
		add(btnPaciente);
		add(btnEspecialista);
		add(btnDirectorM);
		add(imagenPpal);
	

	}



	public JButton getbtnPaciente() {
		return btnPaciente;
	}

	public void setbtnPaciente(JButton btnPaciente) {
		this.btnPaciente = btnPaciente;
	}

	public JButton getbtnEspecialista() {
		return btnEspecialista;
	}

	public void setbtnEspecialista(JButton btnEspecialista) {
		this.btnEspecialista = btnEspecialista;
	}
	
	public JButton getbtnDirectorM() {
		return btnDirectorM;
	}

	public void setbtnDirectorM(JButton btnDirectorM) {
		this.btnDirectorM = btnDirectorM;
	}
	public JLabel getImagenPpal() {
		return imagenPpal;
	}

	public void setImagenPpal(JLabel imagenPpal) {
		this.imagenPpal = imagenPpal;
	}

}