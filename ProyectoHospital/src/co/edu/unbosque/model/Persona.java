package co.edu.unbosque.model;

import java.io.Serializable;

public abstract class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int cedula;
	private String correo;
	private int contraseña;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, int cedula, String correo, int contraseña) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getContraseña() {
		return contraseña;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", contraseña=" + contraseña
				+ "]";
	}
	
}
