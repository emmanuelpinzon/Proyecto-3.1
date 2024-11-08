package co.edu.unbosque.controller;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class MailController {
	static final String FROM = "emmanuelpinzon16@gmail.com";
	static final String FROMNAME="Emmanuel";
	static final String TO = "emmanuelpinzon16@gmail.com";
	static final String SMTP_USERNAME="emmanuelpinzon16@gmail.com"; 
	static final String SMTP_PASSWORD = "bosque2023";
	static final String CONFIGSET = "";
	static final String HOST = "smtp.us-ashburn-1.oraclecloud.com.";
	static final int PORT= 587;
	static final String SUBJECT = "Envio correo desde JAVA";
	static final String BODY = String.join(
			 
	           System.getProperty("line.separator"),
	           "<h1>OCI Email Delivery test</h1>",
	           "<p>This email was sent with OCI Email Delivery using the ",
	           "<a href='Javamail'>https://github.com/javaee/javamail'>Javamail Package</a>",
	          " for <a href='Javahttps://www.java.com'>Java</a>."
	 
	       );
	
	public static void main(String[]args)throws Exception {
		Properties props = System.getProperties();
		props.put("mail.transport.protocol", "smtp");
	       props.put("mail.smtp.port", PORT);
	 
	       
	       props.put("mail.smtp.auth", "true");
	       props.put("mail.smtp.auth.login.disable", "true");  
	       props.put("mail.smtp.starttls.enable", "true");  
	       props.put("mail.smtp.starttls.required", "true"); 

	 
	        
	       Session session = Session.getDefaultInstance(props);
	 
	       
	        MimeMessage msg = new MimeMessage(session);
	        msg.setFrom(new InternetAddress(FROM,FROMNAME));
	        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
	        msg.setSubject(SUBJECT);
	        msg.setContent(BODY,"text/html");
	        msg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);
	        
	 
	        
	        Transport transport = session.getTransport();
	           
	 
	        
	 
	        try
	        {
	 
	            System.out.println("Finalizando el correo electrónico ahora...en espera...");
	 
	 
	            
	            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);    
	 
	            
	            transport.sendMessage(msg, msg.getAllRecipients());
	            System.out.println("Mensaje enviado!");
	 
	        }
	 
	        catch (Exception ex) {
	 
	            System.out.println("El correo no se puede mandar :( .");
	            System.out.println("Error message: " + ex.getMessage());
	 
	        }
	 
	        finally
	 
	        {
	 
	            
	            transport.close();
	 
	        }
	 
	    }
	}