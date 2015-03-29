package stack;

import contracts.Stack;

public class StackImpl implements Stack{
    private static final int DEFAULT_STACK_SIZE = 8;
    
    private int position = -1;
    protected Object[] elements = new Object[DEFAULT_STACK_SIZE];  
    
    public void push(Object element) {
        if (this.position == this.elements.length - 1) {
            this.resize();
        }
        
        position ++;
        this.elements[this.position] = element;        
    }
    
    public Object peak() {
        if (this.position < 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.elements[this.position];
    }
    
    public Object pop() {
        Object object = this.peak();
        this.position--;
        return object;
    }
    
    public int length() {
        return this.position + 1;
    }
    
    public void clear() {
        this.position = -1;
    }
    
    public boolean isEmpty() {
        return this.position < 0;
    }
    
    private void resize() {
        Object[] elementsResized = new Object[elements.length * 2];
        for (int i = 0; i < this.elements.length; i++) {
            elementsResized[i] = this.elements[i];
        }
        
        this.elements = elementsResized;
    }
}
