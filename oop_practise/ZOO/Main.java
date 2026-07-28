package oop_practise.ZOO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(Arrays.asList(
                new Dog("Шарик", 2, "Хаски"),
                new Cat("Мурзик", 3),
                new Parrot("Галандски", 4, true)
        ));

        animals.forEach(animal -> {
            animal.displayInfo();
            animal.makeSound();

            if (animal instanceof Parrot parrot) {
                parrot.fly();
            }
        });

    }
}
