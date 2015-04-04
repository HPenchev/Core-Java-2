
@SuppressWarnings("serial")
public class ServiceNotAvailableAtTheMomentException extends Exception {
private static final String DEFAULT_MESSAGE = "Servide is not available at the moment." + 
" Please try again later or inform your system administrator";
    
    private String message;
    
    public ServiceNotAvailableAtTheMomentException(String message) {
        this.message = message;
    }
    
    public ServiceNotAvailableAtTheMomentException() {
        this(DEFAULT_MESSAGE);
    }

    @Override
    public String getMessage() {        
        return this.message;
    }  
}
