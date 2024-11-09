package co.edu.unbosque.util.exception;

public class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException() {
        super("La contraseña es incorrecta.");
    }

}
