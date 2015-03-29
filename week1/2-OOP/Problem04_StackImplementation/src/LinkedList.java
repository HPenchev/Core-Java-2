
public class LinkedList implements LinkedListable, Stack{
    private class ListNode { 
        private ListNode(Object value) {
            this.value = value;
        }
        
        private ListNode(Object value, ListNode previousNode) {
            this(value);
            this.previousNode = previousNode;
        }        
        
        private Object value;
        private ListNode previousNode;
        private ListNode nextNode;
    }
    
    ListNode head;
    ListNode tail;
    
    public LinkedList() {
        this.head = null;     
        this.tail = null;
    }
        
    public void add(Object element) {
        if(this.head == null) {
            ListNode node = new ListNode(element);
            this.head = node;
            this.tail = node;
        } else {
            ListNode node = new ListNode(element, tail);
            this.tail.nextNode = node;
            this.tail = node;
        }        
    }
    
    public int size() {
        if (this.head == null) {
            return 0;
        }
        
        int counter = 1;
        ListNode node = this.head;
        while (node.nextNode != null) {
            counter++;
            node = node.nextNode;
        }
        
        return counter;
    }
    
    public Object get(int index) {
        ListNode node = getNode(index);
        
        return node.value;
    }
    

    public void remove(int index) {
        ListNode nodeToRemove = this.getNode(index);
        ListNode previousNode = nodeToRemove.previousNode;
        ListNode nextNode = nodeToRemove.nextNode;
        if (previousNode == null) {
            this.head = nextNode;
            this.head.previousNode = null;
        } else {
            previousNode.nextNode = nextNode;
            if (nextNode != null) {
                nextNode.previousNode = previousNode;
            }
        }    
        
        if (tail == nodeToRemove) {
            tail = previousNode;
        }
    }   
    
    public Object getHead() {
        return this.head.value;
    }
    
    public Object getTail() {
        return this.tail.value;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        ListNode node = this.head;
        while (node != null) {
            output.append(node.value.toString() + " ");
            node = node.nextNode;
        }
        
        return output.toString();
    }

    private ListNode getNode(int index) {
        if (this.head == null || index < 0) {
            throw new IndexOutOfBoundsException("No such index");
        }
        
        ListNode node = this.head;
        
        for (int i = 0; i < index; i++) {
            node = node.nextNode;
            if (node == null) {
                throw new IndexOutOfBoundsException("No such index");
            }
        }
        
        return node;
    }

    @Override
    public void push(Object element) {
        this.add(element);
        
    }

    @Override
    public Object peak() {
        return this.getTail();
    }

    @Override
    public Object pop() {
        Object output = this.getTail();
        this.remove(this.size() - 1);
        return output;
    }

    @Override
    public int length() {
        return this.size();
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }
}