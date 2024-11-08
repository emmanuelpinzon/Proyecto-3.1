package co.edu.unbosque.model;

import java.util.Date;

public class Cita {
private Date fecha;
private String hora;
private String tipoEspecialista;

public Cita() {
	// TODO Auto-generated constructor stub
}

public Cita(Date fecha, String hora, String tipoEspecialista) {
	super();
	this.fecha = fecha;
	this.hora = hora;
	this.tipoEspecialista = tipoEspecialista;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public String getHora() {
	return hora;
}

public void setHora(String hora) {
	this.hora = hora;
}

public String getTipoEspecialista() {
	return tipoEspecialista;
}

public void setTipoEspecialista(String tipoEspecialista) {
	this.tipoEspecialista = tipoEspecialista;
}

@Override
public String toString() {
	return "\n fecha: " + fecha + " \n hora: " + hora + "\n tipoEspecialista: " + tipoEspecialista + "\n";
}

}
