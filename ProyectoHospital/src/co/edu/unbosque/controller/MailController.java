package co.edu.unbosque.controller;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class MailController {
		static final String FROM = "emmanuelpinzon16@gmail.com"; 
	    static final String HOST = "smtp.gmail.com";
	    static final String SMTP_USERNAME = "emmanuelpinzon16@gmail.com"; 
	    static final String SMTP_PASSWORD = "bosque2023"; 
	    static final int PORT = 587;
	    
	    public void enviarRecordatorio(String to, String nombre, String fechaCita, String horaCita) {
	        Properties props = new Properties();
	        props.put("mail.transport.protocol", "smtp");
	        props.put("mail.smtp.host", HOST);
	        props.put("mail.smtp.port", PORT);
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true"); 
	        
	        Session session = Session.getInstance(props);
	        
	        try {
	            MimeMessage msg = new MimeMessage(session);
	            msg.setFrom(new InternetAddress(FROM));
	            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
	            msg.setSubject("Recordatorio de su cita");
	            
	           
	            String body = String.format(
	                "<h1>Hola %s,</h1>" +
	                "<p>Este es un recordatorio de su cita.</p>" +
	                "<p><strong>Fecha:</strong> %s</p>" +
	                "<p><strong>Hora:</strong> %s</p>" +
	                "<p>Gracias por confiar en nosotros.</p>", 
	                nombre, fechaCita, horaCita
	            );
	            msg.setContent(body, "text/html");

	            Transport transport = session.getTransport();
	            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
	            transport.sendMessage(msg, msg.getAllRecipients());
	            System.out.println("Recordatorio de cita enviado a " + to);
	            transport.close();
	        } catch (Exception ex) {
	            System.out.println("Error enviando el recordatorio: " + ex.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	    	MailController reminder = new MailController();
	        reminder.enviarRecordatorio("destinatario@example.com", "Nombre del Usuario", "2024-11-10", "14:30");
	    }
	}