package co.edu.unbosque.test;

import static org.junit.Assert.fail;

import java.util.Timer;
import java.util.TimerTask;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.unbosque.controller.MailController;

public class MailControllerTest {

	 static int numeroDePrueba;

	    @BeforeClass
	    public static void antesDeTodo() {
	        System.out.println("Iniciando las pruebas unitarias de la clase MailControllerTest");
	        numeroDePrueba = 1;
	    }

	    @Before
	    public void antesDeCadaPrueba() {
	        System.out.println("Iniciando la prueba número " + numeroDePrueba);
	    }

	    @Test
	    public void testCrearEmail_ConCorreoValido() {
	        try {
	            MailController mailController = new MailController();
	            mailController.createEmail("test@example.com", "Asunto de prueba", "Contenido del correo de prueba");
	            System.out.println("Correo creado correctamente con correo válido.");
	        } catch (Exception e) {
	            fail("No se esperaba una excepción al crear el correo con un email válido.");
	        }
	    }

	    @Test
	    public void testEnviarCorreo() {
	        try {
	            MailController mailController = new MailController();
	            mailController.createEmail("test@example.com", "Asunto de prueba", "Contenido del correo de prueba");
	            mailController.sendEmail();
	            System.out.println("Correo enviado correctamente a test@example.com.");
	        } catch (Exception e) {
	            fail("No se esperaba una excepción al enviar el correo.");
	        }
	    }

	    @After
	    public void despuesDeCadaPrueba() {
	        System.out.println("Finalizando la prueba número " + numeroDePrueba);
	        numeroDePrueba++;
	    }

	    @AfterClass
	    public static void despuesDeTodo() {
	        System.out.println("Finalizando todas las pruebas unitarias de la clase MailControllerTest");
	    }
		}