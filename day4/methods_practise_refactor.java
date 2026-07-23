package day4;

import java.util.Scanner;

public class methods_practise_refactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три оценки");
        double[] marks = new double[3];

        for (int i = 0; i < marks.length; i++)
            marks[i] = getValidatedMark(scanner);

        System.out.println("Средний балл: " + getGrade(marks));

        scanner.close();
    }

    public static String getGrade(double[] marks) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++)
            sum += marks[i];        

        double average = sum / marks.length;
        
        if (average >= 4.5) return "Отлично";
        if (average >= 3.5) return "Хорошо";
        if (average >= 2.5) return "Удовлетворительно";
        return "Неудовлетворительно";
    }

    public static double getValidatedMark(Scanner scanner) {
        while (true) {
            System.out.print("Ваша оценка: ");
            
            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка! Введите оценку в виде числа");
                scanner.next();
                continue;
            }
            
            double number = scanner.nextDouble();

            if (number < 1 || number > 5) {
                System.out.println("Оценка должна быть от 1 до 5!");
                continue;
            }   
            return number;
        }
    }
}