package oop_practise.figures_project;

public abstract class Figure implements Comparable<Figure> {
    private String name;
    public Figure(String name) {
        this.name = name;
    }


    //getter
    public String getName() {
        return name;
    }


   public abstract double getArea();
   public abstract double getPerimeter();


    public void displayInfo() {
        System.out.printf("%s: площадь %.2f, периметр %.2f%n", name, getArea(), getPerimeter());
    }


    public boolean isValidSide(double side) {
        return side > 0;
    }


    @Override
    public int compareTo(Figure other) {
        return Double.compare(other.getArea(), this.getArea());
    }
}
