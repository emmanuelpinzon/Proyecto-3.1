package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Especialista;
import co.edu.unbosque.model.EspecialistaDTO;



/**

 * 
 * @version 1.0
 * @author Emmanuel
 */
public class EspecialistaDAO implements CRUDOperation<EspecialistaDTO, Especialista> {
    private ArrayList<Especialista> listaEspecialistas;
    private final String FILE_NAME = "especialista.csv";
    private final String SERIAL_NAME = "especialista.dat";

 
    public EspecialistaDAO() {
        FileHandler.checkFolder();
        readSerialized();
    }

    @Override
    public String ShowAll() {
        String rta = "";
        if (listaEspecialistas.isEmpty()) {
            return "No hay especialistas en la lista.";
        } else {
            for (Especialista especialista : listaEspecialistas) {
                rta += especialista;
            }
            return rta;
        }
    }

    @Override
    public String ShowAllNames() {
        if (listaEspecialistas.isEmpty()) {
            return "No especialistas en la lista.";
        }

        String rta = "";
        for (Especialista especialista : listaEspecialistas) {
            rta += especialista.getNombre() + "\n"; // Solo agrega el nombre
        }
        return rta;
    }

    @Override
    public ArrayList<EspecialistaDTO> getAll() {
        return DataMapper.listaEspecialistaToEspecialistaDTO(listaEspecialistas);
    }

    @Override
    public boolean add(EspecialistaDTO newData) {
        if (find(DataMapper.EspecialistaDTOToEspecialista(newData)) == null) {
            listaEspecialistas.add(DataMapper.EspecialistaDTOToEspecialista(newData));
            writeFile();
            writeSerialized();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(EspecialistaDTO toDelete) {
        Especialista found = find(DataMapper.EspecialistaDTOToEspecialista(toDelete));
        if (found != null) {
            listaEspecialistas.remove(found);
            writeFile();
            writeSerialized();
            return true;
        } else {
            return false;
        }
    }



    @Override
    public Especialista find(Especialista toFind) {
        Especialista found = null;
        if (!listaEspecialistas.isEmpty()) {
            for (Especialista especialista : listaEspecialistas) {
                if (especialista.getNombre().toLowerCase().equals(toFind.getNombre().toLowerCase())) {
                    found = especialista;
                    return found;
                }
            }
        }
        return null;
    }

    @Override
    public boolean update(EspecialistaDTO previous, EspecialistaDTO newData) {
        Especialista found = find(DataMapper.EspecialistaDTOToEspecialista(previous));
        if (found != null) {
            listaEspecialistas.remove(found);
            listaEspecialistas.add(DataMapper.EspecialistaDTOToEspecialista(newData));
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
        for (Especialista especialista : listaEspecialistas) {
            content += especialista.getNombre() + "; ";
            content += especialista.getCedula() + "; ";
            content += especialista.getCorreo() + "; ";
            content += especialista.getContraseña() + "; ";
            content += especialista.getTipoEspecialista() ;
            content += "\n";
        }
        FileHandler.writeFile(FILE_NAME, content);
    }


    public void writeSerialized() {
        FileHandler.writeSerialized(SERIAL_NAME, listaEspecialistas);
    }


    public void readSerialized() {
        Object content = FileHandler.readSerialized(SERIAL_NAME);
        if (content == null) {
            listaEspecialistas = new ArrayList<>();
        } else {
            listaEspecialistas = (ArrayList<Especialista>) content;
        }
    }
}
