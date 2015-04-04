import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.lang.*;

@SuppressWarnings("serial")
public class ImmutableList<T extends Serializable> implements List<T>{
    private List<T> list = new ArrayList<T>();
    
    public ImmutableList(Collection<? extends T> collection) {
        this.list = new ArrayList<T>();
        for (T element : collection) {
            @SuppressWarnings("unchecked")
            T newElement = (T) SerializationUtils.clone(element);
            this.list.add(newElement);
        }
    }
    
    public static <T extends Serializable> ImmutableList<T> asList(T... args) {
        List<T> list = Arrays.asList(args);
        ImmutableList<T> output = new ImmutableList<T>(list);
        return output;
    }

    @Override
    public boolean add(T arg0) {
        throw new UnsupportedOperationException("The object is immutable");
    }

    @Override
    public void add(int arg0, T arg1) {
        throw new UnsupportedOperationException("The object is immutable");
        
    }

    @Override
    public boolean addAll(Collection<? extends T> arg0) {
        throw new UnsupportedOperationException("The object is immutable");
    }

    @Override
    public boolean addAll(int arg0, Collection<? extends T> arg1) {
        throw new UnsupportedOperationException("The object is immutable");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("The object is immutable");
        
    }

    @Override
    public boolean contains(Object arg0) {
        return this.list.contains(arg0);
    }

    @Override
    public boolean containsAll(Collection<?> arg0) {
        return this.list.containsAll(arg0);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int arg0) {
        T output = (T) SerializationUtils.clone(this.list.get(arg0));
        return output;
    }

    @Override
    public int indexOf(Object arg0) {
        return this.list.indexOf(arg0);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return this.list.iterator();
    }

    @Override
    public int lastIndexOf(Object arg0) {
        return this.list.lastIndexOf(arg0);
    }

    @Override
    public ListIterator<T> listIterator() {
        return this.list.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int arg0) {
        return this.list.listIterator(arg0);
    }

    @Override
    public boolean remove(Object arg0) {
        throw new UnsupportedOperationException("The object is immutable");
    }

    @Override
    public T remove(int arg0) {
        throw new UnsupportedOperationException("The object is immutable");
    }

    @Override
    public boolean removeAll(Collection<?> arg0) {
        throw new UnsupportedOperationException("The object is immutable");
    }

    @Override
    public boolean retainAll(Collection<?> arg0) {
        throw new UnsupportedOperationException("The object is immutable");
    }

    @Override
    public T set(int arg0, T arg1) {
        throw new UnsupportedOperationException("The object is immutable");
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public List<T> subList(int arg0, int arg1) {
        List<T> newList = new ArrayList<T>();
        for (int i = arg0; i < arg1; i++) {
            @SuppressWarnings("unchecked")
            T element = (T) SerializationUtils.clone(this.list.get(i));
            newList.add(element);
        }
        
        List<T> output = new ImmutableList<T>(newList);
        return output;
    }

    @Override
    public Object[] toArray() {
        Object[] output = new Object[this.list.size()];
        for (int i = 0; i < this.list.size(); i++) {
            @SuppressWarnings("unchecked")
            T newElement = (T) SerializationUtils.clone(this.list.get(i));
            output[i] = newElement;
        }
        
        return output;
    }

    @SuppressWarnings("hiding")
    @Override
    public <T> T[] toArray(T[] arg0) {
        @SuppressWarnings("unchecked")
        T[] output = (T[]) Array.newInstance(this.list.get(0).getClass(), 5);
        for (int i = 0; i < this.list.size(); i++) {
            @SuppressWarnings("unchecked")
            T newElement = (T) SerializationUtils.clone(this.list.get(i));
            output[i] = newElement;
        }
        
        return output;
    }

}
