
public class EmailData {
    public String senderEmail;
    public String recipientEmail;
    public int port;
    public String senderUsername;
    public String senderPassword;
    public String host;
    public boolean ssl;
    public String message;
    public String subject;
    public String attachmentUrl;    
    
    public EmailData(
            String host,
            int port, 
            String senderUsername,
            String senderPassword,
            boolean ssl,
            String senderEmail,
            String subject,
            String message,
            String recipientEmail) {
        this.host = host;
        this.port = port;
        this.senderUsername = senderUsername;
        this.senderPassword = senderPassword;
        this.ssl = ssl;
        this.senderEmail = senderEmail;
        this.recipientEmail = recipientEmail;
        this.message = message;   
        this.subject = subject;
    }  
    
    public EmailData(
            String host,
            int port, 
            String senderUsername,
            String senderPassword,
            boolean ssl,
            String senderEmail,
            String subject,
            String message,
            String recipientEmail,
            String attachmentUrl) {
        this(
                host,
                port,
                senderUsername,
                senderPassword,
                ssl,
                senderEmail,
                subject,
                message,
                recipientEmail);
        this.attachmentUrl = attachmentUrl;
    }
}