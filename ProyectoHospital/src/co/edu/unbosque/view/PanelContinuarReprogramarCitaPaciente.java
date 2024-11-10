package co.edu.unbosque.view;

import javax.swing.border.Border;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;


public class PanelContinuarReprogramarCitaPaciente extends JPanel {

	

	
    private JButton  btnReprogramarCitaP, btnVolverCrp;
    private JComboBox<String> jcbNewtipoEspecialista,jcbNewHora;
    private JLabel imagenReprogramarCita2;
    private JDateChooser NewfechaCita;
    

    public PanelContinuarReprogramarCitaPaciente() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
        
	       
			String[] especialidad1 = { "Cirugía", "Oncología", "Dermatología", "Neumología", "Cardiología", "Medicina Interna" };
			DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(especialidad1);


			jcbNewtipoEspecialista = new JComboBox<>(modelo);
			jcbNewtipoEspecialista.setBounds(500, 550, 280, 50);
			jcbNewtipoEspecialista.setFont(new Font("Arial", Font.PLAIN, 16));
			
	        String[] horas24 = new String[24];
	        for (int i = 0; i < 24; i++) {
	            horas24[i] = String.format("%02d:00", i); 
	        }
	        jcbNewHora = new JComboBox<>(new DefaultComboBoxModel<>(horas24));
	        jcbNewHora.setBounds(750, 350, 280, 50);
	        jcbNewHora.setFont(new Font("Arial", Font.PLAIN, 16));

	        NewfechaCita = new JDateChooser();
	        NewfechaCita.setBounds(300, 350, 280, 50);
	        NewfechaCita.setDateFormatString("dd-MM-yyyy"); 
		
        btnReprogramarCitaP = new JButton("Reprogramar cita");
        btnReprogramarCitaP.setBounds(950, 540, 180, 80); // Posición ajustada
        btnReprogramarCitaP.setOpaque(true);
        btnReprogramarCitaP.setActionCommand("REPROGRAMAR");

       
        btnVolverCrp = new JButton("Volver");
        btnVolverCrp.setBounds(230, 550, 180, 80); // Posición ajustada
        btnVolverCrp.setOpaque(true);
        btnVolverCrp.setActionCommand("VOLVER");
        

        imagenReprogramarCita2 = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/ReprogramarCitaP2.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenReprogramarCita2.setIcon(new ImageIcon(redimensionado1));
        imagenReprogramarCita2.setBounds(0, 0, 1280, 720);


        
        
        
        add(btnReprogramarCitaP);
        add(btnVolverCrp);
        add(jcbNewtipoEspecialista);
        add(jcbNewHora);
        add(NewfechaCita);
        add(imagenReprogramarCita2);
        setVisible(true);
        
       
        
           }


	public JComboBox<String> getJcbNewtipoEspecialista() {
		return jcbNewtipoEspecialista;
	}


	public void setJcbNewtipoEspecialista(JComboBox<String> jcbNewtipoEspecialista) {
		this.jcbNewtipoEspecialista = jcbNewtipoEspecialista;
	}


	public JComboBox<String> getJcbNewHora() {
		return jcbNewHora;
	}


	public void setJcbNewHora(JComboBox<String> jcbNewHora) {
		this.jcbNewHora = jcbNewHora;
	}


	public JDateChooser getNewfechaCita() {
		return NewfechaCita;
	}


	public void setNewfechaCita(JDateChooser newfechaCita) {
		NewfechaCita = newfechaCita;
	}


	public JButton getBtnReprogramarCitaP() {
		return btnReprogramarCitaP;
	}


	public void setBtnReprogramarCitaP(JButton btnReprogramarCitaP) {
		this.btnReprogramarCitaP = btnReprogramarCitaP;
	}


	public JButton getBtnVolverCrp() {
		return btnVolverCrp;
	}


	public void setBtnVolverCrp(JButton btnVolverCrp) {
		this.btnVolverCrp = btnVolverCrp;
	}


	public JLabel getImagenReprogramarCita2() {
		return imagenReprogramarCita2;
	}


	public void setImagenReprogramarCita2(JLabel imagenReprogramarCita2) {
		this.imagenReprogramarCita2 = imagenReprogramarCita2;
	}

}