package co.edu.unbosque.model;

import java.io.Serializable;

public class Paciente extends Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String genero;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public Paciente(String genero) {
		super();
		this.genero = genero;
	}

	public Paciente(String nombre, int cedula, String correo, int contraseña, String genero) {
		super(nombre, cedula, correo, contraseña);
		this.genero = genero;
	}

	public Paciente(String nombre, int cedula, String correo, int contraseña) {
		super(nombre, cedula, correo, contraseña);
		// TODO Auto-generated constructor stub
	}

	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return super.toString()+"\n genero: " + genero + "\n";
	}
	






}
