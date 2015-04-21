import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;


public class SendEmailMain {
    public static final String GMAIL_HOST = "smtp.googlemail.com";
    public static final int GMAIL_PORT = 465;
    public static final String SENDER_USERNAME = "hristo.penchev.1986@gmail.com";
    public static final String SENDER_PASSWORD = "******";
    public static final boolean SSL = true;
    public static final String SENDER_EMAIL = "hristo.penchev.1986@gmail.com";
    public static final String RECIPIENT_EMAIL = "icomoneybookers@gmail.com";
    public static final String MESSAGE = "Test message";
    public static final String SUBJECT = "Test";
    
    public static void main(String[] args) throws EmailException {
        EmailData data = new EmailData(
                GMAIL_HOST, 
                GMAIL_PORT, 
                SENDER_USERNAME, 
                SENDER_PASSWORD, 
                SSL, 
                SENDER_EMAIL, 
                SUBJECT,
                MESSAGE, 
                RECIPIENT_EMAIL
                );
        EmailSender.sendEmail(data);
    }

}