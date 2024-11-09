package co.edu.unbosque.util.exception;

public class DuplicateUserException extends Exception {
    public DuplicateUserException() {
        super("El usuario ya existe en el sistema.");
    }

}
