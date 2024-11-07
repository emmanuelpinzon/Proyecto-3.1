package co.edu.unbosque.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class MailController {
	public static void main(String[] args) throws AddressException, MessagingException {
	    String correo = "emmanuelpinzon16@gmail.com";
	    String contra = "bosque2023";
	    String correoDestino = "santipin168@gmail.com";

	    Properties p = new Properties();
	    p.put("mail.smtp.host", "smtp.gmail.com");
	    p.setProperty("mail.smtp.starttls.enable", "true");
	    p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	    p.setProperty("mail.smtp.port", "587");
	    p.setProperty("mail.smtp.user", correo);
	    p.setProperty("mail.smtp.auth", "true");

	    Session s = Session.getDefaultInstance(p);
	    MimeMessage mensaje = new MimeMessage(s);

	    mensaje.setFrom(new InternetAddress(correo));
	    mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
	    mensaje.setSubject("Prueba de video dia 22");
	    mensaje.setText("Este es un mensaje que se envia desde Java");
	    
	    Transport t = s.getTransport("smtp");
	    t.connect(correo, contra);
	    t.sendMessage(mensaje, mensaje.getAllRecipients());
	    t.close();

	    JOptionPane.showMessageDialog(null, "Mensaje Enviado");

	}
	}


