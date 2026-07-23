package day4;
import java.util.Scanner;

public class methods_practise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три оценки:");

        double firstMark = getValidatedMark(scanner);
        double secondMark = getValidatedMark(scanner);
        double thirdMark = getValidatedMark(scanner);

        System.out.println("Средний балл: " + getGrade(firstMark, secondMark, thirdMark));

        scanner.close();
    }

    public static String getGrade(double score1, double score2, double score3) {
        double average = (score1 + score2 + score3) / 3;
        
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
