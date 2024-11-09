package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Cita;
import co.edu.unbosque.model.CitaDTO;

/**
 * Clase DAO para gestionar las citas.
 * 
 * @version 1.0
 */
public class CitaDAO implements CRUDOperation<CitaDTO, Cita> {
    private ArrayList<Cita> listaCitas;
    private final String FILE_NAME = "citas.csv";
    private final String SERIAL_NAME = "citas.dat";

    public CitaDAO() {
        FileHandler.checkFolder();
        readSerialized();
    }

    @Override
    public String ShowAll() {
        String rta = "";
        if (listaCitas.isEmpty()) {
            return "No hay citas en la lista.";
        } else {
            for (Cita cita : listaCitas) {
                rta += cita + "\n";
            }
            return rta;
        }
    }
    public Cita findById(int id) {
        if (!listaCitas.isEmpty()) {
            for (Cita cita : listaCitas) {
                if (cita.getId() == id) {
                    return cita;
                }
            }
        }
        return null;
    }

    public boolean deleteById(int id) {
        Cita found = findById(id);
        if (found != null) {
            listaCitas.remove(found);
            writeFile();
            writeSerialized();
            return true;
        }
        return false;
    }

    @Override
    public String ShowAllNames() {
        if (listaCitas.isEmpty()) {
            return "No hay citas en la lista.";
        }

        String rta = "";
        for (Cita cita : listaCitas) {
            rta += "Cita con " + cita.getTipoEspecialista() + " el " + cita.getFecha() + " a las " + cita.getHora() + "\n";
        }
        return rta;
    }

    @Override
    public ArrayList<CitaDTO> getAll() {
        return DataMapper.listaCitaToCitaDTO(listaCitas);
    }
    public int generateNewId() {
        int maxId = 0;
        for (Cita cita : listaCitas) {
            if (cita.getId() > maxId) {
                maxId = cita.getId();
            }
        }
        return maxId + 1;
    }

    @Override
    public boolean add(CitaDTO newData) {
        Cita newCita = DataMapper.CitaDTOToCita(newData);
        newCita.setId(generateNewId());
        if (find(newCita) == null) {
            listaCitas.add(newCita);
            writeFile();
            writeSerialized();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(CitaDTO toDelete) {
        Cita found = find(DataMapper.CitaDTOToCita(toDelete));
        if (found != null) {
            listaCitas.remove(found);
            writeFile();
            writeSerialized();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Cita find(Cita toFind) {
        Cita found = null;
        if (!listaCitas.isEmpty()) {
            for (Cita cita : listaCitas) {
                if (cita.getFecha().equals(toFind.getFecha()) &&
                    cita.getHora().equals(toFind.getHora()) &&
                    cita.getTipoEspecialista().equalsIgnoreCase(toFind.getTipoEspecialista())) {
                    found = cita;
                    return found;
                }
            }
        }
        return null;
    }

    @Override
    public boolean update(CitaDTO previous, CitaDTO newData) {
        Cita found = find(DataMapper.CitaDTOToCita(previous));
        if (found != null) {
            listaCitas.remove(found);
            listaCitas.add(DataMapper.CitaDTOToCita(newData));
            writeFile();
            writeSerialized();
            return true;
        } else {
            return false;
        }
    }

    public void writeFile() {
        String content = "";
        for (Cita cita : listaCitas) {
        	content += cita.getId() + "; ";
            content += cita.getFecha() + "; ";
            content += cita.getHora() + "; ";
            content += cita.getTipoEspecialista() ;
            content += "\n";
        }
        FileHandler.writeFile(FILE_NAME, content);
    }

    public void writeSerialized() {
        FileHandler.writeSerialized(SERIAL_NAME, listaCitas);
    }

    public void readSerialized() {
        Object content = FileHandler.readSerialized(SERIAL_NAME);
        if (content == null) {
            listaCitas = new ArrayList<>();
        } else {
            listaCitas = (ArrayList<Cita>) content;
        }
    }
}
