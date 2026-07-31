package todo_list.refactor1;


import java.util.Scanner;

public class Main {
    private static final String FILENAME = "tasks.txt";
    private static final TaskManager taskManager = new TaskManager();
    private static final Scanner scanner = new Scanner(System.in);

    public static  void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getValidChoise(scanner);
            switch (choice) {
                case 1:
                    taskManager.showTasks();
                    break;
                case 2:
                    System.out.println("Введите описание задачи:");
                    taskManager.addTask(new Task(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Напишите номер задачи, которую вы хотите удалить: ");
                    int indexOfTAsk = getValidIntegerValue(scanner);
                    taskManager.deleteTask(indexOfTAsk);
                    break;
                case 4:
                    System.out.print("Напишите номер задачи, которую вы хотите отметить выполненной: ");
                    int indexToDone = getValidIntegerValue(scanner);
                    taskManager.markDone(indexToDone);
                    break;
                case 5:
                    FileManager.saveTasks(taskManager.getTasks(), FILENAME);
                    break;
                case 6:
                    taskManager.setTasks(FileManager.loadTasks(FILENAME));
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
            System.out.println();
        }
    }


    private static void printMenu(){
        System.out.println("1. Показать задачи");
        System.out.println("2. Добавить задачу");
        System.out.println("3. Удалить задачу");
        System.out.println("4. Отметить выполненной");
        System.out.println("5. Сохранить в файл");
        System.out.println("6. Загрузить из файла");
        System.out.println("7. Выйти");
    }


    private static int getValidChoise(Scanner scanner) {
        while (true) {
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Вы должны ввести целое число");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice < 1 || choice > 7) {
                System.out.println("Числа от 1 до 7 должно быть!)");
                continue;
            }

            return choice;
        }
    }


    private static int getValidIntegerValue(Scanner scanner) {
        while (true){
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Вы должны ввести целое число");
                scanner.next();
                continue;
            }
            int integerInput = scanner.nextInt();
            scanner.nextLine();
            return integerInput;
        }
    }

}
