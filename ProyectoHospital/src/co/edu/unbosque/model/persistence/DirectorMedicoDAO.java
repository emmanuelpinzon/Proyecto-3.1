package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.DirectorMedico;
import co.edu.unbosque.model.DirectorMedicoDTO;

public class DirectorMedicoDAO implements CRUDOperation<DirectorMedicoDTO, DirectorMedico>{

	private ArrayList<DirectorMedico> listaDirectores;
    private final String FILE_NAME = "directormedico.csv";
    private final String SERIAL_NAME = "directormedico.dat";

    public DirectorMedicoDAO() {
        FileHandler.checkFolder();
        readSerialized();
    }
    
    public boolean authenticatedirectorMedico(int cedula, int contrasena) {
        for (DirectorMedico director : listaDirectores) {
            if (director.getCedula() == cedula && director.getContraseña() == contrasena) {
                return true;
            }
        }
        return false;
    }
    
	
	@Override
	public String ShowAll() {
		 String rta = "";
	        if (listaDirectores.isEmpty()) {
	            return "No hay directores médicos en la lista.";
	        } else {
	            for (DirectorMedico director : listaDirectores) {
	                rta += director;
	            }
	            return rta;
	        }
	}

	@Override
	public String ShowAllNames() {
		if (listaDirectores.isEmpty()) {
            return "No hay directores médicos en la lista.";
        }

        String rta = "";
        for (DirectorMedico director : listaDirectores) {
            rta += director.getNombre() + "\n";
        }
        return rta;
	}

	@Override
	public ArrayList<DirectorMedicoDTO> getAll() {
		return DataMapper.listaDirectorMedicoToDirectorMedicoDTO(listaDirectores);
	}

	@Override
	public boolean add(DirectorMedicoDTO newData) {
		 if (find(DataMapper.DirectorMedicoDTOToDirectorMedico(newData)) == null) {
	            listaDirectores.add(DataMapper.DirectorMedicoDTOToDirectorMedico(newData));
	            writeFile();
	            writeSerialized();
	            return true;
	        } else {
	            return false;
	        }
	}

	@Override
	public boolean delete(DirectorMedicoDTO toDelete) {
		DirectorMedico found = find(DataMapper.DirectorMedicoDTOToDirectorMedico(toDelete));
        if (found != null) {
            listaDirectores.remove(found);
            writeFile();
            writeSerialized();
            return true;
        } else {
            return false;
        }
	}

	@Override
	public DirectorMedico find(DirectorMedico toFind) {
		DirectorMedico found = null;
	        if (!listaDirectores.isEmpty()) {
	            for (DirectorMedico director : listaDirectores) {
	                if (director.getNombre().equalsIgnoreCase(toFind.getNombre())) {
	                    found = director;
	                    return found;
	                }
	            }
	        }
	        return null;
	}

	@Override
	public boolean update(DirectorMedicoDTO previous, DirectorMedicoDTO newData) {
		DirectorMedico found = find(DataMapper.DirectorMedicoDTOToDirectorMedico(previous));
        if (found != null) {
            listaDirectores.remove(found);
            listaDirectores.add(DataMapper.DirectorMedicoDTOToDirectorMedico(newData));
            writeFile();
            writeSerialized();
            return true;
        } else {
            return false;
        }
	}
	
	public void writeFile() {
        String content = "";
        for (DirectorMedico director : listaDirectores) {
            content += director.getNombre() + "; ";
            content += director.getCedula() + "; ";
            content += director.getCorreo() + "; ";
            content += director.getContraseña() + "; ";
            content += "\n";
        }
        FileHandler.writeFile(FILE_NAME, content);
    }

    public void writeSerialized() {
        FileHandler.writeSerialized(SERIAL_NAME, listaDirectores);
    }

    public void readSerialized() {
        Object content = FileHandler.readSerialized(SERIAL_NAME);
        if (content == null) {
            listaDirectores = new ArrayList<>();
        } else {
            listaDirectores = (ArrayList<DirectorMedico>) content;
        }
    }

}
