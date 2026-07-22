package day3;

import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        System.out.println("Я загадал число от 0 до 20");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(21);
        int answerNumber;
        int counter = 0;

        while (true) {
            System.out.print("Ваше число: ");
            
            while (!scanner.hasNextInt()) { //пробует считать число, если не смог то фолс
                System.out.println("Ошибка! Введите целое число от 0 до 20.");
                scanner.next(); //очистка мусора
                System.out.print("Ваше число: ");
            }
            answerNumber = scanner.nextInt();
            counter++;

            if (answerNumber > randomNumber) {
                System.out.println("Загаданное число меньше");
            }               
            else if (answerNumber < randomNumber) {
                System.out.println("Загаданное число больше");
            }
            else if (answerNumber == randomNumber && counter < 8) {
                System.out.println("Вы отгадали число!");
                scanner.close();
                break;
            }
            else {
                System.out.println("Вы проиграли");
                System.out.println("Загаданное число было: " + randomNumber);
                scanner.close();
                break;
            }
                
        }
    }
}
