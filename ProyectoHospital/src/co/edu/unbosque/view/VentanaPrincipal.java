package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {

    private MenuPrincipal menuPpal;
    private PanelMenuPaciente panelMenuP;
    private PanelRegistroPaciente panelRegistroP;
    private PanelInicioSesionPaciente panelInicioSesionP;
    private PanelMenuEspecialista panelMenuE;
    private PanelInicioSesionEspecialista panelInicioSesionE;
    private PanelRegistroEspecialista panelRegistroE;
    private PanelMenuPrincipalPaciente panelMenuPpalP;
    private PanelMenuPrincipalEspecialista panelMenuPpalE;
    private PanelAgendarCitaPaciente panelAgendarCitaP;
    private PanelReprogramarCitaPaciente panelReprogramarCitaP;
    private PanelCancelarCitaPaciente panelCancelarCitaP;
    private PanelRealizarCambioDeTurno panelCambioTurno;
    private PanelCambioDeTurnoEspecialista panelCambioTurno2;
    private PanelAceptarCambioTurno panelAceptarTurnoE;
    private PanelMostrarCitasProgramadasE panelMostrarCitasProgramadas;
    private PanelMostrarCitasYExamenesP panelMostrarCitasYExamenesP;
    private PanelMostrarTratamientoGeneradoP panelMostrarTratamiento;
    private PanelMostrarResultadosExamenesP panelMostrarResultadosExamenes;
    private PanelMenuPrincipalDirectorMedico panelMenuPpalD;
    private PanelMenuDirectorMedico panelMenuD;
    private PanelInicioSesionDirectorMedico panelInicioSesionD;
    private PanelRegistroDirectorMedico panelRegistroDm;

    public VentanaPrincipal() {
        setLocation(70, 70);
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setVisible(true);

        setTitle("MENU PRINCIPAL");

        ImageIcon logo = new ImageIcon("src/media/logoHospital.png");
        setIconImage(logo.getImage());

        menuPpal = new MenuPrincipal();
        panelMenuP = new PanelMenuPaciente();
        panelRegistroP = new PanelRegistroPaciente();
        panelInicioSesionP = new PanelInicioSesionPaciente();
        panelMenuE = new PanelMenuEspecialista();
        panelInicioSesionE = new PanelInicioSesionEspecialista();
        panelRegistroE = new PanelRegistroEspecialista();
        panelMenuPpalP = new PanelMenuPrincipalPaciente();
        panelMenuPpalE = new PanelMenuPrincipalEspecialista();
        panelAgendarCitaP = new PanelAgendarCitaPaciente();
        panelReprogramarCitaP = new PanelReprogramarCitaPaciente();
        panelCancelarCitaP = new PanelCancelarCitaPaciente();
        panelCambioTurno = new PanelRealizarCambioDeTurno();
        panelCambioTurno2 = new PanelCambioDeTurnoEspecialista();
        panelAceptarTurnoE = new PanelAceptarCambioTurno();
        panelMostrarCitasProgramadas = new PanelMostrarCitasProgramadasE();
        panelMostrarCitasYExamenesP = new PanelMostrarCitasYExamenesP();
        panelMostrarTratamiento = new PanelMostrarTratamientoGeneradoP();
        panelMostrarResultadosExamenes = new PanelMostrarResultadosExamenesP();
        panelMenuPpalD = new PanelMenuPrincipalDirectorMedico();
        panelMenuD = new PanelMenuDirectorMedico();
        panelInicioSesionD = new PanelInicioSesionDirectorMedico();
        panelRegistroDm = new PanelRegistroDirectorMedico();
        
    }
    





	public void mostrarMenuPrincipal() {
        setContentPane(menuPpal);
		revalidate();
		repaint();
    }


    public MenuPrincipal getMenuPpal() {
        return menuPpal;
    }


	public void mostrarPanelMenuPaciente() {
        setContentPane(panelMenuP);
		revalidate();
		repaint();
    }


    public PanelMenuPaciente getPanelMenuPpal() {
        return panelMenuP;
    }
    
    public void mostrarPanelRegistroPaciente() {
        setContentPane(panelRegistroP);
		revalidate();
		repaint();
    }


    public PanelRegistroPaciente getPanelRegistroPaciente() {
        return panelRegistroP;
    }
    
    
    
    
    
    
    
    public void mostrarPanelInicioSesionPaciente() {
        setContentPane(panelInicioSesionP);
		revalidate();
		repaint();
    }


    public PanelInicioSesionPaciente getPanelInicioSesionP() {
        return panelInicioSesionP;
    }
    
    
    public void mostrarPanelMenuEspecialista() {
        setContentPane(panelMenuE);
		revalidate();
		repaint();
    }
    public PanelMenuEspecialista getPanelMenuE() {
        return panelMenuE;
    }
   
    
    
    public void mostrarPanelInicioSesionEspecialista() {
        setContentPane(panelInicioSesionE);
		revalidate();
		repaint();
    }


    public PanelInicioSesionEspecialista getPanelInicioSesionE() {
        return panelInicioSesionE;
    }
    
    public void mostrarPanelRegistroEspecialista() {
        setContentPane(panelRegistroE);
		revalidate();
		repaint();
    }


    public PanelRegistroEspecialista getPanelRegistroEspecialista() {
        return panelRegistroE;
    }
    
    
    public void mostrarPanelMenuPrincipalPaciente() {
        setContentPane(panelMenuPpalP);
		revalidate();
		repaint();
    }


    public PanelMenuPrincipalPaciente getPanelMenuPrincipalPaciente() {
        return panelMenuPpalP;
    }

    public void mostrarPanelMenuPrincipalEspecialista() {
        setContentPane(panelMenuPpalE);
		revalidate();
		repaint();
    }


    public PanelMenuPrincipalEspecialista getPanelMenuPrincipalEspecialista() {
        return panelMenuPpalE;
    }
    
    
    public void mostrarPanelAgendarCitaPaciente() {
        setContentPane(panelAgendarCitaP);
		revalidate();
		repaint();
    }


    public PanelAgendarCitaPaciente getPanelAgendarCitaPaciente() {
        return panelAgendarCitaP;
    }

    public void mostrarPanelReprogramarCitaPaciente() {
        setContentPane(panelReprogramarCitaP);
		revalidate();
		repaint();
    }


    public PanelReprogramarCitaPaciente getPanelReprogramarCitaPaciente() {
        return panelReprogramarCitaP;
    }

    public void mostrarPanelCancelarCitaPaciente() {
        setContentPane(panelCancelarCitaP);
		revalidate();
		repaint();
    }


    public PanelCancelarCitaPaciente getPanelCancelarCitaPaciente() {
        return panelCancelarCitaP;
    }
    
    public void mostrarPanelRealizarCambioDeTurno() {
        setContentPane(panelCambioTurno);
		revalidate();
		repaint();
    }


    public PanelRealizarCambioDeTurno getPanelRealizarCambioDeTurno() {
        return panelCambioTurno;
    }

    public void mostrarPanelCambioDeTurnoEspecialista() {
        setContentPane(panelCambioTurno2);
		revalidate();
		repaint();
    }


    public PanelCambioDeTurnoEspecialista getPanelCambioDeTurnoEspecialista() {
        return panelCambioTurno2;
    }

    public void mostrarPanelAceptarCambioTurno() {
        setContentPane(panelAceptarTurnoE);
		revalidate();
		repaint();
    }


    public PanelAceptarCambioTurno getPanelAceptarCambioTurno() {
        return panelAceptarTurnoE;
    }

    public void mostrarPanelMostrarCitasProgramadasE() {
        setContentPane(panelMostrarCitasProgramadas);
		revalidate();
		repaint();
    }


    public PanelMostrarCitasProgramadasE getPanelMostrarCitasProgramadas() {
        return panelMostrarCitasProgramadas;
    }

    public void mostrarPanelMostrarCitasYExamenesP() {
        setContentPane(panelMostrarCitasYExamenesP);
		revalidate();
		repaint();
    }


    public PanelMostrarCitasYExamenesP getPanelMostrarCitasYExamenesP() {
        return panelMostrarCitasYExamenesP;
    }
    
    public void mostrarPanelMostrarTratamientoGeneradoP() {
        setContentPane(panelMostrarTratamiento);
		revalidate();
		repaint();
    }


    public PanelMostrarTratamientoGeneradoP getPanelMostrarTratamientoGeneradoP() {
        return panelMostrarTratamiento;
    }
    
    public void mostrarPanelMostrarResultadosExamenesP() {
        setContentPane(panelMostrarResultadosExamenes);
		revalidate();
		repaint();
    }
    


    public PanelMostrarResultadosExamenesP getPanelMostrarResultadosExamenesP() {
        return panelMostrarResultadosExamenes;
    }

    public void mostrarPanelMenuPrincipalDirectorMedico() {
        setContentPane(panelMenuPpalD);
		revalidate();
		repaint();
    }
    

    public PanelMenuPrincipalDirectorMedico getPanelMenuPrincipalDirectorMedico() {
        return panelMenuPpalD;
        
    }
    public void mostrarPanelMenuDirectorMedico() {
        setContentPane(panelMenuD);
		revalidate();
		repaint();
    }
    


    public PanelMenuDirectorMedico getPanelMenuDirectorMedico() {
        return panelMenuD;
    }
    public void mostrarPanelInicioSesionDirectorMedico() {
        setContentPane(panelInicioSesionD);
		revalidate();
		repaint();
    }
    


    public PanelInicioSesionDirectorMedico getPanelInicioSesionDirectorMedico() {
        return panelInicioSesionD;
    }
    
    public void mostrarPanelRegistroDirectorMedico() {
        setContentPane(panelRegistroDm);
		revalidate();
		repaint();
    }
    


    public PanelRegistroDirectorMedico getPanelRegistroDirectorMedico() {
        return panelRegistroDm;
    }

}