package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.model.PacienteDTO;



public class PacienteDAO implements CRUDOperation<PacienteDTO, Paciente> {
	 private ArrayList<Paciente> listaPacientes;
	    private final String FILE_NAME = "paciente.csv";
	    private final String SERIAL_NAME = "paciente.dat";

	 
	    public  PacienteDAO() {
	        FileHandler.checkFolder();
	        readSerialized();
		}

	    public Paciente authenticatePatient(int cedula, int contrasena) {
	        readSerialized(); // Carga la lista de pacientes desde el archivo serializado
	        for (Paciente paciente : listaPacientes) {
	            if (paciente.getCedula() == cedula && paciente.getContraseña() == contrasena) {
	                return paciente; // Devuelve el paciente autenticado
	            }
	        }
	        return null; // Retorna null si no encuentra al paciente
	    }


	    
	    @Override
	    public String ShowAll() {
	        String rta = "";
	        if (listaPacientes.isEmpty()) {
	            return "No hay pacientes en la lista.";
	        } else {
	            for (Paciente paciente : listaPacientes) {
	                rta += paciente;
	            }
	            return rta;
	        }
	    }

	    @Override
	    public String ShowAllNames() {
	        if (listaPacientes.isEmpty()) {
	            return "No hay pacientes en la lista.";
	        }

	        String rta = "";
	        for (Paciente paciente : listaPacientes) {
	            rta += paciente.getNombre() + "\n"; // Solo agrega el nombre
	        }
	        return rta;
	    }

	    @Override
	    public ArrayList<PacienteDTO> getAll() {
	        return DataMapper.listaPacienteToPacienteDTO(listaPacientes);
	    }

	    @Override
	    public boolean add(PacienteDTO newData) {
	        if (find(DataMapper.PacienteDTOToPaciente(newData)) == null) {
	            listaPacientes.add(DataMapper.PacienteDTOToPaciente(newData));
	            writeFile();
	            writeSerialized();
	            return true;
	        } else {
	            return false;
	        }
	    }

	    @Override
	    public boolean delete(PacienteDTO toDelete) {
	        Paciente found = find(DataMapper.PacienteDTOToPaciente(toDelete));
	        if (found != null) {
	            listaPacientes.remove(found);
	            writeFile();
	            writeSerialized();
	            return true;
	        } else {
	            return false;
	        }
	    }



	    @Override
	    public Paciente find(Paciente toFind) {
	        Paciente found = null;
	        if (!listaPacientes.isEmpty()) {
	            for (Paciente paciente : listaPacientes) {
	                if (paciente.getNombre().toLowerCase().equals(toFind.getNombre().toLowerCase())) {
	                    found = paciente;
	                    return found;
	                }
	            }
	        }
	        return null;
	    }

	    @Override
	    public boolean update(PacienteDTO previous, PacienteDTO newData) {
	        Paciente found = find(DataMapper.PacienteDTOToPaciente(previous));
	        if (found != null) {
	            listaPacientes.remove(found);
	            listaPacientes.add(DataMapper.PacienteDTOToPaciente(newData));
	            writeFile();
	            writeSerialized();
	            return true;
	        } else {
	            return false;
	        }
	    }

	    /**
	     * Escribe el contenido de la lista de panes dulces en un archivo CSV.
	     */
	    public void writeFile() {
	        String content = "";
	        for (Paciente paciente: listaPacientes) {
	            content += paciente.getNombre() + "; ";
	            content += paciente.getCedula() + "; ";
	            content += paciente.getCorreo() + "; ";
	            content += paciente.getContraseña() + "; ";
	            content += paciente.getGenero() ;
	            content += "\n";
	        }
	        FileHandler.writeFile(FILE_NAME, content);
	    }


	    public void writeSerialized() {
	        FileHandler.writeSerialized(SERIAL_NAME, listaPacientes);
	    }


	    public void readSerialized() {
	        Object content = FileHandler.readSerialized(SERIAL_NAME);
	        if (content == null) {
	            listaPacientes = new ArrayList<>();
	        } else {
	            listaPacientes = (ArrayList<Paciente>) content;
	        }
	    }
}
