package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.CitaDTO;
import co.edu.unbosque.model.EspecialistaDTO;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.PacienteDTO;
import co.edu.unbosque.util.exception.ExceptionChecker;
import co.edu.unbosque.util.exception.InvalidEmailException;
import co.edu.unbosque.util.exception.NameNotValidException;
import co.edu.unbosque.util.exception.NegativeNumberInvalidException;
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

		vf.getPrincipal().getMenuPpal().getbtnDirectorM().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getbtnDirectorM().setActionCommand("Director Medico");

		vf.getPrincipal().getPanelMenuPpal().getbtnIniciarSesion().addActionListener(this);
		vf.getPrincipal().getPanelMenuPpal().getbtnIniciarSesion().setActionCommand("INICIAR SESION");
		
		vf.getPrincipal().getPanelInicioSesionP().getBtnIniciarSesion().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionP().getBtnIniciarSesion().setActionCommand("INICIARSESION");

		vf.getPrincipal().getPanelMenuE().getbtnIniciarSesionEs().addActionListener(this);
		vf.getPrincipal().getPanelMenuE().getbtnIniciarSesionEs().setActionCommand("INICIAR SESION");

		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnIniciarSesionD().addActionListener(this);
		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnIniciarSesionD().setActionCommand("INICIAR SESION");

		vf.getPrincipal().getPanelMenuPpal().getbtnRegistrarse().addActionListener(this);
		vf.getPrincipal().getPanelMenuPpal().getbtnRegistrarse().setActionCommand("REGISTRARSE");

		vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().addActionListener(this);
		vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().setActionCommand("REGISTRAR PACIENTE");

		vf.getPrincipal().getPanelMenuE().getbtnRegistrarseE().addActionListener(this);
		vf.getPrincipal().getPanelMenuE().getbtnRegistrarseE().setActionCommand("REGISTRARSE");

		vf.getPrincipal().getPanelRegistroEspecialista().getBtnRegistrarE().addActionListener(this);
		vf.getPrincipal().getPanelRegistroEspecialista().getBtnRegistrarE().setActionCommand("REGISTRAR");

		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnRegistrarseD().addActionListener(this);
		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnRegistrarseD().setActionCommand("REGISTRARSE");

		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnRegistrarDM().addActionListener(this);
		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnRegistrarDM().setActionCommand("Registrar");

		vf.getPrincipal().getPanelMenuPpal().getbtnVolver().addActionListener(this);
		vf.getPrincipal().getPanelMenuPpal().getbtnVolver().setActionCommand("volver al menu principal desde paciente");

		vf.getPrincipal().getPanelMenuE().getbtnVolver2().addActionListener(this);
		vf.getPrincipal().getPanelMenuE().getbtnVolver2()
				.setActionCommand("volver al menu principal desde especialista");

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
		vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().setActionCommand("REGISTRAR");

		vf.getPrincipal().getPanelInicioSesionP().getBtnIniciarSesion().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionP().getBtnIniciarSesion().setActionCommand("INICIARSESION");

		vf.getPrincipal().getPanelInicioSesionE().getBtnIniciarSesionE().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionE().getBtnIniciarSesionE()
				.setActionCommand("INICIARSESIONE");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnVolverPP().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnVolverPP()
				.setActionCommand("volver al inicio sesion desde menu principal paciente");

		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnVolverEE().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnVolverEE()
				.setActionCommand("volver al inicio sesion desde menu principal especialista");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnAgendarCita().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnAgendarCita().setActionCommand("agendar cita paciente");

		vf.getPrincipal().getPanelAgendarCitaPaciente().getBtnAgregarCita().addActionListener(this);
		vf.getPrincipal().getPanelAgendarCitaPaciente().getBtnAgregarCita().setActionCommand("agregar cita");
		;

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnCancelarCita().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnCancelarCita()
				.setActionCommand("cancelar cita paciente");

		vf.getPrincipal().getPanelCancelarCitaPaciente().getBtnCancelarCita().addActionListener(this);
		vf.getPrincipal().getPanelCancelarCitaPaciente().getBtnCancelarCita().setActionCommand("CANCELARCITA");

		vf.getPrincipal().getPanelAgendarCitaPaciente().getBtnVolverCc().addActionListener(this);
		vf.getPrincipal().getPanelAgendarCitaPaciente().getBtnVolverCc()
				.setActionCommand("volver de agendar cita paciente a menu principal paciente");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnReprogramarCita().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnReprogramarCita()
				.setActionCommand("reprogramar cita paciente");

		vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnVolverRr().addActionListener(this);
		vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnVolverRr()
				.setActionCommand("volver de reprogramar cita paciente a menu principal paciente");

		vf.getPrincipal().getPanelCancelarCitaPaciente().getBtnVolverCa().addActionListener(this);
		vf.getPrincipal().getPanelCancelarCitaPaciente().getBtnVolverCa()
				.setActionCommand("volver de cancelar cita paciente a menu principal paciente");

		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnRealizarCambioTurno().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnRealizarCambioTurno()
				.setActionCommand("realizar cambio turno especialista");

		vf.getPrincipal().getPanelRealizarCambioDeTurno().getBtnVolverRc().addActionListener(this);
		vf.getPrincipal().getPanelRealizarCambioDeTurno().getBtnVolverRc()
				.setActionCommand("volver de realizar cambio de turno a menu principal");

		vf.getPrincipal().getPanelRealizarCambioDeTurno().getBtnContinuarRc().addActionListener(this);
		vf.getPrincipal().getPanelRealizarCambioDeTurno().getBtnContinuarRc()
				.setActionCommand("continuar al cambio de turno");

		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnAceptarCambioTurno().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnAceptarCambioTurno()
				.setActionCommand("aceptar cambio turno");

		vf.getPrincipal().getPanelAceptarCambioTurno().getBtnVolverCt().addActionListener(this);
		vf.getPrincipal().getPanelAceptarCambioTurno().getBtnVolverCt()
				.setActionCommand("volver de aceptar cambio de turno a menu principal");

		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnMostrarCitasProgramadas().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnMostrarCitasProgramadas()
				.setActionCommand("mostrar citas programadas");

		vf.getPrincipal().getPanelMostrarCitasProgramadas().getBtnVolverMc().addActionListener(this);
		vf.getPrincipal().getPanelMostrarCitasProgramadas().getBtnVolverMc()
				.setActionCommand("volver de mostrar citas asignadas a menu principal especialista");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarCitas().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarCitas()
				.setActionCommand("mostrar citas y examenes programados paciente");

		vf.getPrincipal().getPanelMostrarCitasYExamenesP().getBtnVolverME().addActionListener(this);
		vf.getPrincipal().getPanelMostrarCitasYExamenesP().getBtnVolverME()
				.setActionCommand("volver de mostrar citas y examenes asignados a menu principal paciente");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarTratamiento().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarTratamiento()
				.setActionCommand("mostrar tratamiento paciente");

		vf.getPrincipal().getPanelMostrarTratamientoGeneradoP().getBtnVolverTP().addActionListener(this);
		vf.getPrincipal().getPanelMostrarTratamientoGeneradoP().getBtnVolverTP()
				.setActionCommand("volver de mostrar tratamiento a menu principal paciente");

		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarResultados().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnMostrarResultados()
				.setActionCommand("mostrar resultados paciente");

		vf.getPrincipal().getPanelMostrarResultadosExamenesP().getBtnVolverRE().addActionListener(this);
		vf.getPrincipal().getPanelMostrarResultadosExamenesP().getBtnVolverRE()
				.setActionCommand("volver de mostrar resultados examenes a menu principal paciente");

		vf.getPrincipal().getPanelCambioDeTurnoEspecialista().getBtnVolverRt().addActionListener(this);
		vf.getPrincipal().getPanelCambioDeTurnoEspecialista().getBtnVolverRt()
				.setActionCommand("volver de realizar cambio de turno 2 a cambio turno 1");

		vf.getPrincipal().getPanelInicioSesionDirectorMedico().getBtnVolverD().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionDirectorMedico().getBtnVolverD()
				.setActionCommand("INICIAR SESION");

		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnVolverDE().addActionListener(this);
		vf.getPrincipal().getPanelMenuDirectorMedico().getBtnVolverDE()
				.setActionCommand("volver al menu principal desde director medico");

		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnVolverDM().addActionListener(this);
		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnVolverDM()
				.setActionCommand("REGISTRAR");

		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnRegistrarDM().addActionListener(this);
		vf.getPrincipal().getPanelRegistroDirectorMedico().getBtnRegistrarDM()
				.setActionCommand("menu principal de director medico");

		vf.getPrincipal().getPanelInicioSesionDirectorMedico().getBtnIniciarSesionD().addActionListener(this);
		vf.getPrincipal().getPanelInicioSesionDirectorMedico().getBtnIniciarSesionD()
				.setActionCommand("menu principal de director medico");

		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnVolverDME().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnVolverDME()
				.setActionCommand("volver al menu desde menu principal director medico");

		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnConfirmarCambioTurno().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnConfirmarCambioTurno()
				.setActionCommand("confirmar cambio turno");

		vf.getPrincipal().getPanelConfirmarCambioTurnoDirector().getBtnVolverCtt().addActionListener(this);
		vf.getPrincipal().getPanelConfirmarCambioTurnoDirector().getBtnVolverCtt()
				.setActionCommand("volver de confirmar cambio turno a menu principal director");

		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnMostrarReporteSemanal().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnMostrarReporteSemanal()
				.setActionCommand("mostrar reporte semanal director");

		vf.getPrincipal().getPanelMostrarReporteSemanalDirector().getBtnVolverMsd().addActionListener(this);
		vf.getPrincipal().getPanelMostrarReporteSemanalDirector().getBtnVolverMsd()
				.setActionCommand("volver de mostrar reporte semanal a menu principal director");

		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnMostrarReporteMensual().addActionListener(this);
		vf.getPrincipal().getPanelMenuPrincipalDirectorMedico().getBtnMostrarReporteMensual()
				.setActionCommand("mostrar reporte mensual director");

		vf.getPrincipal().getPanelMostrarReporteMensualDirector().getBtnVolverRmd().addActionListener(this);
		vf.getPrincipal().getPanelMostrarReporteMensualDirector().getBtnVolverRmd()
				.setActionCommand("volver de mostrar reporte mensual a menu principal director");

		vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnContinuar().addActionListener(this);
		vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnContinuar()
				.setActionCommand("continuar a reprogramar cita paciente");

		vf.getPrincipal().getPanelContinuarReprogramarCitaPaciente().getBtnVolverCrp().addActionListener(this);
		vf.getPrincipal().getPanelContinuarReprogramarCitaPaciente().getBtnVolverCrp()
				.setActionCommand("volver de reprogramar cita 2 a reprogramar cita 1");

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
		vf.getPrincipal().getPanelRegistroEspecialista().getJcbTipoEspecialidad().setVisible(true);

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
		case "Director Medico":
			vf.getPrincipal().setTitle("MENU DIRECTOR");

			vf.getPrincipal().getPanelMenuDirectorMedico().getImagenMenuD().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuDirectorMedico();

			directorMedico = true;

			break;
		case "REGISTRARSE":
			if (paciente == true) {
				vf.getPrincipal().setTitle("REGISTRAR PACIENTE");

				vf.getPrincipal().getPanelRegistroPaciente().getNombre().setVisible(true);
				vf.getPrincipal().getPanelRegistroPaciente().getNumeroDocumento().setVisible(true);
				vf.getPrincipal().getPanelRegistroPaciente().getCorreo().setVisible(true);
				vf.getPrincipal().getPanelRegistroPaciente().getContraseña().setVisible(true);
				vf.getPrincipal().getPanelRegistroPaciente().getJcbGenero().setVisible(true);
				

				vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(true);

				vf.getPrincipal().mostrarPanelRegistroPaciente();

				registroP = true;
				vf.getPrincipal().getPanelRegistroPaciente().getNombre().setText("");
	            vf.getPrincipal().getPanelRegistroPaciente().getCorreo().setText("");
	            vf.getPrincipal().getPanelRegistroPaciente().getNumeroDocumento().setText("");
	            vf.getPrincipal().getPanelRegistroPaciente().getContraseña().setText("");
	            vf.getPrincipal().getPanelRegistroPaciente().getJcbGenero().setSelectedIndex(-1); 

			}
			if (especialista == true) {
				vf.getPrincipal().setTitle("REGISTRAR ESPECIALISTA");

				vf.getPrincipal().getPanelRegistroEspecialista().getNombre().setVisible(true);
				vf.getPrincipal().getPanelRegistroEspecialista().getNumeroDocumento().setVisible(true);
				vf.getPrincipal().getPanelRegistroEspecialista().getCorreo().setVisible(true);
				vf.getPrincipal().getPanelRegistroEspecialista().getContraseña().setVisible(true);
				vf.getPrincipal().getPanelRegistroEspecialista().getJcbTipoEspecialidad().setVisible(true);

				vf.getPrincipal().getPanelRegistroEspecialista().getImagenRegistroE().setVisible(true);

				vf.getPrincipal().mostrarPanelRegistroEspecialista();

				registroE = true;
			}
			if (directorMedico == true) {
				vf.getPrincipal().setTitle("REGISTRAR DIRECTOR MEDICO");

				vf.getPrincipal().getPanelRegistroDirectorMedico().getNombreD().setVisible(true);
				vf.getPrincipal().getPanelRegistroDirectorMedico().getNumeroDocumentoD().setVisible(true);
				vf.getPrincipal().getPanelRegistroDirectorMedico().getCorreoD().setVisible(true);
				vf.getPrincipal().getPanelRegistroDirectorMedico().getContraseñaD().setVisible(true);

				vf.getPrincipal().getPanelRegistroDirectorMedico().getImagenRegistroDM().setVisible(true);

				vf.getPrincipal().mostrarPanelRegistroDirectorMedico();

				registroD = true;
			}
			break;
		case "INICIAR SESION":
			if (paciente == true) {
				vf.getPrincipal().setTitle("INICIAR SESION PACIENTE");

				vf.getPrincipal().getPanelInicioSesionP().getNumeroDocumento().setVisible(true);
				vf.getPrincipal().getPanelInicioSesionP().getContraseña().setVisible(true);

				vf.getPrincipal().getPanelInicioSesionP().getImagenInicioSesionP().setVisible(true);

				vf.getPrincipal().mostrarPanelInicioSesionPaciente();

				inicioSesionP = true;
			}
			if (especialista == true) {
				vf.getPrincipal().setTitle("INICIAR SESION ESPECIALISTA");

				vf.getPrincipal().getPanelInicioSesionE().getNumeroDocumento().setVisible(true);
				vf.getPrincipal().getPanelInicioSesionE().getContraseña().setVisible(true);

				vf.getPrincipal().getPanelInicioSesionE().getImagenInicioSesionE().setVisible(true);

				vf.getPrincipal().mostrarPanelInicioSesionEspecialista();

				inicioSesionE = true;
			}
			if (directorMedico == true) {
				vf.getPrincipal().setTitle("INICIAR SESION DIRECTOR");

				vf.getPrincipal().getPanelInicioSesionDirectorMedico().getNumeroDocumentoD().setVisible(true);
				vf.getPrincipal().getPanelInicioSesionDirectorMedico().getContraseñaD().setVisible(true);

				vf.getPrincipal().getPanelInicioSesionDirectorMedico().getImagenInicioSesionD().setVisible(true);

				vf.getPrincipal().mostrarPanelInicioSesionDirectorMedico();

				inicioSesionD = true;
			}
			break;
		
		case "REGISTRAR":
		
			try {
			if(paciente==true) {
				
				String nombre = vf.getPrincipal().getPanelRegistroPaciente().getNombre().getText();
				ExceptionChecker.checkName(nombre);
				String correo = vf.getPrincipal().getPanelRegistroPaciente().getCorreo().getText();
				ExceptionChecker.checkEmail(correo);
				String cedula1 = vf.getPrincipal().getPanelRegistroPaciente().getNumeroDocumento().getText();
				
				String contrasena1 = vf.getPrincipal().getPanelRegistroPaciente().getContraseña().getText();
				String genero = (String) vf.getPrincipal().getPanelRegistroPaciente().getJcbGenero().getSelectedItem();
				int contrasena =Integer.parseInt(contrasena1); 
				ExceptionChecker.checkNegativeNumber(contrasena);
				int cedula = Integer.parseInt(cedula1);
				ExceptionChecker.checkNegativeNumber(cedula);
				
				if(nombre.isEmpty() || correo.isEmpty() || cedula1.isEmpty() || contrasena1.isEmpty() || genero == null) {
					 vf.getCon().mostrarMensajeEmergente("Todos los campos son obligatorios.");
				        return;
				}
				
				mf.getPdao().add(new PacienteDTO(nombre, cedula,  correo, contrasena, genero));
				vf.getCon().mostrarMensajeEmergente("registrado exitsamente");

				

			}
			
			if(especialista==true) {
				System.out.println("hola");
				String nombre1 = vf.getPrincipal().getPanelRegistroEspecialista().getNombre().getText();
				ExceptionChecker.checkName(nombre1);
				String correo2 = vf.getPrincipal().getPanelRegistroEspecialista().getCorreo().getText();
				ExceptionChecker.checkEmail(correo2);
				String cedula2 = vf.getPrincipal().getPanelRegistroEspecialista().getNumeroDocumento().getText();
				System.out.println("exception checker");
				String contrasena2 = vf.getPrincipal().getPanelRegistroEspecialista().getContraseña().getText();
				String tipoEspecialista = (String) vf.getPrincipal().getPanelRegistroEspecialista().getJcbTipoEspecialidad().getSelectedItem();
				int contrasena3 =Integer.parseInt(contrasena2); 
				ExceptionChecker.checkNegativeNumber(contrasena3);
				int cedula3 = Integer.parseInt(cedula2);
				ExceptionChecker.checkNegativeNumber(cedula3);
				
				if(nombre1.isEmpty() || correo2.isEmpty() || cedula2.isEmpty() || contrasena2.isEmpty() || tipoEspecialista == null) {
					 vf.getCon().mostrarMensajeEmergente("Todos los campos son obligatorios.");
				        return;
				}
				mf.getEdao().add(new EspecialistaDTO(nombre1, cedula3, correo2, contrasena3, tipoEspecialista));
					vf.getCon().mostrarMensajeEmergente("se ha registrado exitosamente");
					

			
			}
			}catch(NameNotValidException e4) {
				vf.getCon().mostrarAlerta(e4.getMessage());
			}catch(InvalidEmailException e5) {
				vf.getCon().mostrarAlerta(e5.getMessage());
			}catch(NegativeNumberInvalidException e6) {
				vf.getCon().mostrarAlerta(e6.getMessage());
			}
	
			break;

		case "INICIARSESION":
			try {
		        if (paciente) {
		           
		            String documentoIngresado = vf.getPrincipal().getPanelInicioSesionP().getNumeroDocumento().getText();
		            int documentoInt = Integer.parseInt(documentoIngresado); 

		            String contrasenaIngresada = vf.getPrincipal().getPanelInicioSesionP().getContraseña().getText();
		            int contrasenaInt = Integer.parseInt(contrasenaIngresada); 
		            
		            if (mf.getPdao().authenticatePatient(documentoInt, contrasenaInt)) {
		                vf.getCon().mostrarMensajeEmergente("Inicio de sesión exitoso");
		                vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();
		                paciente = true; 
		            } else {
		                vf.getCon().mostrarMensajeEmergente("Documento o contraseña incorrectos");
		            }
		        }
		    }  catch (NumberFormatException e1) {
		    	vf.getCon().mostrarAlerta(e1.getMessage());
		    }
		    break;
			
		
	
		case "agendar cita paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
			vf.getPrincipal().getPanelAgendarCitaPaciente().getImagenAgendarCitaP().setVisible(true);
			vf.getPrincipal().getPanelAgendarCitaPaciente().getJcbtipoEspecialista().setVisible(true);
			vf.getPrincipal().getPanelAgendarCitaPaciente().getJcbHora().setVisible(true);
			vf.getPrincipal().getPanelAgendarCitaPaciente().getFechaCita().setVisible(true);
			vf.getPrincipal().getPanelAgendarCitaPaciente().getBtnAgregarCita().setVisible(true);

			vf.getPrincipal().mostrarPanelAgendarCitaPaciente();

			menuPpalP = false;
			agendarCitaP = true;

			break;
		case "agregar cita":
		    vf.getPrincipal().getPanelAgendarCitaPaciente().getImagenAgendarCitaP().setVisible(true);

		    // Obtener la fecha seleccionada
		    java.util.Date fechaSeleccionada = vf.getPrincipal().getPanelAgendarCitaPaciente().getFechaCita().getDate();
		    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
		    String fecha = formatoFecha.format(fechaSeleccionada);

		    // Obtener la hora y el tipo de especialista
		    String hora = (String) vf.getPrincipal().getPanelAgendarCitaPaciente().getJcbHora().getSelectedItem();
		    String tipoEspecialista = (String) vf.getPrincipal().getPanelAgendarCitaPaciente().getJcbtipoEspecialista().getSelectedItem();

		    // Verificar si todos los campos están completos
		    if (tipoEspecialista == null || fechaSeleccionada == null || hora == null) {
		        vf.getCon().mostrarMensajeEmergente("Todos los campos son obligatorios.");
		        return;
		    }

		    // Crear nueva cita con constructor sin ID
		    CitaDTO nuevaCita = new CitaDTO(fechaSeleccionada, hora, tipoEspecialista);
		    int idGenerado = mf.getCdao().generateNewId(); // Obtener nuevo ID
		    nuevaCita.setId(idGenerado);

		    if (mf.getCdao().add(nuevaCita)) {
		        vf.getCon().mostrarMensajeEmergente("Cita agendada con éxito. ID de la cita: " + idGenerado);

		        // Enviar correo de confirmación
		        String emailDestino = "emmanuelpinzon16@gmail.com"; 
		        String asunto = "Confirmación de Cita Médica";
		        String contenido = "Estimado paciente, su cita ha sido agendada exitosamente.\n\n" +
		                           "Detalles de la cita:\n" +
		                           "Fecha: " + fecha + "\n" +
		                           "Hora: " + hora + "\n" +
		                           "Especialista: " + tipoEspecialista + "\n\n" +
		                           "Gracias por confiar en nosotros.";

		        MailController mailController = new MailController();
		        mailController.programarRecordatorio(emailDestino, asunto, contenido, 0);
		    } else {
		        vf.getCon().mostrarMensajeEmergente("No se pudo agendar la cita");
		    }
		    break;

		case "cancelar cita paciente":
			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
			vf.getPrincipal().getPanelCancelarCitaPaciente().getImagenCancelarCitaP().setVisible(true);

			vf.getPrincipal().mostrarPanelCancelarCitaPaciente();

			menuPpalP = false;
			cancelarCitaP = true;
			break;
			
		case "CANCELARCITA":
			
			// Mostrar todas las citas disponibles con sus detalles antes de pedir el ID
			ArrayList<CitaDTO> todasLasCitas = mf.getCdao().getAll();
			if (todasLasCitas.isEmpty()) {
			    vf.getCon().mostrarAlerta("No hay citas disponibles para cancelar.");
			    break;
			}

			// Mostrar las citas disponibles
			StringBuilder citasDisponibles = new StringBuilder("Citas disponibles para cancelar:\n");
			for (CitaDTO cita : todasLasCitas) {
			    citasDisponibles.append("ID: ").append(cita.getId())
			                    .append(" | Fecha: ").append(cita.getFecha())
			                    .append(" | Hora: ").append(cita.getHora())
			                    .append(" | Especialista: ").append(cita.getTipoEspecialista())
			                    .append("\n");
			}
			vf.getCon().mostrarMensajeEmergente(citasDisponibles.toString());

			// Solicitar el ID de la cita a cancelar
			String idStr = vf.getCon().leerInputEliminar("Ingrese el ID de la cita a cancelar:");

			if (idStr == null || idStr.trim().isEmpty()) {
			    vf.getCon().mostrarError("Debe ingresar un ID válido");
			    break;
			}

			try {
			    int idCita = Integer.parseInt(idStr);
			    CitaDTO citaAEliminar = null;

			    for(CitaDTO cita : todasLasCitas) {
			        if(cita.getId() == idCita) {
			            citaAEliminar = cita;
			            break;
			        }
			    }

			    if(citaAEliminar != null) {
			        // Mostrar mensaje de confirmación con los detalles de la cita seleccionada
			        int confirmar = JOptionPane.showConfirmDialog(null, 
			            "¿Está seguro que desea cancelar esta cita?\n" +
			            "ID: " + citaAEliminar.getId() + "\n" +
			            "Fecha: " + citaAEliminar.getFecha() + "\n" +
			            "Hora: " + citaAEliminar.getHora() + "\n" +
			            "Especialista: " + citaAEliminar.getTipoEspecialista(),
			            "Confirmar cancelación",
			            JOptionPane.YES_NO_OPTION,
			            JOptionPane.WARNING_MESSAGE);

			        if(confirmar == JOptionPane.YES_OPTION) {
			            if(mf.getCdao().delete(citaAEliminar)) {
			                vf.getCon().mostrarMensajeEmergente("La cita ha sido cancelada exitosamente");
			            } else {
			                vf.getCon().mostrarError("Hubo un error al intentar cancelar la cita");
			            }
			        }
			    } else {
			        vf.getCon().mostrarAlerta("No se encontró ninguna cita con el ID: " + idCita);
			    }

			} catch(NumberFormatException e1) {
			    vf.getCon().mostrarError("El ID debe ser un número entero válido");
			}

		    break;
		case "mostrar citas y examenes programados paciente":
			
			vf.getCon().mostrarMensajeEmergenteConScroll(mf.getCdao().ShowAll());

			break;
		
		case "volver al menu paciente desde registro":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(false);
			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPaciente();

			registroP = false;
			menuP = true;

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
		case "volver de agendar cita paciente a menu principal paciente":

			vf.getPrincipal().setTitle("MENU PRINCIPAL");

			vf.getPrincipal().getPanelAgendarCitaPaciente().getImagenAgendarCitaP().setVisible(false);
			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);

			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();

			agendarCitaP = false;
			menuPpalP = true;

			break;
			
		}
}}
