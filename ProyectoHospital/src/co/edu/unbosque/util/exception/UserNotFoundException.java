package co.edu.unbosque.util.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("Usuario no encontrado.");
    }

}
