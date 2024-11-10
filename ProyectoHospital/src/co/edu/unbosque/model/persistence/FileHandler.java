package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

public class FileHandler {

	private static Scanner sc;
	private static PrintWriter pw;
	private static File archivo;
	private static final String FOLDER_NAME = "data";
	private static final String CONFIG_FOLDER_NAME = "config";

	// para archivos serializado
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;
	private static FileInputStream fis;
	private static ObjectInputStream ois;

	public static void checkFolder() {
		archivo = new File(FOLDER_NAME);
		if (archivo.exists() & archivo.isDirectory()) {
			return;
		} else {
			archivo.mkdir();
		}
		archivo = new File(CONFIG_FOLDER_NAME);
		if (archivo.exists() & archivo.isDirectory()) {
			return;
		} else {
			archivo.mkdir();
		}
	}
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
	public static Properties loadProperties(String url) {
		Properties prop= null;
		prop= new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_FOLDER_NAME + "/"+ url));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ruta del archivo propiedades no encontrado. ");
			System.out.println(CONFIG_FOLDER_NAME + "/"+ url);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error al leer el archivo de propiedades");
			e.printStackTrace();
		}
		return prop;
	}
}
