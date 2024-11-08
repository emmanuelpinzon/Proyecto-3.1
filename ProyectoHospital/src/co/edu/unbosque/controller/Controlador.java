package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.PacienteDTO;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private ViewFacade vf;
	private ModelFacade mf;

	
	private boolean paciente = false;
	private boolean especialista = false;
	private boolean registroP = false;
	private boolean inicioSesionP = false;
	private boolean menuPpal = false;
	private boolean menuP = false;
	private boolean inicioSesionE = false;
	private boolean registroE = false;
	private boolean menuE = false;
	private boolean menuPpalP = false;
	private boolean menuPpalE = false;
	private boolean agendarCitaP = false;
	private boolean reprogramarCitaP = false;
	private boolean cancelarCitaP = false;
	private boolean cambioTurno = false;
	private boolean cambioTurno2 = false;
	private boolean aceptarCambioTurno = false;
	private boolean mostrarCitasProgramadasE = false;
	private boolean mostrarCitasYExamenesP = false;
	private boolean mostrarTratamientoP = false;
	private boolean mostrarResultadosExamenesP = false;
	private boolean directorMedico = false;
	private boolean inicioSesionD = false;
	private boolean registroD = false;
	private boolean menuPpalD = false;
	private boolean confirmarCambioTurno = false;
	private boolean mostrarReporteSemanalD = false;
	private boolean mostrarReporteMensualD = false;
	private boolean reprogramarCitaP2 = false;

	public Controlador() {
		vf = new ViewFacade();
		mf = new ModelFacade();
		vf.getPrincipal().mostrarMenuPrincipal();
		vf.getCon().mostrarMensajeEmergente("Bienvenido a Bosque Health");

		asignarLectores();
	}

	public void asignarLectores() {
		vf.getPrincipal().getMenuPpal().getbtnPaciente().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getbtnPaciente().setActionCommand("Paciente");

		vf.getPrincipal().getMenuPpal().getbtnEspecialista().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getbtnEspecialista().setActionCommand("Especialista");

		vf.getPrincipal().getPanelMenuPpal().getbtnIniciarSesion().addActionListener(this);
		vf.getPrincipal().getPanelMenuPpal().getbtnIniciarSesion().setActionCommand("iniciar sesion");

		vf.getPrincipal().getPanelMenuE().getbtnIniciarSesionEs().addActionListener(this);
		vf.getPrincipal().getPanelMenuE().getbtnIniciarSesionEs().setActionCommand("iniciar sesion especialista");


		
		vf.getPrincipal().getPanelMenuPpal().getbtnRegistrarse().addActionListener(this);
		vf.getPrincipal().getPanelMenuPpal().getbtnRegistrarse().setActionCommand("registrarse");
		
		vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().addActionListener(this);
		vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().setActionCommand("hola");
		


		vf.getPrincipal().getPanelMenuE().getbtnRegistrarseE().addActionListener(this);
		vf.getPrincipal().getPanelMenuE().getbtnRegistrarseE().setActionCommand("registrar especialista");

		vf.getPrincipal().getPanelMenuPpal().getbtnVolver().addActionListener(this);
		vf.getPrincipal().getPanelMenuPpal().getbtnVolver().setActionCommand("volver al menu principal desde paciente");

		vf.getPrincipal().getPanelMenuE().getbtnVolver2().addActionListener(this);
		vf.getPrincipal().getPanelMenuE().getbtnVolver2().setActionCommand("volver al menu principal desde especialista");

		vf.getPrincipal().getPanelInicioSesionP().getBtnVolverP().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionP().getBtnVolverP()
				.setActionCommand("volver al menu paciente desde inicio sesion");

		vf.getPrincipal().getPanelRegistroPaciente().getBtnVolverP1().addActionListener(this);
		vf.getPrincipal().getPanelRegistroPaciente().getBtnVolverP1()
				.setActionCommand("volver al menu paciente desde registro");

		vf.getPrincipal().getPanelInicioSesionE().getBtnVolverE().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionE().getBtnVolverE()
				.setActionCommand("volver al menu especialista desde inicio sesion");

		vf.getPrincipal().getPanelRegistroEspecialista().getBtnVolverEs().addActionListener(this);
		vf.getPrincipal().getPanelRegistroEspecialista().getBtnVolverEs()
				.setActionCommand("volver al menu especialista desde registro");

		vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().addActionListener(this);
		vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().setActionCommand("menu principal de paciente");

		vf.getPrincipal().getPanelInicioSesionP().getBtnIniciarSesion().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionP().getBtnIniciarSesion().setActionCommand("menu principal de paciente");

		vf.getPrincipal().getPanelRegistroEspecialista().getBtnRegistrarE().addActionListener(this);
		vf.getPrincipal().getPanelRegistroEspecialista().getBtnRegistrarE()
				.setActionCommand("menu principal de especialista");

		vf.getPrincipal().getPanelInicioSesionE().getBtnIniciarSesionE().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionE().getBtnIniciarSesionE().setActionCommand("menu principal de especialista");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnVolverPP().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnVolverPP().setActionCommand("volver al inicio sesion desde menu principal paciente");

		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnVolverEE().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnVolverEE().setActionCommand("volver al inicio sesion desde menu principal especialista");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnAgendarCita().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnAgendarCita().setActionCommand("agendar cita paciente");

		vf.getPrincipal().getPanelAgendarCitaPaciente().getBtnVolverCc().addActionListener(this);
		vf.getPrincipal().getPanelAgendarCitaPaciente().getBtnVolverCc().setActionCommand("volver de agendar cita paciente a menu principal paciente");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnReprogramarCita().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnReprogramarCita().setActionCommand("reprogramar cita paciente");

		vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnVolverRr().addActionListener(this);
		vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnVolverRr()
		.setActionCommand("volver de reprogramar cita paciente a menu principal paciente");
		
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnCancelarCita().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnCancelarCita().setActionCommand("cancelar cita paciente");
		
		vf.getPrincipal().getPanelCancelarCitaPaciente().getBtnVolverCa().addActionListener(this);
		vf.getPrincipal().getPanelCancelarCitaPaciente().getBtnVolverCa().setActionCommand("volver de cancelar cita paciente a menu principal paciente");
		
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnRealizarCambioTurno().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnRealizarCambioTurno().setActionCommand("realizar cambio turno especialista");
		
		vf.getPrincipal().getPanelRealizarCambioDeTurno().getBtnVolverRc().addActionListener(this);
		vf.getPrincipal().getPanelRealizarCambioDeTurno().getBtnVolverRc().setActionCommand("volver de realizar cambio de turno a menu principal");
		
		vf.getPrincipal().getPanelRealizarCambioDeTurno().getBtnContinuarRc().addActionListener(this);
		vf.getPrincipal().getPanelRealizarCambioDeTurno().getBtnContinuarRc().setActionCommand("continuar al cambio de turno");
		
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnAceptarCambioTurno().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnAceptarCambioTurno().setActionCommand("aceptar cambio turno");
		
		vf.getPrincipal().getPanelAceptarCambioTurno().getBtnVolverCt().addActionListener(this);
		vf.getPrincipal().getPanelAceptarCambioTurno().getBtnVolverCt().setActionCommand("volver de aceptar cambio de turno a menu principal");
		
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnMostrarCitasProgramadas().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnMostrarCitasProgramadas().setActionCommand("mostrar citas programadas");
		
		vf.getPrincipal().getPanelMostrarCitasProgramadas().getBtnVolverMc().addActionListener(this);
		vf.getPrincipal().getPanelMostrarCitasProgramadas().getBtnVolverMc().setActionCommand("volver de mostrar citas asignadas a menu principal especialista");
		
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarCitas().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarCitas().setActionCommand("mostrar citas y examenes programados paciente");
		
		vf.getPrincipal().getPanelMostrarCitasYExamenesP().getBtnVolverME().addActionListener(this);
		vf.getPrincipal().getPanelMostrarCitasYExamenesP().getBtnVolverME().setActionCommand("volver de mostrar citas y examenes asignados a menu principal paciente");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarTratamiento().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarTratamiento().setActionCommand("mostrar tratamiento paciente");
		
		vf.getPrincipal().getPanelMostrarTratamientoGeneradoP().getBtnVolverTP().addActionListener(this);
		vf.getPrincipal().getPanelMostrarTratamientoGeneradoP().getBtnVolverTP().setActionCommand("volver de mostrar tratamiento a menu principal paciente");
		
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarResultados().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarResultados().setActionCommand("mostrar resultados paciente");
		
		vf.getPrincipal().getPanelMostrarResultadosExamenesP().getBtnVolverRE().addActionListener(this);
		vf.getPrincipal().getPanelMostrarResultadosExamenesP().getBtnVolverRE().setActionCommand("volver de mostrar resultados examenes a menu principal paciente");
		
		vf.getPrincipal().getPanelCambioDeTurnoEspecialista().getBtnVolverRt().addActionListener(this);
		vf.getPrincipal().getPanelCambioDeTurnoEspecialista().getBtnVolverRt().setActionCommand("volver de realizar cambio de turno 2 a cambio turno 1");
		
		vf.getPrincipal().getMenuPpal().getbtnDirectorM().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getbtnDirectorM().setActionCommand("Director Medico");
		
		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnIniciarSesionD().addActionListener(this);
		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnIniciarSesionD().setActionCommand("iniciar sesion director");
		
		vf.getPrincipal().getPanelInicioSesionDirectorMedico().getBtnVolverD().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionDirectorMedico().getBtnVolverD().setActionCommand("volver al menu director desde inicio sesion");
		
		
		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnVolverDE().addActionListener(this);
		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnVolverDE().setActionCommand("volver al menu principal desde director medico");
		
		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnRegistrarseD().addActionListener(this);
		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnRegistrarseD().setActionCommand("registrar director");
		
		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnVolverDM().addActionListener(this);
		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnVolverDM().setActionCommand("volver al menu director desde registro");
		
		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnRegistrarDM().addActionListener(this);
		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnRegistrarDM()
				.setActionCommand("menu principal de director medico");

		vf.getPrincipal().getPanelInicioSesionDirectorMedico().getBtnIniciarSesionD().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionDirectorMedico().getBtnIniciarSesionD().setActionCommand("menu principal de director medico");
		
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnVolverDME().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnVolverDME().setActionCommand("volver al menu desde menu principal director medico");
		
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnConfirmarCambioTurno().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnConfirmarCambioTurno().setActionCommand("confirmar cambio turno");
		
		vf.getPrincipal().getPanelConfirmarCambioTurnoDirector().getBtnVolverCtt().addActionListener(this);
		vf.getPrincipal().getPanelConfirmarCambioTurnoDirector().getBtnVolverCtt().setActionCommand("volver de confirmar cambio turno a menu principal director");
		
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnMostrarReporteSemanal().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnMostrarReporteSemanal().setActionCommand("mostrar reporte semanal director");
		
		vf.getPrincipal().getPanelMostrarReporteSemanalDirector().getBtnVolverMsd().addActionListener(this);
		vf.getPrincipal().getPanelMostrarReporteSemanalDirector().getBtnVolverMsd().setActionCommand("volver de mostrar reporte semanal a menu principal director");
		
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnMostrarReporteMensual().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnMostrarReporteMensual().setActionCommand("mostrar reporte mensual director");
		
		vf.getPrincipal().getPanelMostrarReporteMensualDirector().getBtnVolverRmd().addActionListener(this);
		vf.getPrincipal().getPanelMostrarReporteMensualDirector().getBtnVolverRmd().setActionCommand("volver de mostrar reporte mensual a menu principal director");
		
		vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnContinuar().addActionListener(this);
		vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnContinuar().setActionCommand("continuar a reprogramar cita paciente");
		
		vf.getPrincipal().getPanelContinuarReprogramarCitaPaciente().getBtnVolverCrp().addActionListener(this);
		vf.getPrincipal().getPanelContinuarReprogramarCitaPaciente().getBtnVolverCrp().setActionCommand("volver de reprogramar cita 2 a reprogramar cita 1");
		
		vf.getPrincipal().getPanelRegistroPaciente().getNombre().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getNumeroDocumento().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getCorreo().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getJcbGenero().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getContraseña().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().setVisible(true);
		

		vf.getPrincipal().getPanelRegistroEspecialista().getNombre().setVisible(true);
		vf.getPrincipal().getPanelRegistroEspecialista().getNumeroDocumento().setVisible(true);
		vf.getPrincipal().getPanelRegistroEspecialista().getCorreo().setVisible(true);
		vf.getPrincipal().getPanelRegistroEspecialista().getContraseña().setVisible(true);
		vf.getPrincipal().getPanelRegistroEspecialista().getTipoEspecialidad().setVisible(true);
		
		vf.getPrincipal().getPanelRegistroDirectorMedico().getNombreD().setVisible(true);
		vf.getPrincipal().getPanelRegistroDirectorMedico().getNumeroDocumentoD().setVisible(true);
		vf.getPrincipal().getPanelRegistroDirectorMedico().getCorreoD().setVisible(true);
		vf.getPrincipal().getPanelRegistroDirectorMedico().getContraseñaD().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		case "Paciente":

			vf.getPrincipal().setTitle("MENU PACIENTE");

			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPaciente();

			paciente = true;

			break;

		case "Especialista":

			vf.getPrincipal().setTitle("MENU ESPECIALISTA");

			vf.getPrincipal().getPanelMenuE().getImagenMenuE().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuEspecialista();

			especialista = true;

			break;

		case "registrarse":
			vf.getPrincipal().setTitle("REGISTRAR PACIENTE");

			vf.getPrincipal().getPanelRegistroPaciente().getNombre().setVisible(true);
			vf.getPrincipal().getPanelRegistroPaciente().getNumeroDocumento().setVisible(true);
			vf.getPrincipal().getPanelRegistroPaciente().getCorreo().setVisible(true);
			vf.getPrincipal().getPanelRegistroPaciente().getContraseña().setVisible(true);
			vf.getPrincipal().getPanelRegistroPaciente().getJcbGenero().setVisible(true);

			vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(true);

			vf.getPrincipal().mostrarPanelRegistroPaciente();

			registroP = true;

			break;
		case"hola":
			
			String nombre = vf.getPrincipal().getPanelRegistroPaciente().getNombre().getText();
			
			String correo = vf.getPrincipal().getPanelRegistroPaciente().getCorreo().getText();
			
			String cedula = vf.getPrincipal().getPanelRegistroPaciente().getNumeroDocumento().getText();
			int cedula1 = vf.getCon().readInt(cedula);
			
			String contrasena= vf.getPrincipal().getPanelRegistroPaciente().getContraseña().getText();
			int contrasena1 = vf.getCon().readInt(contrasena);
			
			String genero = (String) vf.getPrincipal().getPanelRegistroPaciente().getJcbGenero().getSelectedItem();
			
			mf.getPdao().add(new PacienteDTO(nombre, cedula1, correo, contrasena1, genero));
			vf.getCon().mostrarMensajeEmergente("se ha registrado exitosamente");
			
			break;

		case "registrar especialista":
			vf.getPrincipal().setTitle("REGISTRAR ESPECIALISTA");

			vf.getPrincipal().getPanelRegistroEspecialista().getNombre().setVisible(true);
			vf.getPrincipal().getPanelRegistroEspecialista().getNumeroDocumento().setVisible(true);
			vf.getPrincipal().getPanelRegistroEspecialista().getCorreo().setVisible(true);
			vf.getPrincipal().getPanelRegistroEspecialista().getContraseña().setVisible(true);
			vf.getPrincipal().getPanelRegistroEspecialista().getTipoEspecialidad().setVisible(true);

			vf.getPrincipal().getPanelRegistroEspecialista().getImagenRegistroE().setVisible(true);

			vf.getPrincipal().mostrarPanelRegistroEspecialista();

			registroE = true;

			break;

		case "iniciar sesion":
			vf.getPrincipal().setTitle("INICIAR SESION PACIENTE");

			vf.getPrincipal().getPanelInicioSesionP().getNumeroDocumento().setVisible(true);
			vf.getPrincipal().getPanelInicioSesionP().getContraseña().setVisible(true);

			vf.getPrincipal().getPanelInicioSesionP().getImagenInicioSesionP().setVisible(true);

			vf.getPrincipal().mostrarPanelInicioSesionPaciente();
			
			

			inicioSesionP = true;

			break;
		

		case "iniciar sesion especialista":
			vf.getPrincipal().setTitle("INICIAR SESION ESPECIALISTA");

			vf.getPrincipal().getPanelInicioSesionE().getNumeroDocumento().setVisible(true);
			vf.getPrincipal().getPanelInicioSesionE().getContraseña().setVisible(true);

			vf.getPrincipal().getPanelInicioSesionE().getImagenInicioSesionE().setVisible(true);

			vf.getPrincipal().mostrarPanelInicioSesionEspecialista();

			inicioSesionE = true;

			break;

		case "volver al menu principal desde paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(false);
			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);

			vf.getPrincipal().mostrarMenuPrincipal();
			
			
			

			registroP = false;
			menuPpal = true;

			break;

		case "volver al menu principal desde especialista":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelRegistroEspecialista().getImagenRegistroE().setVisible(false);
			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);

			vf.getPrincipal().mostrarMenuPrincipal();

			registroE = false;
			menuPpal = true;

			break;
		case "volver al menu paciente desde inicio sesion":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelInicioSesionP().getImagenInicioSesionP().setVisible(false);
			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPaciente();

			inicioSesionP = false;
			menuP = true;

			break;

		case "volver al menu paciente desde registro":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(false);
			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPaciente();

			registroP = false;
			menuP = true;

			break;

		case "volver al menu especialista desde inicio sesion":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelInicioSesionE().getImagenInicioSesionE().setVisible(false);
			vf.getPrincipal().getPanelMenuE().getImagenMenuE().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuEspecialista();

			inicioSesionE = false;
			menuE = true;

			break;

		case "volver al menu especialista desde registro":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelRegistroEspecialista().getImagenRegistroE().setVisible(false);
			vf.getPrincipal().getPanelMenuE().getImagenMenuE().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuEspecialista();

			registroE = false;
			menuE = true;

			break;

		case "menu principal de paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelInicioSesionP().getImagenInicioSesionP().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);

			vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();
			
			vf.getCon().mostrarMensajeEmergente("Bienvenido al Menu Principal de Paciente");

			inicioSesionP = false;
			registroP = false;
			menuPpalP = true;

			break;

		case "menu principal de especialista":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelInicioSesionE().getImagenInicioSesionE().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(true);

			vf.getPrincipal().getPanelRegistroEspecialista().getImagenRegistroE().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalEspecialista();
			
			vf.getCon().mostrarMensajeEmergente("Bienvenido al Menu Principal de Especialista");

			inicioSesionE = false;
			registroE = false;
			menuPpalE = true;

			break;

		case "volver al inicio sesion desde menu principal paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
			vf.getPrincipal().getMenuPpal().getImagenPpal().setVisible(true);

			vf.getPrincipal().mostrarMenuPrincipal();

			menuPpalP = false;
			menuP = true;

			break;

		case "volver al inicio sesion desde menu principal especialista":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(false);
			vf.getPrincipal().getMenuPpal().getImagenPpal().setVisible(true);

			vf.getPrincipal().mostrarMenuPrincipal();

			menuPpalE = false;
			menuP = true;

			break;

		case "agendar cita paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
			vf.getPrincipal().getPanelAgendarCitaPaciente().getImagenAgendarCitaP().setVisible(true);

			vf.getPrincipal().mostrarPanelAgendarCitaPaciente();
			

			menuPpalP = false;
			agendarCitaP = true;

			break;

		case "volver de agendar cita paciente a menu principal paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelAgendarCitaPaciente().getImagenAgendarCitaP().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();

			agendarCitaP = false;
			menuPpalP = true;

			break;

		case "reprogramar cita paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
			vf.getPrincipal().getPanelReprogramarCitaPaciente().getImagenReprogramarCitaP().setVisible(true);

			vf.getPrincipal().mostrarPanelReprogramarCitaPaciente();

			menuPpalP = false;
			reprogramarCitaP = true;

			break;
			
		case "continuar a reprogramar cita paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelReprogramarCitaPaciente().getImagenReprogramarCitaP().setVisible(false);
			vf.getPrincipal().getPanelContinuarReprogramarCitaPaciente().getImagenReprogramarCita2().setVisible(true);

			vf.getPrincipal().mostrarPanelContinuarReprogramarCitaPaciente();

			reprogramarCitaP = false;
			reprogramarCitaP2 = true;

			break;
			
		case "volver de reprogramar cita 2 a reprogramar cita 1":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelContinuarReprogramarCitaPaciente().getImagenReprogramarCita2().setVisible(false);
			vf.getPrincipal().getPanelReprogramarCitaPaciente().getImagenReprogramarCitaP().setVisible(true);

			vf.getPrincipal().mostrarPanelReprogramarCitaPaciente();

			reprogramarCitaP2 = false;
			reprogramarCitaP = true;

			break;	
			
			

		case "volver de reprogramar cita paciente a menu principal paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelReprogramarCitaPaciente().getImagenReprogramarCitaP().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();

			reprogramarCitaP = false;
			menuPpalP = true;

			break;
			
		case "cancelar cita paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
			vf.getPrincipal().getPanelCancelarCitaPaciente().getImagenCancelarCitaP().setVisible(true);

			vf.getPrincipal().mostrarPanelCancelarCitaPaciente();

			menuPpalP = false;
			cancelarCitaP = true;

			break;
			
		case "volver de cancelar cita paciente a menu principal paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelCancelarCitaPaciente().getImagenCancelarCitaP().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();

			cancelarCitaP = false;
			menuPpalP = true;

			break;	
			
		case "realizar cambio turno especialista":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(false);
			vf.getPrincipal().getPanelRealizarCambioDeTurno().getImagenCambioTurno().setVisible(true);

			vf.getPrincipal().mostrarPanelRealizarCambioDeTurno();

			menuPpalE = false;
			cambioTurno = true;

			break;
			
			
		case "volver de realizar cambio de turno a menu principal":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelRealizarCambioDeTurno().getImagenCambioTurno().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalEspecialista();

			cambioTurno = false;
			menuPpalE = true;

			break;	
			
		case "volver de realizar cambio de turno 2 a cambio turno 1":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelCambioDeTurnoEspecialista().getImagenCambioTurno2().setVisible(false);
			vf.getPrincipal().getPanelRealizarCambioDeTurno().getImagenCambioTurno().setVisible(true);

			vf.getPrincipal().mostrarPanelRealizarCambioDeTurno();

			cambioTurno2 = false;
			cambioTurno = true;

			break;	
			
		case "continuar al cambio de turno":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelRealizarCambioDeTurno().getImagenCambioTurno().setVisible(false);
			vf.getPrincipal().getPanelCambioDeTurnoEspecialista().getImagenCambioTurno2().setVisible(true);

			vf.getPrincipal().mostrarPanelCambioDeTurnoEspecialista();

			cambioTurno = false;
			cambioTurno2 = true;

			break;	

		case "aceptar cambio turno":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(false);
			vf.getPrincipal().getPanelAceptarCambioTurno().getImagenAceptarCambioTurno().setVisible(true);

			vf.getPrincipal().mostrarPanelAceptarCambioTurno();

			menuPpalE = false;
			aceptarCambioTurno = true;

			break;	
			
		case "volver de aceptar cambio de turno a menu principal":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelAceptarCambioTurno().getImagenAceptarCambioTurno().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalEspecialista();

			aceptarCambioTurno = false;
			menuPpalE = true;

			break;
			
		case "mostrar citas programadas":
			
			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(false);
			vf.getPrincipal().getPanelMostrarCitasProgramadas().getImagenMostrarCitasP().setVisible(true);

			vf.getPrincipal().mostrarPanelMostrarCitasProgramadasE();

			menuPpalE = false;
			mostrarCitasProgramadasE= true;

			break;	
			
		case "volver de mostrar citas asignadas a menu principal especialista":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMostrarCitasProgramadas().getImagenMostrarCitasP().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalEspecialista();

			mostrarCitasProgramadasE = false;
			menuPpalE = true;

			break;
			
		case "mostrar citas y examenes programados paciente":
			
			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
			vf.getPrincipal().getPanelMostrarCitasYExamenesP().getImagenMostrarCitasYExamenes().setVisible(true);

			vf.getPrincipal().mostrarPanelMostrarCitasYExamenesP();

			menuPpalP = false;
			mostrarCitasYExamenesP= true;

			break;
			
		case "volver de mostrar citas y examenes asignados a menu principal paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMostrarCitasYExamenesP().getImagenMostrarCitasYExamenes().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();

			mostrarCitasYExamenesP = false;
			menuPpalP = true;

			break;	
			
		case "mostrar tratamiento paciente":
			
			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
			vf.getPrincipal().getPanelMostrarTratamientoGeneradoP().getImagenMostrarTratamientoP().setVisible(true);

			vf.getPrincipal().mostrarPanelMostrarTratamientoGeneradoP();

			menuPpalP = false;
			mostrarTratamientoP= true;

			break;
			
		case "volver de mostrar tratamiento a menu principal paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMostrarTratamientoGeneradoP().getImagenMostrarTratamientoP().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();

			mostrarTratamientoP= false;
			menuPpalP = true;

			break;	
			
		case "mostrar resultados paciente":
			
			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
			vf.getPrincipal().getPanelMostrarResultadosExamenesP().getImagenMostrarResultados().setVisible(true);

			vf.getPrincipal().mostrarPanelMostrarResultadosExamenesP();

			menuPpalP = false;
			mostrarResultadosExamenesP= true;

			break;
			
		case "volver de mostrar resultados examenes a menu principal paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMostrarResultadosExamenesP().getImagenMostrarResultados().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();

			mostrarResultadosExamenesP= false;
			menuPpalP = true;

			break;	
		

		case "Director Medico":

			vf.getPrincipal().setTitle("MENU DIRECTOR");

			vf.getPrincipal().getPanelMenuDirectorMedico().getImagenMenuD().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuDirectorMedico();

			directorMedico = true;

			break;
		
		case "iniciar sesion director":
			
			vf.getPrincipal().setTitle("INICIAR SESION DIRECTOR");

			vf.getPrincipal().getPanelInicioSesionDirectorMedico().getNumeroDocumentoD().setVisible(true);
			vf.getPrincipal().getPanelInicioSesionDirectorMedico().getContraseñaD().setVisible(true);

			vf.getPrincipal().getPanelInicioSesionDirectorMedico().getImagenInicioSesionD().setVisible(true);

			vf.getPrincipal().mostrarPanelInicioSesionDirectorMedico();

			inicioSesionD = true;

			break;	
			
		case "volver al menu director desde inicio sesion":
			
	
			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelInicioSesionDirectorMedico().getImagenInicioSesionD().setVisible(false);
			vf.getPrincipal().getPanelMenuDirectorMedico().getImagenMenuD().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuDirectorMedico();

			inicioSesionD = false;
			directorMedico = true;

			break;
			
		case "volver al menu principal desde director medico":
			
			
			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuDirectorMedico().getImagenMenuD().setVisible(false);
			vf.getPrincipal().getMenuPpal().getImagenPpal().setVisible(true);

			vf.getPrincipal().mostrarMenuPrincipal();

			directorMedico = false;
			menuPpal = true;

			break;
				
		case "registrar director":
			
			vf.getPrincipal().setTitle("INICIAR SESION DIRECTOR");

			vf.getPrincipal().getPanelRegistroDirectorMedico().getNombreD().setVisible(true);
			vf.getPrincipal().getPanelRegistroDirectorMedico().getNumeroDocumentoD().setVisible(true);
			vf.getPrincipal().getPanelRegistroDirectorMedico().getCorreoD().setVisible(true);
			vf.getPrincipal().getPanelRegistroDirectorMedico().getContraseñaD().setVisible(true);
			
			vf.getPrincipal().getPanelRegistroDirectorMedico().getImagenRegistroDM().setVisible(true);

			vf.getPrincipal().mostrarPanelRegistroDirectorMedico();

			registroD = true;

			break;
			
		case "volver al menu director desde registro":
			
			
			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelRegistroDirectorMedico().getImagenRegistroDM().setVisible(false);
			vf.getPrincipal().getPanelMenuDirectorMedico().getImagenMenuD().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuDirectorMedico();

			registroD = false;
			directorMedico = true;

			break;	
			
		case "menu principal de director medico":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelInicioSesionDirectorMedico().getImagenInicioSesionD().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getImagenMenuPpalD().setVisible(true);

			vf.getPrincipal().getPanelRegistroDirectorMedico().getImagenRegistroDM().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getImagenMenuPpalD().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalDirectorMedico();
			
			vf.getCon().mostrarMensajeEmergente("Bienvenido al Menu Principal de Director Medico");

			inicioSesionD = false;
			registroD = false;
			menuPpalD = true;

			break;
			
		case "volver al menu desde menu principal director medico":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getImagenMenuPpalD().setVisible(false);
			vf.getPrincipal().getMenuPpal().getImagenPpal().setVisible(true);

			vf.getPrincipal().mostrarMenuPrincipal();

			menuPpalD = false;
			menuPpal = true;

			break;
			
		case "confirmar cambio turno":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getImagenMenuPpalD().setVisible(false);
			vf.getPrincipal().getPanelConfirmarCambioTurnoDirector().getImagenConfirmarCambioTurno().setVisible(true);

			vf.getPrincipal().mostrarPanelConfirmarCambioTurnoDirector();

			menuPpalD = false;
			confirmarCambioTurno = true;

			break;	
			
		case "volver de confirmar cambio turno a menu principal director":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelConfirmarCambioTurnoDirector().getImagenConfirmarCambioTurno().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getImagenMenuPpalD().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalDirectorMedico();

			confirmarCambioTurno= false;
			menuPpalD = true;

			break;	
			
		case "mostrar reporte semanal director":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getImagenMenuPpalD().setVisible(false);
			vf.getPrincipal().getPanelMostrarReporteSemanalDirector().getImagenMostrarReporteSemanalD().setVisible(true);

			vf.getPrincipal().mostrarPanelMostrarReporteSemanalDirector();

			menuPpalD = false;
			mostrarReporteSemanalD = true;

			break;	
			
		case "volver de mostrar reporte semanal a menu principal director":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMostrarReporteSemanalDirector().getImagenMostrarReporteSemanalD().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getImagenMenuPpalD().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalDirectorMedico();

			mostrarReporteSemanalD= false;
			menuPpalD = true;

			break;	
			
		case "mostrar reporte mensual director":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getImagenMenuPpalD().setVisible(false);
			vf.getPrincipal().getPanelMostrarReporteMensualDirector().getImagenMostrarReporteMensualD().setVisible(true);

			vf.getPrincipal().mostrarPanelMostrarReporteMensualDirector();

			menuPpalD = false;
			mostrarReporteMensualD = true;

			break;
			
		case "volver de mostrar reporte mensual a menu principal director":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMostrarReporteMensualDirector().getImagenMostrarReporteMensualD().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getImagenMenuPpalD().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalDirectorMedico();

			mostrarReporteMensualD= false;
			menuPpalD = true;

			break;	

		}
	}
}
