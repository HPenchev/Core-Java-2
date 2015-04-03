import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class BoundedQueue<E> implements Queue<E> {
    public static final int DEFAULT_LIMIT = 8;
    
    private LinkedList<E> list;
    private int limit;
    
    public BoundedQueue(int limit) {
        this.setLimit(limit);
        list = new LinkedList<E>();
    }
    
    public BoundedQueue() {
        this(DEFAULT_LIMIT);
    }    
    
    private void setLimit(int limit) {
        if (limit <=0) {
            throw new IllegalArgumentException("Bounded queue has to have at least one element");
        }
        
        this.limit = limit;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E e : c) {
            this.add(e);
        }
        
        return true;
    }

    @Override
    public void clear() {
        this.list.clear();        
    }

    @Override
    public boolean contains(Object o) {
        return this.list.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.list.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return this.list.iterator();
    }

    @Override
    public boolean remove(Object o) {
        return this.list.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.list.retainAll(c);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.list.toArray(a);
    }

    @Override
    public boolean add(E e) {
        if (this.list.size() == limit) {
            this.list.removeFirst();
        }
        
        this.list.add(e);
        
        return true;
    }

    @Override
    public E element() {
        return this.list.element();        
    }

    @Override
    public boolean offer(E e) {
        this.add(e);
        return true;
    }

    @Override
    public E peek() {
        return this.list.peek();
    }

    @Override
    public E poll() {
        return this.list.poll();
    }

    @Override
    public E remove() {
        return this.list.remove();
    }    
}
