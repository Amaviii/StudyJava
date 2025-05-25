package presa_10;

import java.util.Scanner;

class CustomLessZero extends Exception {
    public CustomLessZero(String message) {
        super(message);
    }
}

public class CustomLessZeroDemo {
     static void compute(int a) throws CustomLessZero {
        if (a < 0) {
            throw new CustomLessZero("Число меньше нуля");
        }
        System.out.println("Число положительное");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        try {
            compute(number);
        } catch (CustomLessZero e) {
            System.out.println("Выборс " + e);
        }

    }
}