package oop_practise.books_oop;

public class AudioBook extends Book {
    private final double duration;

    public AudioBook(String title, String author, int year, double duration) {
        super(title, author,year);
        this.duration = duration;
    }


    public double getDuration() {
        return duration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Длительность аудиокниги: " + duration);
    }
}
