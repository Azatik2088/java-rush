package todo_list.refactor1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static void saveTasks(List<Task> tasks, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            for (Task task: tasks) {
                    String line = String.format("%s|%b",
                            task.getDescription(),
                            task.isDone());
                    writer.write(line);
                    writer.newLine();
            }
            System.out.println("Ваш список задач сохранен в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении: " + e.getMessage());
        }
    }


    public static List<Task> loadTasks(String filename) {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if ((parts.length == 2)) {
                    String description = parts[0];
                    boolean isDone = Boolean.parseBoolean(parts[1]);

                    Task task = new Task(description);
                    task.setDone(isDone);
                    tasks.add(task);
                }
            }
            return tasks;
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }
}
