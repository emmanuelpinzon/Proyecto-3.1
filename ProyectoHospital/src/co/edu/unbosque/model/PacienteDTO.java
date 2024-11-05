package co.edu.unbosque.model;

public class PacienteDTO extends PersonaDTO{
private String genero;

public PacienteDTO() {
	// TODO Auto-generated constructor stub
}

public PacienteDTO(String genero) {
	super();
	this.genero = genero;
}

public PacienteDTO(String nombre, int cedula, String correo, int contraseña, String genero) {
	super(nombre, cedula, correo, contraseña);
	this.genero = genero;
}

public PacienteDTO(String nombre, int cedula, String correo, int contraseña) {
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
