package co.edu.unbosque.test;


import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.unbosque.model.persistence.FileHandler;

public class FileHandlerTest {

	 private static final String TEST_TEXT_FILE = "testFile.txt";
	    private static final String TEST_SERIALIZED_FILE = "testSerialized.obj";
	    private static final String TEST_PROPERTIES_FILE = "testConfig.properties";
	    private static final String TEST_CONTENT = "Este es el contenido de prueba.";

	    @BeforeClass
	    public static void setUpBeforeClass() {
	        System.out.println("Iniciando pruebas de FileHandler");
	        // Inicializa carpetas antes de todas las pruebas
	        FileHandler.checkFolder();
	    }

	    @Before
	    public void setUp() {
	        System.out.println("Iniciando una prueba...");
	    }

	    @Test
	    public void testCheckFolder() {
	        // Llama a checkFolder() para crear los directorios si no existen
	        FileHandler.checkFolder();

	        File dataFolder = new File("data");
	        File configFolder = new File("config");

	        if (!(dataFolder.exists() && dataFolder.isDirectory())) {
	            fail("La carpeta 'data' no existe o no es un directorio");
	        }
	        if (!(configFolder.exists() && configFolder.isDirectory())) {
	            fail("La carpeta 'config' no existe o no es un directorio");
	        }
	    }

	    @Test
	    public void testWriteAndReadFile() {
	        // Escribir y leer contenido en un archivo de texto
	        FileHandler.writeFile(TEST_TEXT_FILE, TEST_CONTENT);
	        String readContent = FileHandler.readFile(TEST_TEXT_FILE);
	        
	        if (!TEST_CONTENT.equals(readContent)) {
	           	
	        }
	    }

	    @Test
	    public void testWriteAndReadSerialized() {
	        // Serializar y deserializar un objeto
	        String testObject = "Contenido serializado de prueba";
	        FileHandler.writeSerialized(TEST_SERIALIZED_FILE, testObject);

	        Object readObject = FileHandler.readSerialized(TEST_SERIALIZED_FILE);
	        if (readObject == null) {
	            fail("El objeto leído es nulo.");
	        }
	        if (!(readObject instanceof String)) {
	            fail("El objeto leído no es del tipo esperado.");
	        }
	        if (!testObject.equals(readObject)) {
	            fail("El contenido del objeto leído no coincide con el contenido serializado.");
	        }
	    }

	    @Test
	    public void testLoadProperties() {
	        File configFolder = new File("config");
	        if (!configFolder.exists()) {
	            configFolder.mkdir();
	        }

	        // Escribir el archivo de propiedades en el formato de Properties
	        Properties propertiesToWrite = new Properties();
	        propertiesToWrite.setProperty("clave1", "valor1");
	        propertiesToWrite.setProperty("clave2", "valor2");
	        
	        try (FileOutputStream fos = new FileOutputStream("config/" + TEST_PROPERTIES_FILE)) {
	            propertiesToWrite.store(fos, null);
	        } catch (IOException e) {
	            fail("No se pudo escribir el archivo de propiedades para la prueba.");
	        }

	        // Cargar el archivo de propiedades usando el método loadProperties
	        Properties props = FileHandler.loadProperties(TEST_PROPERTIES_FILE);

	        if (props == null) {
	            fail("Las propiedades cargadas son nulas.");
	        }
	        if (!"valor1".equals(props.getProperty("clave1"))) {
	            fail("La propiedad 'clave1' no tiene el valor esperado.");
	        }
	        if (!"valor2".equals(props.getProperty("clave2"))) {
	            fail("La propiedad 'clave2' no tiene el valor esperado.");
	        }
	    }

	    @After
	    public void tearDown() {
	        System.out.println("Finalizando prueba...");
	    }

	    @AfterClass
	    public static void tearDownAfterClass() {
	        // Eliminar archivos de prueba creados
	        new File("data/" + TEST_TEXT_FILE).delete();
	        new File("data/" + TEST_SERIALIZED_FILE).delete();
	        new File("config/" + TEST_PROPERTIES_FILE).delete();

	        System.out.println("Finalizadas todas las pruebas de FileHandler");
	    }
	
}