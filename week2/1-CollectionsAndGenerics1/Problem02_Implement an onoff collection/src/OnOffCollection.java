import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class OnOffCollection<E> implements Collection<E> {
    private boolean isNullAllowed;
    private Set<E> collection = new HashSet<E>();
    
    public OnOffCollection(boolean isNullAllowed) {
        setNullAllowed(isNullAllowed);
    }
    
    public OnOffCollection() {
        this(false);
    }   
        
    public boolean isNullAllowed() {
        return isNullAllowed;
    }
    
    public void setNullAllowed(boolean isNullAllowed) {
        this.isNullAllowed = isNullAllowed;
    }
    
    @Override
    public boolean add(E arg0) {
        if (!this.isNullAllowed && arg0 == null) {
            throw new IllegalArgumentException("Null is not allowed as an argument");
        }
        
        if (this.collection.contains(arg0)) {
            this.collection.remove(arg0);
        } else {
            this.collection.add(arg0);
        }
        
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> arg0) {
        for (E element : arg0) {
            this.add(element);
        }
        return false;
    }

    @Override
    public void clear() {
        this.collection.clear();
        
    }

    @Override
    public boolean contains(Object arg0) {
        return this.collection.contains(arg0);
    }

    @Override
    public boolean containsAll(Collection<?> arg0) {
        return this.collection.containsAll(arg0);
    }

    @Override
    public boolean isEmpty() {
        return this.collection.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return this.collection.iterator();
    }

    @Override
    public boolean remove(Object arg0) {
        return this.collection.remove(arg0);
    }

    @Override
    public boolean removeAll(Collection<?> arg0) {
        return this.collection.removeAll(arg0);
    }

    @Override
    public boolean retainAll(Collection<?> arg0) {
        return this.collection.retainAll(arg0);
    }

    @Override
    public int size() {
        return this.collection.size();
    }

    @Override
    public Object[] toArray() {
        return this.collection.toArray();
    }

    @Override
    public <T> T[] toArray(T[] arg0) {
        return this.collection.toArray(arg0);
    }
}