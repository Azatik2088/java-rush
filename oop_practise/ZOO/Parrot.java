package oop_practise.ZOO;

import java.util.Scanner;

public class Parrot extends Animal{
    private boolean canSpeak;

    public Parrot(String name, int age, boolean canSpeak) {
        super(name, age);
        this.canSpeak = canSpeak;
    }


    @Override
    public void makeSound() {
        if (canSpeak) {
            System.out.println("Привет!");
        } else {
            System.out.println("Чирик-чирик");
        }
    }
}
