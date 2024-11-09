package co.edu.unbosque.util.exception;

public class EmptyFieldException extends Exception {
    public EmptyFieldException() {
        super("El campo no puede estar vacío.");
    }

}
