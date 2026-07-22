package day3;
import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру на улице: ");
        double temperature = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Идет ли дождь на улице: ");
        String isRainy = scanner.nextLine().trim().toLowerCase();

        
        if (!isRainy.equals("да") && !isRainy.equals("нет")) {
            System.out.println("Я не понял что вы ответили");
            scanner.close();
            return;
        }

        if (temperature > 25 && isRainy.equals("нет")) {
            System.out.println("Идите гулять, погода отличная!");
        }
        else if (temperature > 25 && isRainy.equals("да")) {
            System.out.println("Жарко и дождливо. Лучше останьтесь дома с книгой.");
        }
        else if (temperature > 9 && temperature <= 25) {
            System.out.println("Погода норм. Можете гулять, но возьмите кофту.");
        }
        else {
            System.out.println("Холодно! Наденьте пуховик и не сидите долго на улице.");
        }

        scanner.close();
    }
}
