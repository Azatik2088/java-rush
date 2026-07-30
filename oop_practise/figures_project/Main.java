package oop_practise.figures_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        try {
            Circle circle = new Circle("Круг", 5);
            figures.add(circle);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            Rectangle circle = new Rectangle("Прямоугольник", 5, 6);
            figures.add(circle);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            Triangle circle = new Triangle("Треугольник", 5, 6, 7);
            figures.add(circle);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        if(!figures.isEmpty()) {
            Collections.sort(figures);
            System.out.println("Корректные фигуры");
            figures.forEach(el -> el.displayInfo());
        } else {
            System.out.println("Список фигур пуст, выводить нечего");
        }

    }
}
