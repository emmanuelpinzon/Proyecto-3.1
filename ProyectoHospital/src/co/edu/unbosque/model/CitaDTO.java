package co.edu.unbosque.model;

import java.util.Date;

public class CitaDTO {
	private int id;
	private Date fecha;
	private String hora;
	private String tipoEspecialista;

	public CitaDTO() {
		// TODO Auto-generated constructor stub
	}

	public CitaDTO( Date fecha, String hora, String tipoEspecialista) {
		super();

		this.fecha = fecha;
		this.hora = hora;
		this.tipoEspecialista = tipoEspecialista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	    return String.format(
	        "---------------------------\n" +
	        "    Cita: \n" +
	        "---------------------------\n" +
	        "Fecha: %s\n" +
	        "Hora: %s\n" +
	        "Especialista: %s\n" +
	        "---------------------------\n",
	        fecha, hora, tipoEspecialista
	    );
	}

}
