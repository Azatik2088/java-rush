package oop_practise.figures_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>(Arrays.asList(
                new Circle("Круг", 5),
                new Rectangle("Прямоугольник", 10, 5),
                new Triangle("Треугольник", 3, 4, 5)
        ));
        Collections.sort(figures);

        for (Figure figure: figures) {
            figure.displayInfo();
        }
    }
}
