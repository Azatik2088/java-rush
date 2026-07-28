package oop_practise.ZOO;

public class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        checkAge(age);
        this.name = name;
        this.age = age;
    }


    //геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void makeSound() {
        System.out.println("Животное издает звук");
    }


    public void displayInfo() {
        System.out.printf("Имя: %s Возраст: %d", name, age);
    }


    private  void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(
                    "Возраст животного не может быть отрицательным"
            );
        }
    }

}
