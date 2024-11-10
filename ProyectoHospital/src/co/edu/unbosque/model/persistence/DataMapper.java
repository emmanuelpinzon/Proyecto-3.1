package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Cita;
import co.edu.unbosque.model.CitaDTO;
import co.edu.unbosque.model.DirectorMedico;
import co.edu.unbosque.model.DirectorMedicoDTO;
import co.edu.unbosque.model.Especialista;
import co.edu.unbosque.model.EspecialistaDTO;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.model.PacienteDTO;


public class DataMapper {// revisar la estructura de un objeto de una clase. convierte DTO a entidad y
							// viceversa
public static Paciente PacienteDTOToPaciente(PacienteDTO dto) {
	Paciente entity;
	entity= new Paciente(dto.getNombre(),dto.getCedula(),dto.getCorreo(),dto.getContraseña(),dto.getGenero());
	return entity;
}
public static PacienteDTO PacienteToPacienteDTO(Paciente entity) {
	PacienteDTO  dto;
	dto= new PacienteDTO(entity.getNombre(),entity.getCedula(),entity.getCorreo(),entity.getContraseña(),entity.getGenero());
	return dto;
}
public static ArrayList<PacienteDTO> listaPacienteToPacienteDTO(ArrayList<Paciente>listaEntity){
	ArrayList<PacienteDTO>dtoList = new ArrayList<>();
	for (Paciente p : listaEntity) {
		dtoList.add(new PacienteDTO(p.getNombre(),p.getCedula(),p.getCorreo(),p.getContraseña(),p.getGenero()));
		
	}

	return dtoList;
}

public static ArrayList<Paciente>listaPacienteDTOToPaciente(ArrayList<PacienteDTO>dtoList){
	ArrayList<Paciente>entityList = new ArrayList<>();
	for (PacienteDTO pd : dtoList) {
		entityList.add(new Paciente(pd.getNombre(), pd.getCedula(),pd.getCorreo(),pd.getContraseña(),pd.getGenero()));
	}
	return entityList;
}
public static Especialista EspecialistaDTOToEspecialista(EspecialistaDTO dto) {
	Especialista entity;
	entity= new Especialista(dto.getNombre(),dto.getCedula(),dto.getCorreo(),dto.getContraseña(),dto.getTipoEspecialista());
	return entity;
}
public static EspecialistaDTO EspecialistaToEspecialistaDTO(Especialista entity) {
	EspecialistaDTO  dto;
	dto= new EspecialistaDTO(entity.getNombre(),entity.getCedula(),entity.getCorreo(),entity.getContraseña(),entity.getTipoEspecialista());
	return dto;
}
public static ArrayList<EspecialistaDTO> listaEspecialistaToEspecialistaDTO(ArrayList<Especialista>listaEntity){
	ArrayList<EspecialistaDTO>dtoList = new ArrayList<>();
	for (Especialista e : listaEntity) {
		dtoList.add(new EspecialistaDTO(e.getNombre(),e.getCedula(),e.getCorreo(),e.getContraseña(),e.getTipoEspecialista()));
		
	}
	
	return dtoList;
}

public static ArrayList<Especialista>listaEspecialistaDTOToEspecialista(ArrayList<EspecialistaDTO>dtoList){
	ArrayList<Especialista>entityList = new ArrayList<>();
	for (EspecialistaDTO ed : dtoList) {
		entityList.add(new Especialista(ed.getNombre(), ed.getCedula(),ed.getCorreo(),ed.getContraseña(),ed.getTipoEspecialista()));
	}
	return entityList;
}
public static Cita CitaDTOToCita(CitaDTO dto) {
	Cita entity;
	entity= new Cita(dto.getFecha(), dto.getHora(), dto.getTipoEspecialista());
	 entity.setId(dto.getId());
	return entity;
}
public static CitaDTO CitaToCitaDTO(Cita entity) {
	CitaDTO  dto;
	dto= new CitaDTO(entity.getFecha(), entity.getHora(), entity.getTipoEspecialista());
	dto.setId(entity.getId());
	return dto;
}
public static ArrayList<CitaDTO> listaCitaToCitaDTO(ArrayList<Cita>listaEntity){
	ArrayList<CitaDTO>dtoList = new ArrayList<>();
	for (Cita c : listaEntity) {
		dtoList.add(new CitaDTO(c.getFecha(),c.getHora(),c.getTipoEspecialista()));
		
	}

	return dtoList;
}

public static ArrayList<Cita>listaCitaDTOToCita(ArrayList<CitaDTO>dtoList){
	ArrayList<Cita>entityList = new ArrayList<>();
	for (CitaDTO cd : dtoList) {
		entityList.add(new Cita(cd.getFecha(),cd.getHora(),cd.getTipoEspecialista()));
	}
	return entityList;
}
public static DirectorMedico DirectorMedicoDTOToDirectorMedico(DirectorMedicoDTO dto) {
	DirectorMedico entity;
    entity = new DirectorMedico(dto.getNombre(), dto.getCedula(), dto.getCorreo(), dto.getContraseña());
    return entity;
}

public static DirectorMedicoDTO DirectorMedicoToDirectorMedicoDTO(DirectorMedico entity) {
	DirectorMedicoDTO dto;
    dto = new DirectorMedicoDTO(entity.getNombre(), entity.getCedula(), entity.getCorreo(), entity.getContraseña());
    return dto;
}

public static ArrayList<DirectorMedicoDTO> listaDirectorMedicoToDirectorMedicoDTO(ArrayList<DirectorMedico> listaEntity) {
    ArrayList<DirectorMedicoDTO> dtoList = new ArrayList<>();
    for (DirectorMedico d : listaEntity) {
        dtoList.add(new DirectorMedicoDTO(d.getNombre(), d.getCedula(), d.getCorreo(), d.getContraseña()));
    }
    return dtoList;
}

public static ArrayList<DirectorMedico> listaDirectorMedicoDTOToDirectorMedico(ArrayList<DirectorMedicoDTO> dtoList) {
    ArrayList<DirectorMedico> entityList = new ArrayList<>();
    for (DirectorMedicoDTO dd : dtoList) {
        entityList.add(new DirectorMedico(dd.getNombre(), dd.getCedula(), dd.getCorreo(), dd.getContraseña()));
    }
    return entityList;
}

}
