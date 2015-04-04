
@SuppressWarnings("serial")
public class DatabaseCorruptedException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Username can't be empty";
    
    private String message;
    
    public DatabaseCorruptedException(String message) {
        this.message = message;
    }
    
    public DatabaseCorruptedException() {
        this(DEFAULT_MESSAGE);
    }

    @Override
    public String getMessage() {        
        return this.message;
    }   
}