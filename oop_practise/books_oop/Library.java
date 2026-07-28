package oop_practise.books_oop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();


    //добавить книгу в бибтиотеку
    public void addBook(Book book) {
        books.add(book);
    }


    //показать весь список книг
    public void showAllBooks() {
        if (!checkEmptyLibrary()) {
            for (Book book : books) {
                book.displayInfo();
            }
        }
    }


    //поиск книги в библиотеке по названию
    public Book findBookByTitle(String title) {
        if (!checkEmptyLibrary()) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
        }
        return null;
    }


    //метод, чтобы взять книгу из библиотеки
    public void borrowBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.borrow();
        } else {
            System.out.println("Книга \"" + title + "\" не найдена в библиотеке.");
        }
    }


    //метод чтобы вернуть книгу в библиотеку
    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Такой книги нет в библиотеке");
        }
    }


    //проверка библиотеки на пустоту
    public boolean checkEmptyLibrary() {
        return books.isEmpty();
    }


    public void saveToFile(String fileName) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for(Book book : books) {
                writer.write(book.getTitle() + "|" +
                                book.getAuthor() + "|" +
                                book.getYear() + "|" +
                                book.isAvailable());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении: " + e.getMessage());
        }
    }


    public void loadFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                String title = parts[0];
                String author = parts[1];
                int year = Integer.parseInt(parts[2]);
                boolean available = Boolean.parseBoolean(parts[3]);

                Book book = new Book(title, author, year);

                if(!available) {
                    book.borrow();
                }
                books.add(book);
            }
        } catch (IOException e) {
            System.out.println("Файл не найден или пуст.");
        }
    }
}
