package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;


public class PanelMenuEspecialista extends JPanel {

	private JLabel imagenMenuE;
    private JButton btnIniciarSesionEs, btnRegistrarseE, btnVolver2;

    public PanelMenuEspecialista() {
        setLayout(null);
        setVisible(true);
        setSize(1280, 1200);
    
        
        imagenMenuE = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/MenuEspecialista.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenMenuE.setIcon(new ImageIcon(redimensionado1));
        imagenMenuE.setBounds(0, 0, 1280, 720);

        // Botón "Iniciar sesión"
        btnIniciarSesionEs = new JButton("Iniciar Sesión");
        btnIniciarSesionEs.setBounds(205, 520, 310, 50); // Posición ajustada
        btnIniciarSesionEs.setOpaque(false);
        btnIniciarSesionEs.setActionCommand("INICIARSESION");

        // Botón "Registrarse"
        btnRegistrarseE = new JButton("Registrarse");
        btnRegistrarseE.setBounds(800, 520, 320, 50); // Posición ajustada
        btnRegistrarseE.setOpaque(false);
        btnRegistrarseE.setActionCommand("REGISTRARSE");

        // Botón "Volver"
        btnVolver2 = new JButton("Volver");
        btnVolver2.setBounds(585, 610, 150, 50); // Posición ajustada
        btnVolver2.setOpaque(false);
        btnVolver2.setActionCommand("VOLVER");
        

      

        
        
       
        add(btnIniciarSesionEs);
        add(btnRegistrarseE);
        add(btnVolver2);
        add(imagenMenuE);
        
        
           }

    // Métodos getters y setters para las imágenes y los botones

    public JLabel getImagenMenuE() {
        return imagenMenuE;
    }

    public void setImagenMenuE(JLabel imagenMenuE) {
        this.imagenMenuE = imagenMenuE;
    }

   

    public JButton getbtnIniciarSesionEs() {
        return btnIniciarSesionEs;
    }

    public void setbtnIniciarSesionEs(JButton btnIniciarSesionEs) {
        this.btnIniciarSesionEs = btnIniciarSesionEs;
    }

    public JButton getbtnRegistrarseE() {
        return btnRegistrarseE;
    }

    public void setbtnRegistrarseE(JButton btnRegistrarseE) {
        this.btnRegistrarseE = btnRegistrarseE;
    }

    public JButton getbtnVolver2() {
        return btnVolver2;
    }

    public void setbtnVolver2(JButton btnVolver2) {
        this.btnVolver2 = btnVolver2;
    }
}