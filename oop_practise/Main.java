package oop_practise;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();

        bmw.brand = "BMW";
        bmw.year = 2020;
        
        bmw.start();
        bmw.accelerate(20);
        bmw.getInfo(); 

        audi.brand = "Audi";
        audi.year = 2021;
        
        audi.start();
        audi.accelerate(30);
        audi.getInfo();   
    }
}
