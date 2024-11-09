package co.edu.unbosque.util.exception;

public class NameNotValidException extends Exception {
	public NameNotValidException() {
		super("Los nombres solamente pueden poseer letras y espacios (ademas de un 6)");
	}

}
