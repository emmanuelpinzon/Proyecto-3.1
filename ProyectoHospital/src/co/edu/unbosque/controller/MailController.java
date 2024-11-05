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
	static final String TO = "santipin168@gmail.com";
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
	 
	       //props.put("mail.smtp.ssl.enable", "true"); //the default value is false if not set
	       props.put("mail.smtp.auth", "true");
	       props.put("mail.smtp.auth.login.disable", "true");  //the default authorization order is "LOGIN PLAIN DIGEST-MD5 NTLM". 'LOGIN' must be disabled since Email Delivery authorizes as 'PLAIN'
	       props.put("mail.smtp.starttls.enable", "true");   //TLSv1.2 is required
	       props.put("mail.smtp.starttls.required", "true");  //Oracle Cloud Infrastructure required

	 
	        // Create a Session object to represent a mail session with the specified properties.
	       Session session = Session.getDefaultInstance(props);
	 
	        // Create a message with the specified information.
	        MimeMessage msg = new MimeMessage(session);
	        msg.setFrom(new InternetAddress(FROM,FROMNAME));
	        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
	        msg.setSubject(SUBJECT);
	        msg.setContent(BODY,"text/html");
	        msg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);
	        
	 
	        // Create a transport.
	        Transport transport = session.getTransport();
	           
	 
	        // Send the message.
	 
	        try
	        {
	 
	            System.out.println("Sending Email now...standby...");
	 
	 
	            // Connect to OCI Email Delivery using the SMTP credentials specified.
	            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);    
	 
	            // Send email.
	            transport.sendMessage(msg, msg.getAllRecipients());
	            System.out.println("Email sent!");
	 
	        }
	 
	        catch (Exception ex) {
	 
	            System.out.println("The email was not sent.");
	            System.out.println("Error message: " + ex.getMessage());
	 
	        }
	 
	        finally
	 
	        {
	 
	            // Close & terminate the connection.
	            transport.close();
	 
	        }
	 
	    }
	}


