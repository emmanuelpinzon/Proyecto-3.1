package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

/**
 * Interfaz CRUDOperation define operaciones básicas para realizar 
 * operaciones de CRUD (Crear, Leer, Actualizar y Eliminar) en 
 * entidades de tipo genérico.
 * 
 * @param <P> Tipo de objeto de transferencia de datos (DTO)
 * @param <N> Tipo de objeto de entidad
 * 
 * @author Emmanuel
 * @version 1.0
 */
public interface CRUDOperation<D, E> {

    /**
     * Muestra todos los registros en formato de texto.
     * 
     * @return una cadena que representa todos los registros
     */
    public String ShowAll(); // mostrar todo
    
    /**
     * Muestra solo los nombres de los registros en formato de texto.
     * 
     * @return una cadena que representa los nombres de los registros
     */
    public String ShowAllNames(); // mostrar solo nombres

    /**
     * Obtiene todos los registros como una lista de objetos DTO.
     * 
     * @return una lista de objetos DTO
     */
    public ArrayList<D> getAll(); // mostrar todo como DTO

    /**
     * Agrega un nuevo registro, verificando que no haya duplicados.
     * 
     * @param newdata el nuevo objeto a agregar
     * @return true si se agregó con éxito, false si hubo un duplicado
     */
    public boolean add(D newdata); // ahora verifico que no haya duplicados

    /**
     * Elimina un registro existente.
     * 
     * @param toDelete el objeto a eliminar
     * @return true si se eliminó con éxito, false si no se encontró
     */
    public boolean delete(D toDelete); // eliminar

 

    /**
     * Busca un registro específico.
     * 
     * @param toFind el objeto a buscar
     * @return el objeto encontrado o null si no existe
     */
    public E find(E toFind); // buscar, verificar si existe o no; null -> no existe

    /**
     * Actualiza un registro existente con nuevos datos.
     * 
     * @param previous el objeto a actualizar
     * @param newData el nuevo objeto con los datos actualizados
     * @return true si se actualizó con éxito, false si no se encontró
     */
    public boolean update(D previous, D newData); // actualizar
}
