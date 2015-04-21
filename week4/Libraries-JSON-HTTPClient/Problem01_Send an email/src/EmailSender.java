import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;



public class EmailSender {
    public static void sendEmail(EmailData data) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName(data.host);
        email.setSmtpPort(data.port);
        email.setAuthenticator(
                new DefaultAuthenticator(data.senderUsername, data.senderPassword)
                );
        email.setSSLOnConnect(data.ssl);
        email.setSSL(true);
        email.setFrom(data.senderEmail);
        email.setSubject(data.subject);
        email.setMsg(data.message);
        email.addTo(data.recipientEmail);
        email.setDebug(true);
        email.send();
    }
}