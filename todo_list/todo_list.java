package todo_list;

import java.util.ArrayList;
import java.util.Scanner;

public class todo_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            printStartMenu();
            int choice = getValidChoise(scanner);
            
            switch (choice) {
                case 1:
                    showTasks(tasks);
                    break;
                case 2:
                    addTask(tasks, scanner);
                    System.out.println("Задача добавлена!");
                    break;
                case 3:
                    deleteTask(tasks, scanner);
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;                                                            
            }
            System.out.println();
        }
    }


    //метод вывода менюшки на экран
    public static void printStartMenu() {
        System.out.println("=== ТУДУ-ЛИСТ ===");
        System.out.println("1. Показать задачи");
        System.out.println("2. Добавить задачу");
        System.out.println("3. Удалить задачу");
        System.out.println("4. Выйти");
        
    }    
    

    //проверка на дурака при выборе пункта меню
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

            if (choice < 1 || choice > 4) {
                System.out.println("Число от 1 до 4 должно быть, ишак)");
                continue;
            } 
            
            return choice;
        }
    }


    //метод для показа списка задач
    public static void showTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty() || tasks == null){
            System.out.println("Список задач пуст");
        }
        else {
            int count = 0;
            for(String task : tasks) {
                System.out.println(++count + ". " + task);
            }
        }
    }


    //методод для добавления задачи
    public static void addTask(ArrayList<String> tasks, Scanner scanner) {
        System.out.print("Введите описание задачи: ");
        String task = scanner.nextLine();        
        tasks.add(task);
    }


    //метод для удаления задачи из списка
    public static void deleteTask(ArrayList<String> tasks, Scanner scanner) {


        if (tasks.isEmpty()){
            System.out.println("Список задач пуст, удалять нечего");
        }
        else {
            System.out.print("Введите номер задачи для удаления: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice < 1 || choice > tasks.size()) {
                System.out.println("Задачи под таким номером нет в списке!");
            }
            else {
                tasks.remove(choice - 1);
                System.out.println("Задача успешно удалена!");
            }
        }

    }
}