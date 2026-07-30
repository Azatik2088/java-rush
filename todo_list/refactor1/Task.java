package todo_list.refactor1;

public class Task {
    private final String description;
    private boolean isDone;

    //constructor
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }


    //setter
    public void setDone(boolean done){
        isDone = done;
    }

    //getters
    public String getDescription(){
        return description;
    }

    public boolean isDone(){
        return isDone;
    }


    //method to change status of task
    public void markDone(){
        isDone = !isDone;
    }


    //print task
    @Override
    public String toString(){
        if (isDone) return "[X] " + description;
        else return "[ ] " + description;
    }
}
