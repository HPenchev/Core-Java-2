package linkedList;

import contracts.Stack;

public class LinkedStack implements Stack{
    protected class ListNode { 
        protected ListNode(Object value) {
            this.value = value;
        }
        
        protected ListNode(Object value, ListNode previousNode) {
            this(value);
            this.previousNode = previousNode;
        }        
        
        protected Object value;
        protected ListNode previousNode;
        protected ListNode nextNode;
    }
    
    ListNode head;
    ListNode tail;
    
    public LinkedStack() {
        this.head = null;     
        this.tail = null;
    }
    
    @Override
    public void push(Object element) {
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
    
    @Override
    public int length() {
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

    @Override
    public Object peak() {        
        return this.tail.value;        
    }

    @Override
    public Object pop() {
        Object output = this.peak();
        this.remove(this.length() - 1);
        return output;
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
    
    protected void remove(int index) {
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
    
    protected ListNode getNode(int index) {
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
}
