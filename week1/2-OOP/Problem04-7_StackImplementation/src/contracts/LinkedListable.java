package contracts;

public interface LinkedListable {
    public void add(Object element);    
    public int size();
    public Object get(int index);
    public void remove(int index);    
    public Object getHead();
    public Object getTail();
}