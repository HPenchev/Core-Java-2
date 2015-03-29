package pair;

public class Pair {
    private Object firstObject;
    private Object secondObject;   
    
    public Pair(Object firstObject, Object secondObject) {
        setFirstObject(firstObject);
        setSecondObject(secondObject);
    }

    public Object getFirstObject() {
        return firstObject;
    }
    
    private void setFirstObject(Object firstObject) {
        this.firstObject = firstObject;
    }
    
    public Object getSecondObject() {
        return secondObject;
    }
    
    private void setSecondObject(Object secondObject) {
        this.secondObject = secondObject;
    }

    @Override
    public String toString() {
        String output = "First object: " + this.getFirstObject().toString() + "/n" +
                "Second Object" + this.getSecondObject().toString();
        return output;
    }

    @Override
    public boolean equals(Object obj) {   
        if (!(obj instanceof Pair)) {
            return false;
        }
        
        Pair pair = (Pair) obj;
        return this.getFirstObject().equals(pair.getFirstObject()) && 
                this.getSecondObject().equals(pair.getSecondObject());
    }   
}