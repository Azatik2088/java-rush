package oop_practise.ZOO;

public class Dog extends Animal{
    private final String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }


    @Override
    public void displayInfo() {
        System.out.printf("Имя: %s Возраст: %d Порода: %s",
                getName(), getAge(), breed);
    }
}
