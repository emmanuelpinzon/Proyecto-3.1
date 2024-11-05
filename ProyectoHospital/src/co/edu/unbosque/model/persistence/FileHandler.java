package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Clase para manejar la lectura y escritura de archivos, incluyendo archivos de
 * texto y archivos serializados.
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class FileHandler {

	private static Scanner sc;
	private static PrintWriter pw;
	private static File archivo;
	private static final String FOLDER_NAME = "data";

	// para archivos serializado
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;
	private static FileInputStream fis;
	private static ObjectInputStream ois;

	/**
	 * Escribe un objeto en un archivo serializado.
	 * 
	 * @param url     el nombre del archivo
	 * @param content el objeto a escribir
	 */
	public static void writeSerialized(String url, Object content) {// este se va a utilizar para el taller
		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {

				archivo.createNewFile();
			}
			fos = new FileOutputStream(archivo);// para cargar
			oos = new ObjectOutputStream(fos);// para escribit
			oos.writeObject(content);// escritor
			fos.close();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ocurrio un error con la escritura de archivo");
			// e.printStackTrace();

		}
	}

	/**
	 * Lee un objeto de un archivo serializado.
	 * 
	 * @param url el nombre del archivo
	 * @return el objeto leído o null si ocurre un error
	 */
	public static Object readSerialized(String url) {// este se va a utilizar para el taller
		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {

				archivo.createNewFile();

			}
			fis = new FileInputStream(archivo);
			ois = new ObjectInputStream(fis);

			Object content = ois.readObject();
			fis.close();
			ois.close();
			return content;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ocurrio un error con la lectura de archivo serializado");
			// e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("error al leer los datos del archivo seriarilzado(class not found)");

		}
		return null;
	}

	/**
	 * Verifica si el directorio para almacenar archivos existe, de lo contrario, lo
	 * crea.
	 */
	public static void checkFolder() {
		archivo = new File(FOLDER_NAME);
		if (archivo.exists() && archivo.isDirectory()) {
			return;
		} else {
			archivo.mkdir();
		}
	}

	/**
	 * Escribe contenido en un archivo de texto.
	 * 
	 * @param url     el nombre del archivo
	 * @param content el contenido a escribir
	 */
	public static void writeFile(String url, String content) {
		try {
			archivo = new File(FOLDER_NAME + "/" + url);// no se pueden crear archivos en carpetas protegidas. url
														// absolutas y relativas
			if (!archivo.exists()) {

				archivo.createNewFile();
			}
			pw = new PrintWriter(archivo);
			pw.write(content);
			pw.close();

		} catch (FileNotFoundException e) {

			System.out.println("error en la escritura del archivo");
			// e.printStackTrace();
		} catch (IOException e) {

			System.out.println("error en la creacion del archivo(texto plano)");
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

	}

	/**
	 * Lee el contenido de un archivo de texto.
	 * 
	 * @param url el nombre del archivo
	 * @return el contenido del archivo o null si ocurre un error
	 */
	public static String readFile(String url) {
		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			sc = new Scanner(archivo);
			String content = "";
			while (sc.hasNext()) {
				content += sc.nextLine() + "\n";
			}
			return content;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
}
