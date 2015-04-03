import java.util.PriorityQueue;

import tasks.Task;

public class ToDoList {
    private float hoursAvailable;
    private PriorityQueue<Task> tasks;
    
    public ToDoList(float hoursAvailable) {
        setHoursAvailable(hoursAvailable);
        this.tasks = new PriorityQueue<Task>();
    }
    
    public float getHoursAvailable() {
        return hoursAvailable;
    }
    
    public void setHoursAvailable(float hoursAvailable) {
        this.hoursAvailable = hoursAvailable;
    }   
    
    public void addTask(Task task) {
        this.tasks.add(task);
    }
    
    public void markFinished(Task task) {
        task.setFinished(true);        
    }
    
    public void markCancelled(Task task) {
        task.setActive(false);
        this.tasks.remove(task);
    }
    
    public Task getTop() {
        return this.tasks.element();
    }
    
    public boolean canFinish() {
        float totalTimeNeeded = getTotalTimeNeeded();       
        
        return totalTimeNeeded <= this.getHoursAvailable();
    }
    

    public float getRemainingTime() {
        return this.getHoursAvailable() - this.getTotalTimeNeeded();
    }

    public float getTotalTimeNeeded() {
        float totalTimeNeeded = 0;
        for (Task task : this.tasks) {
            totalTimeNeeded += task.getTimeRequired();
        }
        
        return totalTimeNeeded;
    }    
}