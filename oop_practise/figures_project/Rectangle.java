package oop_practise.figures_project;

public class Rectangle extends Figure{
    private final double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        if (isValidSide(width) && isValidSide(height)) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Ширина и высота должны быть больше 0, установлено дефолтное значение 1");
            this.width = 1;
            this.height = 1;
        }
    }


    @Override
    public double getArea() {
        return width * height;
    }


    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
