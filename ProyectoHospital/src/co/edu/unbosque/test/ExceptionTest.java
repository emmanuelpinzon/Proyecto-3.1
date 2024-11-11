package co.edu.unbosque.test;


import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.unbosque.util.exception.*;


public class ExceptionTest {

	 @BeforeClass
	    public static void setUpBeforeClass() {
	        System.out.println("Iniciando pruebas de ExceptionChecker");
	    }

	    @Before
	    public void setUp() {
	        System.out.println("Iniciando una prueba...");
	    }

	    @Test
	    public void testCheckName_ValidName() {
	        try {
	            ExceptionChecker.checkName("Juan Pérez");
	        } catch (NameNotValidException e) {
	            fail("No se esperaba NameNotValidException para un nombre válido.");
	        }
	    }

	    @Test
	    public void testCheckName_InvalidName() {
	        try {
	            ExceptionChecker.checkName("Juan@Pérez");
	            fail("Se esperaba NameNotValidException para un nombre inválido.");
	        } catch (NameNotValidException e) {
	            // Excepción esperada
	        }
	    }

	    @Test
	    public void testCheckEmail_ValidEmail() {
	        try {
	            ExceptionChecker.checkEmail("test@example.com");
	        } catch (InvalidEmailException e) {
	            fail("No se esperaba InvalidEmailException para un correo válido.");
	        }
	    }

	    @Test
	    public void testCheckEmail_InvalidEmail() {
	        try {
	            ExceptionChecker.checkEmail("invalid-email");
	            fail("Se esperaba InvalidEmailException para un correo inválido.");
	        } catch (InvalidEmailException e) {
	            // Excepción esperada
	        }
	    }

	    @Test
	    public void testCheckEmptyField_NonEmptyField() {
	        try {
	            ExceptionChecker.checkEmptyField("Some text");
	        } catch (EmptyFieldException e) {
	            fail("No se esperaba EmptyFieldException para un campo no vacío.");
	        }
	    }

	    @Test
	    public void testCheckEmptyField_EmptyField() {
	        try {
	            ExceptionChecker.checkEmptyField("");
	            fail("Se esperaba EmptyFieldException para un campo vacío.");
	        } catch (EmptyFieldException e) {
	            // Excepción esperada
	        }
	    }

	    @Test
	    public void testCheckPassword_CorrectPassword() {
	        try {
	            ExceptionChecker.checkPassword("password123", "password123");
	        } catch (IncorrectPasswordException e) {
	            fail("No se esperaba IncorrectPasswordException para una contraseña correcta.");
	        }
	    }

	    @Test
	    public void testCheckPassword_IncorrectPassword() {
	        try {
	            ExceptionChecker.checkPassword("password123", "wrongPassword");
	            fail("Se esperaba IncorrectPasswordException para una contraseña incorrecta.");
	        } catch (IncorrectPasswordException e) {
	            // Excepción esperada
	        }
	    }

	    @Test
	    public void testCheckDate_ValidDate() {
	        try {
	            ExceptionChecker.checkDate(LocalDate.now().plusDays(1));
	        } catch (InvalidDateException e) {
	            fail("No se esperaba InvalidDateException para una fecha válida.");
	        }
	    }

	    @Test
	    public void testCheckDate_InvalidDate() {
	        try {
	            ExceptionChecker.checkDate(LocalDate.now().minusDays(1));
	            fail("Se esperaba InvalidDateException para una fecha inválida.");
	        } catch (InvalidDateException e) {
	            // Excepción esperada
	        }
	    }

	    @Test
	    public void testCheckNegativeNumber_PositiveNumber() {
	        try {
	            ExceptionChecker.checkNegativeNumber(10);
	        } catch (NegativeNumberInvalidException e) {
	            fail("No se esperaba NegativeNumberInvalidException para un número positivo.");
	        }
	    }

	    @Test
	    public void testCheckNegativeNumber_NegativeNumber() {
	        try {
	            ExceptionChecker.checkNegativeNumber(-10);
	            fail("Se esperaba NegativeNumberInvalidException para un número negativo.");
	        } catch (NegativeNumberInvalidException e) {
	            // Excepción esperada
	        }
	    }

	    @Test
	    public void testCheckUserExists_UserExists() {
	        try {
	            ExceptionChecker.checkUserExists(new Object());
	        } catch (UserNotFoundException e) {
	            fail("No se esperaba UserNotFoundException para un usuario existente.");
	        }
	    }

	    @Test
	    public void testCheckUserExists_UserNotExists() {
	        try {
	            ExceptionChecker.checkUserExists(null);
	            fail("Se esperaba UserNotFoundException para un usuario inexistente.");
	        } catch (UserNotFoundException e) {
	            // Excepción esperada
	        }
	    }

	    @Test
	    public void testCheckDuplicateUser_NoDuplicate() {
	        List<String> existingUsers = new ArrayList<>();
	        existingUsers.add("user1");
	        existingUsers.add("user2");
	        try {
	            ExceptionChecker.checkDuplicateUser("user3", existingUsers);
	        } catch (DuplicateUserException e) {
	            fail("No se esperaba DuplicateUserException para un usuario no duplicado.");
	        }
	    }

	    @Test
	    public void testCheckDuplicateUser_Duplicate() {
	        List<String> existingUsers = new ArrayList<>();
	        existingUsers.add("user1");
	        existingUsers.add("user2");
	        try {
	            ExceptionChecker.checkDuplicateUser("user1", existingUsers);
	            fail("Se esperaba DuplicateUserException para un usuario duplicado.");
	        } catch (DuplicateUserException e) {
	            // Excepción esperada
	        }
	    }

	    @After
	    public void tearDown() {
	        System.out.println("Finalizando prueba...");
	    }

	    @AfterClass
	    public static void tearDownAfterClass() {
	        System.out.println("Finalizadas todas las pruebas de ExceptionChecker");
	    }
	}