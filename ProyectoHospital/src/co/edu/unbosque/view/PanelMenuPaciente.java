package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;


public class PanelMenuPaciente extends JPanel {

	private JLabel imagenMenuP;
    private JButton btnIniciarSesion, btnRegistrarse, btnVolver;

    public PanelMenuPaciente() {
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
        imagenMenuP = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MenuPaciente.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMenuP.setIcon(new ImageIcon(redimensionado1));
        imagenMenuP.setBounds(0, 0, 1280, 720);

        // Botón "Iniciar sesión"
        btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.setBounds(205, 520, 310, 50); // Posición ajustada
        btnIniciarSesion.setOpaque(false);
        btnIniciarSesion.setActionCommand("INICIARSESION");

        // Botón "Registrarse"
        btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setBounds(800, 520, 320, 50); // Posición ajustada
        btnRegistrarse.setOpaque(false);
        btnRegistrarse.setActionCommand("REGISTRARSE");

        // Botón "Volver"
        btnVolver = new JButton("Volver");
        btnVolver.setBounds(585, 610, 150, 50); // Posición ajustada
        btnVolver.setOpaque(false);
        btnVolver.setActionCommand("VOLVER");
        

      

        
        
       
        add(btnIniciarSesion);
        add(btnRegistrarse);
        add(btnVolver);
        add(imagenMenuP);
        
        
           }

    // Métodos getters y setters para las imágenes y los botones

    public JLabel getImagenMenuP() {
        return imagenMenuP;
    }

    public void setImagenMenuP(JLabel imagenMenuP) {
        this.imagenMenuP = imagenMenuP;
    }

   

    public JButton getbtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setbtnIniciarSesion(JButton btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public JButton getbtnRegistrarse() {
        return btnRegistrarse;
    }

    public void setbtnRegistrarse(JButton btnRegistrarse) {
        this.btnRegistrarse = btnRegistrarse;
    }

    public JButton getbtnVolver() {
        return btnVolver;
    }

    public void setbtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }
}