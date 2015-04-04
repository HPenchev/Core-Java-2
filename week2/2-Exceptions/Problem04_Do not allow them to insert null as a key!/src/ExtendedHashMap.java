import java.util.HashMap;


@SuppressWarnings("serial")
public class ExtendedHashMap<T, E> extends HashMap<T, E> {
    private static final boolean IS_NULL_ALLOWED = false;
    private boolean isNullAllowed;
    
    public ExtendedHashMap (boolean isNullAllowed) {
        setNullAllowed(isNullAllowed);
    }
    
    public ExtendedHashMap() {
        this(IS_NULL_ALLOWED);
    }
    
    public boolean isNullAllowed() {
        return this.isNullAllowed;
    }

    public void setNullAllowed(boolean isNullAllowed) {
        this.isNullAllowed = isNullAllowed;
    }

    @Override
    public E get(Object key) {
        checkKey(key);
        E output = (E)super.get(key);
        return output;
    }

    @Override
    public E put(T key, E value) {
        checkKey(key);
        E output = super.put(key, value);
        return output;
    }   
    

    private void checkKey(Object key) {
        if (key == null && !this.isNullAllowed()) {
            throw new NullKeyException();
        }
    }
}