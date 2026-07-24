package todo_list;

import java.util.Scanner;

public class todo_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printStartMenu();
            int choice = getValidChoise(scanner);
            break;
        }

        scanner.close();
        
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

            if (choice < 1 || choice > 4) {
                System.out.println("Число от 1 до 4 должно быть, ишак)");
                continue;
            } 

            return choice;
        }
    }
}