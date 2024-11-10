package co.edu.unbosque.controller;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class MailController {
    private static final String EMAIL_FROM = "emmanuelpinzon16@gmail.com";
    private static final String PASSWORD_FROM = "tbkf qmmd uwkj fnsc";
    private String emailTo;
    private String subject;
    private String content;
    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;

    public MailController() {
        mProperties = new Properties();
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", EMAIL_FROM);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        mSession = Session.getDefaultInstance(mProperties);
        
    }

    private void createEmail(String et, String s, String c) {
        emailTo = et.trim();
        subject = s.trim();
        content = c.trim();
        try {
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(EMAIL_FROM));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setText(content, "ISO-8859-1", "html");
        } catch (AddressException ex) {
            Logger.getLogger(MailController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(MailController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendEmail() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(EMAIL_FROM, PASSWORD_FROM);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (MessagingException ex) {
            Logger.getLogger(MailController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void programarRecordatorio(String emailDestino, String asunto, String contenido, long tiempoAntesCita) {
        createEmail(emailDestino, asunto, contenido);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                sendEmail();
            }
        }, tiempoAntesCita);  
    }

    public static void main(String[] args) {
    	MailController recordatorio = new MailController();

        String emailDestino = "emmanuelpinzon16@gmail.com";
        String asunto = "Recordatorio de Cita";
        String contenido = "Estimado usuario, le recordamos su cita agendada.";//puede modificar esto a su fusto 
        long tiempoAntesCita = 5000;  // el tiempo que pa mandar el correo en milisegundos 5segundso =5000 
      
        recordatorio.programarRecordatorio(emailDestino, asunto, contenido, tiempoAntesCita);
    }
}