package oop_practise.figures_project;


public class Circle extends Figure{
    private final double radius;

    public Circle(String name, double radius) {
        super(name);
        if (isValidSide(radius)) {
            this.radius = radius;
        } else {
            System.out.println("Радиус должен быть больше 0, установлено дефолтное значение 1");
            this.radius = 1;
        }

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
