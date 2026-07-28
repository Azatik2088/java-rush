package oop_practise.ZOO;

public class Parrot extends Animal implements Flyable{
    private final boolean canSpeak;

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

    @Override
    public void fly() {
        System.out.printf("%s летит", getName());
    }
}
