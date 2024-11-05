package co.edu.unbosque.model;

public class PersonaDTO {
	private String nombre;
	private int cedula;
	private String correo;
	private int contraseña;
	
	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonaDTO(String nombre, int cedula, String correo, int contraseña) {
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
		return "\n nombre: " + nombre + "\n cedula: " + cedula + " correo: " + correo + "\n  contraseña: " + contraseña
				+ "\n";
	}
}
