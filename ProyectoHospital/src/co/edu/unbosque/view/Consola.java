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