package co.edu.unbosque.util.exception;

public class NegativeNumberInvalidException extends Exception {
    public NegativeNumberInvalidException() {
        super("El número ingresado no puede ser negativo.");
    }

}
