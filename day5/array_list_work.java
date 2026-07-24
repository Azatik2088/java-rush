package day5;

import java.util.ArrayList;

public class array_list_work {
    public static void main(String[] args) {
        int countOfNumbers = 10;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < countOfNumbers; i++) {
            numbers.add(i + 1);
        }

        System.out.println(numbers);

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > 5) {
                numbers.remove(i);
            }
        }
        
        System.out.println(numbers);
    }
}