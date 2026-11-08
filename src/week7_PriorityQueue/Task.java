package week7_PriorityQueue;

public class Task {
    String description;
    int priority;
    
    public Task(String desc, int prio) {
        this.description = desc;
        this.priority = prio;
    }
    
    @Override
    public String toString() {
        return "[Priority " + priority + "] " + description;
    }
    
}
