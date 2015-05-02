import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;



public class EmailSender {
    public static void sendEmail(EmailData data) throws EmailException, MalformedURLException {
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName(data.host);
        email.setSmtpPort(data.port);
        email.setAuthenticator(
                new DefaultAuthenticator(data.senderUsername, data.senderPassword)
                );
        email.setSSLOnConnect(data.ssl);
       // email.setSSL(true);
        email.setFrom(data.senderEmail);
        email.setSubject(data.subject);
        email.setMsg(data.message);
        email.addTo(data.recipientEmail);
        email.setDebug(true);
        if (data.attachmentUrl != null) {
            EmailAttachment attachment = takeAttachment(data.attachmentUrl);
            email.attach(attachment);
        }
        
        email.send();
    }
    
    private static EmailAttachment takeAttachment(String url) throws MalformedURLException {
        EmailAttachment attachment = new EmailAttachment();
        attachment.setURL(new URL(url));
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("test");
        attachment.setName("test");
        
        return attachment;
    }
}