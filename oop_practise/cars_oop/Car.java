package oop_practise.cars_oop;

public class Car {
    String brand;
    int year;
    int speed;
    boolean isStarted = false;
    
    //заводим тачку
    public void start() {
        isStarted = true;
        System.out.println("Машина " + brand + " завелась");
    }


    //увеличение скорости машинки
    public void accelerate(int delta) {
        if (isStarted && delta > 0) {
            speed += delta;
            System.out.println("Скорость: " + speed + " км/ч");
        } else if (!isStarted) {
            System.out.println("Машину нужно сначала завести");
        } else {
            System.out.println("Ускорение должно быть положительным числом");
        }
    }


    //остановка машинки
    public void stop() {
        isStarted = false;
        speed = 0;
        System.out.println("Машина остановилась");
    } 


    //полная информация о тачке
    public void getInfo() {
        System.out.println("Марка: %s, Год: %d, Скорость: %d км/ч".formatted(brand, year, speed));
    }
}