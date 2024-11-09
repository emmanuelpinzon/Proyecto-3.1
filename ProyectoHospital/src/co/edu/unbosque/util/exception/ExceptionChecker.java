package co.edu.unbosque.util.exception;

import java.time.LocalDate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionChecker {

	public static void checkName(String nombre) throws NameNotValidException {
		Pattern p = Pattern.compile("[^\\wáéíóúÜÁÉÍÓÚñ 6]");
		Matcher m = p.matcher(nombre);
		if (m.find()) {
			throw new NameNotValidException();
		}

	}

	public static void checkEmail(String email) throws InvalidEmailException {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			throw new InvalidEmailException();
		}
	}

	public static void checkEmptyField(String field) throws EmptyFieldException {
		if (field == null || field.trim().isEmpty()) {
			throw new EmptyFieldException();
		}
	}

	public static void checkPassword(String password, String correctPassword) throws IncorrectPasswordException {
		if (!password.equals(correctPassword)) {
			throw new IncorrectPasswordException();
		}
	}

	public static void checkDate(LocalDate date) throws InvalidDateException {
		if (date.isBefore(LocalDate.now())) {
			throw new InvalidDateException();
		}
	}

	public static void checkNegativeNumber(int number) throws NegativeNumberInvalidException {
		if (number < 0) {
			throw new NegativeNumberInvalidException();
		}
	}

	public static void checkUserExists(Object user) throws UserNotFoundException {
		if (user == null) {
			throw new UserNotFoundException();
		}
	}
	public static void checkDuplicateUser(String userId, List<String> existingUsers) throws DuplicateUserException {
        if (existingUsers.contains(userId)) {
            throw new DuplicateUserException();
        }
	}
}
