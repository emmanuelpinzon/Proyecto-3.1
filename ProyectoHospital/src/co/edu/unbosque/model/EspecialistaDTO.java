package co.edu.unbosque.model;

public class EspecialistaDTO extends PersonaDTO{
	private String tipoEspecialista;
	
	public EspecialistaDTO() {
		// TODO Auto-generated constructor stub
	}

	public EspecialistaDTO(String tipoEspecialista) {
		super();
		this.tipoEspecialista = tipoEspecialista;
	}

	public EspecialistaDTO(String nombre, int cedula, String correo, int contraseña, String tipoEspecialista) {
		super(nombre, cedula, correo, contraseña);
		this.tipoEspecialista = tipoEspecialista;
	}

	public EspecialistaDTO(String nombre, int cedula, String correo, int contraseña) {
		super(nombre, cedula, correo, contraseña);
		// TODO Auto-generated constructor stub
	}

public String getTipoEspecialista() {
	return tipoEspecialista;
}

public void setTipoEspecialista(String tipoEspecialista) {
	this.tipoEspecialista = tipoEspecialista;
}

@Override
public String toString() {
	return super.toString()+"\n tipoEspecialista: " + tipoEspecialista + "\n ";
}
}
