package oop_practise.books_oop;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();


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
}
