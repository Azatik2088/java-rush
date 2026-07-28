package oop_practise.ZOO;

public class Cat extends Dog{
    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }


    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}
