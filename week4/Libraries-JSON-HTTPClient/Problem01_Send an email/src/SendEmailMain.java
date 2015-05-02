import java.net.MalformedURLException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;


public class SendEmailMain {
    public static final String GMAIL_HOST = "smtp.gmail.com";
    public static final int GMAIL_PORT = 465;
    public static final String SENDER_USERNAME = "hristo.penchev.1986@gmail.com";
    public static final String SENDER_PASSWORD = "******";
    public static final boolean SSL = true;
    public static final String SENDER_EMAIL = "hristo.penchev.1986@gmail.com";
    public static final String RECIPIENT_EMAIL = "icomoneybookers@gmail.com";
    public static final String MESSAGE = "Test message";
    public static final String SUBJECT = "Test";
    public static final String URL = 
            "http://d3dsacqprgcsqh.cloudfront.net/photo/azbW3zq_460sa_v1.gif";
    
    public static void main(String[] args) throws EmailException, MalformedURLException {
        EmailData data = new EmailData(
                GMAIL_HOST, 
                GMAIL_PORT, 
                SENDER_USERNAME, 
                SENDER_PASSWORD, 
                SSL, 
                SENDER_EMAIL, 
                SUBJECT,
                MESSAGE, 
                RECIPIENT_EMAIL,
                URL
                );
        EmailSender.sendEmail(data);   
    }
}