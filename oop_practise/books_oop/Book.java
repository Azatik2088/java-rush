package oop_practise.books_oop;

public class Book {
    private final String title;
    private final String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;        
        this.isAvailable = true;

        if (year < 0 || year > 2025 ) {
            System.out.println("Ошибка: год должен быть от 0 до 2025. Установлено значение 0.");
            this.year = 0;
        } else {
            this.year = year;
        }
    }


    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public boolean isAvailable() {
        return isAvailable;
    }


    public void setYear(int year) {
        if (year > 2025 || year < 0) {
            System.out.println("Нельзя добавить книгу с таким годом");
            return;
        }
        this.year = year;
    }


    public void borrow() {
        if (isAvailable) {
            System.out.println("Книга " + title + " выдана");
            isAvailable = false;
        }
        else {
            System.out.println("Книга " + title + " уже выдана");
        }
    }


    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Книга \"" + title + "\" возвращена. Спасибо!");
        } else {
            System.out.println("Книга \"" + title + "\" уже в библиотеке.");
        }  
    }


   public void displayInfo() {
        String status = isAvailable ? "доступна" : "выдана";
        System.out.printf("Название: %s | Автор: %s | Год: %d | Статус: %s%n",
                          title, author, year, status);
    }
}
