package day5;

import java.util.Scanner;

public class fio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = scanner.nextLine();

        System.out.println("Количество символов: " + name.length());
        String[] name_list = name.split(" ");

        System.out.println("Фамилия: " + name_list[0]);
        System.out.println("Имя: " + name_list[1]);
        System.out.println("Отчество: " + name_list[2]);

        System.out.println("Инициалы: " + name_list[0] + " " + name_list[1].substring(0, 1).toUpperCase()
                         + "." + name_list[2].substring(0, 1).toUpperCase() + ".");

        scanner.close();
    }
}
