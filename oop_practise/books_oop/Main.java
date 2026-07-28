package oop_practise.books_oop;

import java.io.*;
import java.util.Scanner;

public class Main {
    void main() {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String fileName = "library.txt";
        library.loadFile(fileName);

        while (true) {
            printStartMenu();
            int choice = getValidInputForMenu(scanner);
            switch (choice) {
                case 1:
                    if (library.checkEmptyLibrary()) {
                        System.out.println("Библиотека пуста");
                    } else {
                        System.out.println("Наши книги:");
                        library.showAllBooks();
                    }

                    break;
                case 2:
                    System.out.println("Введите название книги: ");
                    String title = scanner.nextLine();

                    System.out.println("Введите автора: ");
                    String author = scanner.nextLine();

                    System.out.println("Введите год издания: ");
                    int year = getValidIntegerValue(scanner);

                    Book book = new Book(title, author, year);
                    library.addBook(book);
                    System.out.println("Книга успешно добавлена!");
                    break;
                case 3:
                    System.out.println("Введите название книги: ");
                    String bookToBorrow = scanner.nextLine();

                    library.borrowBook(bookToBorrow);
                    break;
                case 4:
                    System.out.println("Введите название книги: ");
                    String bookToReturn = scanner.nextLine();

                    library.returnBook(bookToReturn);
                    break;
                case 5:
                    System.out.println("Введите название книги, которую хотите найти: ");
                    String bookToFind = scanner.nextLine();

                    Book findBook = library.findBookByTitle(bookToFind);
                    if (findBook != null) {
                        findBook.displayInfo();
                    } else {
                        System.out.println("Книги с таким названием нет в библиотеке");
                    }
                    break;
                case 6:
                    library.saveToFile(fileName);
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                    break;
            }
            System.out.println();
        }
    }

    public static void printStartMenu() {
        System.out.println("1. Показать все книги");
        System.out.println("2. Добавить книгу");
        System.out.println("3. Взять книгу");
        System.out.println("4. Вернуть книгу");
        System.out.println("5. Найти книгу");
        System.out.println("6. Сохранить библиотеку в файл");
        System.out.println("7. Выйти");
        System.out.print("Выберите действие: ");
    }


    public static int getValidInputForMenu(Scanner scanner) {
        while (true) {

            int choice = getValidIntegerValue(scanner);

            if (choice < 1 || choice > 7) {
                System.out.println("Число от 1 до 7  должно быть, ишак)");
                continue;
            }
            return choice;

        }
    }


    public static int getValidIntegerValue(Scanner scanner) {
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
