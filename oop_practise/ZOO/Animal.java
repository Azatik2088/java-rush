package oop_practise.ZOO;

public abstract class Animal implements Soundable {
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

    public abstract void makeSound();


    public void displayInfo() {
        System.out.printf("Имя: %s Возраст: %d%n", name, age);
    }


    private  void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(
                    "Возраст животного не может быть отрицательным"
            );
        }
    }

}
