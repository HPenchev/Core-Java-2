package tasks;

public class GoOutTask extends Task {
    public GoOutTask() {
        super();        
    }

    public GoOutTask(float timeRequired) {
        super(timeRequired);        
    }

    public GoOutTask(int priority, float timeRequired) {
        super(priority, timeRequired);        
    }

    public GoOutTask(int priority) {
        super(priority);        
    }
}