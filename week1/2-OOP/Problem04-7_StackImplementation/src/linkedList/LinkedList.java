package linkedList;

import contracts.*;

public class LinkedList extends LinkedStack implements LinkedListable{
    
    public LinkedList() {
        super();
    }
        
    public void add(Object element) {
        this.push(element);       
    }
    
    public int size() {
        return this.length();
    }
    
    public Object get(int index) {
        ListNode node = getNode(index);
        
        return node.value;
    }    
    
    public Object getHead() {
        return this.head.value;
    }
    
    public Object getTail() {
        return this.peak();
    }
    
    @Override
    public void remove(int index) {
        super.remove(index);
    }
}