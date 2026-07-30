package oop_practise.figures_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        addFigureSafely(figures, () -> new Circle("Круг", 5));
        addFigureSafely(figures, () -> new Rectangle("Прямоугольник", 5, 6));
        addFigureSafely(figures, () -> new Triangle("Треугольник", 5, 6, 7));

        printAnswer(figures);
    }


    private static void addFigureSafely(List<Figure> figures, Supplier<Figure> figureSupplier) {
        try {
            Figure figure = figureSupplier.get();
            figures.add(figure);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


    private static void printAnswer(List<Figure> figures) {
        if(!figures.isEmpty()) {
            Collections.sort(figures);

            System.out.println("Корректные фигуры");
            figures.forEach(Figure::displayInfo);
        } else {
            System.out.println("Список фигур пуст, выводить нечего");
        }
    }
}
