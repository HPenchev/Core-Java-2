package stack;


public class InvariantStack extends StackImpl{

    @Override
    public void push(Object element) {
        checkForElement(element);
        super.push(element);
    }
    
    private void checkForElement(Object element) {
        int length = this.length();
        for (int i = 0; i < length; i ++) {
            if (this.elements[i].equals(element)) {
                throw new IllegalStateException("This element already exists in the stack");
            }
        }
    }
}