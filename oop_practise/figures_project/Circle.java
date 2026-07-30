package oop_practise.figures_project;


public class Circle extends Figure{
    private final double radius;

    public Circle(String name, double radius) {
        super(name);

        if (!isValidSide(radius)) {
            throw new IllegalArgumentException(
                    "Радиус должен быть больше 0"
            );
        }
        this.radius = radius;

    }


    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
