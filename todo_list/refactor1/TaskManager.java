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

    //setter
    public void setTasks(List<Task> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    //method to add task
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Задача успешно добавлена");
    }


    //print tasks
    public void showTasks() {
        if (isListEmpty()) {
            System.out.println("Список задач пуст, добавьте задачи");
        } else {
            System.out.println("Вот ваш список задач :)");
            int count = 1;
            for (Task task : tasks) {
                System.out.printf("%d. %s%n", count++, task);
            }
        }
    }


    //method to delete task
    public void deleteTask(int index) {
        if (isListEmpty()) {
            System.out.println("Список задач пуст, удалять нечего");
            return;
        }
        checkIndex(index);

        tasks.remove(index - 1);
        System.out.println("Задача успешно удалена!");
    }


    //сделать задачу выполненной
    public void markDone(int index) {
        if (isListEmpty()) {
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


    private boolean isListEmpty() {
        return tasks.isEmpty();
    }
}
