package co.edu.unbosque.util.exception;

public class InvalidEmailException extends Exception {
	public InvalidEmailException() {
		super("El correo electrónico es inválido");
	}
}
