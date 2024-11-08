package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CitaDAO;
import co.edu.unbosque.model.persistence.EspecialistaDAO;
import co.edu.unbosque.model.persistence.PacienteDAO;

public class ModelFacade {

	private PacienteDAO pdao;
	private EspecialistaDAO edao;
	private CitaDAO cdao;
	
	public ModelFacade() {
		pdao= new PacienteDAO();
		edao= new EspecialistaDAO();
		cdao = new CitaDAO();
	}

	public PacienteDAO getPdao() {
		return pdao;
	}

	public void setPdao(PacienteDAO pdao) {
		this.pdao = pdao;
	}

	public EspecialistaDAO getEdao() {
		return edao;
	}

	public void setEdao(EspecialistaDAO edao) {
		this.edao = edao;
	}

	public CitaDAO getCdao() {
		return cdao;
	}

	public void setCdao(CitaDAO cdao) {
		this.cdao = cdao;
	}
	
}
