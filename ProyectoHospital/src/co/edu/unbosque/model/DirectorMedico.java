package co.edu.unbosque.model;

import java.io.Serializable;

public class DirectorMedico extends Persona implements Serializable{

	public DirectorMedico() {
		// TODO Auto-generated constructor stub
	}

	public DirectorMedico(String nombre, int cedula, String correo, int contraseña) {
		super(nombre, cedula, correo, contraseña);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
