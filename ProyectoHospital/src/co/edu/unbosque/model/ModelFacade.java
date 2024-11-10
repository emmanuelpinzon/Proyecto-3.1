package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CitaDAO;
import co.edu.unbosque.model.persistence.DirectorMedicoDAO;
import co.edu.unbosque.model.persistence.EspecialistaDAO;
import co.edu.unbosque.model.persistence.PacienteDAO;

public class ModelFacade {

	private PacienteDAO pdao;
	private EspecialistaDAO edao;
	private CitaDAO cdao;
	private DirectorMedicoDAO dmdao;
	
	public ModelFacade() {
		pdao= new PacienteDAO();
		edao= new EspecialistaDAO();
		cdao = new CitaDAO();
		dmdao= new DirectorMedicoDAO();
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

	public DirectorMedicoDAO getDmdao() {
		return dmdao;
	}

	public void setDmdao(DirectorMedicoDAO dmdao) {
		this.dmdao = dmdao;
	}
	
	
}
