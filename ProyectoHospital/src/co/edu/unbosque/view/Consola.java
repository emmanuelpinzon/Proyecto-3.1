package co.edu.unbosque.view;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * La clase Consola proporciona métodos para interactuar con el usuario a través
 * de la consola y ventanas emergentes. Permite la entrada y salida de datos de
 * diferentes tipos y facilita la presentación de mensajes y alertas.
 * 
 * @author Nicole
 * @version 1.0
 */
public class Consola {
	private Scanner sc;

	/**
	 * Constructor de la clase Consola. Inicializa el objeto Scanner para la entrada
	 * de datos.
	 */
	public Consola() {
		sc = new Scanner(System.in);
	}

	/**
	 * Lee un valor entero desde la entrada estándar.
	 * 
	 * @return el valor entero leído
	 */
	public int readInt(String entrada) {
		int numero = Integer.parseInt(entrada);

		return numero;
	}

	/**
	 * Lee un valor decimal (float) desde la entrada estándar.
	 * 
	 * @return el valor float leído
	 */
	public float readFloat() {
		return sc.nextFloat();
	}

	/**
	 * Lee un valor largo (long) desde la entrada estándar.
	 * 
	 * @return el valor long leído
	 */
	public long readLong() {
		return sc.nextLong();
	}

	/**
	 * Lee una línea completa de texto desde la entrada estándar.
	 * 
	 * @return la línea de texto leída
	 */
	public String readLine() {
		return sc.nextLine();
	}

	/**
	 * Lee un valor decimal (double) desde la entrada estándar.
	 * 
	 * @return el valor double leído
	 */
	public double readDouble() {
		return sc.nextDouble();
	}

	/**
	 * Lee una palabra desde la entrada estándar.
	 * 
	 * @return la palabra leída
	 */
	public String readWrod() {
		return sc.nextLine();
	}

	/**
	 * Lee un valor booleano a partir de una entrada de texto.
	 * 
	 * @param entrada el texto de entrada
	 * @return true si la entrada contiene "si", false de lo contrario
	 */
	public boolean readBoolean(String entrada) {
		if (entrada.toLowerCase().contains("si")) {
			return true;
		} else if (entrada.toLowerCase().contains("no")) {
			return false;
		}
		return false;
	}

	/**
	 * Limpia el buffer de entrada.
	 */
	public void burnLine() {
		sc.nextLine();
	}

	/**
	 * Imprime un texto en la consola seguido de un salto de línea.
	 * 
	 * @param texto el texto a imprimir
	 */
	public void printLine(String texto) {
		System.out.println(texto);
	}

	/**
	 * Imprime un texto en la consola sin salto de línea.
	 * 
	 * @param text el texto a imprimir
	 */
	public void print(String text) {
		System.out.print(text);
	}

	/**
	 * Muestra un mensaje emergente informativo.
	 * 
	 * @param texto el mensaje a mostrar
	 */
	public void mostrarMensajeEmergente(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Muestra un mensaje de alerta.
	 * 
	 * @param texto el mensaje de alerta
	 */
	public void mostrarAlerta(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Alerta", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Muestra un mensaje de error.
	 * 
	 * @param texto el mensaje de error
	 */
	public void mostrarError(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Muestra un listado de productos registrados.
	 * 
	 * @param texto el texto del listado
	 */
	public void mostrarListado(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Lista productos registrados", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Lee un input para eliminar un producto.
	 * 
	 * @param texto el mensaje a mostrar en la ventana de entrada
	 * @return el texto ingresado por el usuario
	 */
	public String leerInputEliminar(String texto) {
		return JOptionPane.showInputDialog(null, texto, "Eliminando producto", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Lee una entrada desde una ventana emergente.
	 * 
	 * @param texto el mensaje a mostrar en la ventana de entrada
	 * @return el texto ingresado por el usuario
	 */
	public String leerEntradaEmergente(String texto) {
		return JOptionPane.showInputDialog(null, texto, "Ingresando dato", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Muestra un mensaje emergente con un área de texto desplazable.
	 *
	 * Este método crea un cuadro de diálogo que permite mostrar un texto largo en
	 * un área de texto que se puede desplazar. Se utiliza un JScrollPane para
	 * gestionar el desplazamiento del contenido si es necesario.
	 *
	 * @param texto El texto que se mostrará en el área de texto.
	 */
	public void mostrarMensajeEmergenteConScroll(String texto) {
		JTextArea textArea = new JTextArea(30, 50);
		textArea.setText(texto); // Establecer el texto
		textArea.setWrapStyleWord(true); // Ajustar palabras
		textArea.setLineWrap(true); // Ajustar líneas
		textArea.setCaretPosition(0); // Colocar el cursor al inicio
		textArea.setEditable(false); // Hacer el área de texto no editable
		// Crear un JScrollPane para permitir el desplazamiento
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// Mostrar el cuadro de diálogo con el JScrollPane
		JOptionPane.showInternalMessageDialog(null, scrollPane, "Listado de productos",
				JOptionPane.INFORMATION_MESSAGE);
	}
}