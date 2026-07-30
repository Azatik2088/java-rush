package todo_list.refactor1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    //constructor
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }


    //getter
    public List<Task> getTasks(){
        return tasks;
    }


    //method to add task
    public void addTask(Task task) {
        tasks.add(task);
    }


    //print tasks
    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст, добавьте задачи");
        } else {
            int count = 1;
            for (Task task : tasks) {
                System.out.printf("%d. %s%n", count++, task);
            }
        }
    }


    //method to delete task
    public void deleteTask(int index) {
        if (isEmpty()) {
            System.out.println("Список задач пуст, удалять нечего");
            return;
        }
        checkIndex(index);

        tasks.remove(index - 1);
        System.out.println("Задача успешно удалена!");
    }


    //сделать зада
    public void markDone(int index) {
        if (isEmpty()) {
            System.out.println("Список задач пуст, удалять нечего");
            return;
        }
        checkIndex(index);

        Task task = tasks.get(index - 1);
        if (!task.isDone()) {
            task.markDone();
            System.out.println("Задача отмечена как выполненная!");
        }
        else {
            System.out.println("Задача уже итак выполнена");
        }

    }


    public int getTasksCount() {
        return tasks.size();
    }


    private void checkIndex(int index){
        if (index < 1 || index > tasks.size()) {
            throw new IllegalArgumentException(
                    "Задачи под таким номером нет в списке!"
            );
        }
    }


    private boolean isEmpty() {
        return tasks.isEmpty();
    }
}
