package oop_practise.figures_project;

public class Triangle extends Figure {
    private final double slideA, slideB, slideC;

    public Triangle(String name, double slideA, double slideB, double slideC) {
        super(name);

        if (!isValidSide(slideA) || !isValidSide(slideB) || !isValidSide(slideC)) {
            throw new IllegalArgumentException(
                    "Стороны треугольника должны быть положительными числами"
            );
        }
        if (!isTriangleExist(slideA, slideB, slideC)) {
            throw new IllegalArgumentException(
                    String.format("Треугольник со сторонами %.2f, %.2f, %.2f не существует",
                            slideA, slideB, slideC)
            );
        }

        this.slideA = slideA;
        this.slideB = slideB;
        this.slideC = slideC;
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter *
                (semiPerimeter - slideA) *
                (semiPerimeter - slideB) *
                (semiPerimeter - slideC));
    }

    @Override
    public double getPerimeter() {
        return slideA + slideB + slideC;
    }

    // Метод принимает параметры, а не использует поля
    private static boolean isTriangleExist(double a, double b, double c) {
        return a + b > c &&
                a + c > b &&
                b + c > a;
    }
}