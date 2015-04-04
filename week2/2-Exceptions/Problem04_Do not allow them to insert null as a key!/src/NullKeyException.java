
@SuppressWarnings("serial")
public class NullKeyException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = "ExtendedHashMap does not allow a null key by default." + 
            "If you want to activate this option, please switch it by using the setNullAllowed method";
    
    private String message;
    
    public NullKeyException(String message) {
        this.message = message;
    }
    
    public NullKeyException() {
        this(DEFAULT_MESSAGE);
    }

    @Override
    public String getMessage() {
        return this.message;
    }   
}