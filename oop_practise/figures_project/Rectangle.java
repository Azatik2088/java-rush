package oop_practise.figures_project;

public class Rectangle extends Figure{
    private final double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);

        if (!isValidSide(width)) {
            throw new IllegalArgumentException(
                    "Ширина должна быть больше 0"
            );
        }
        if (!isValidSide(height)) {
            throw new IllegalArgumentException(
                    "Высота должна быть больше 0"
            );
        }

        this.width = width;
        this.height = height;
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
