package presa_10;

import java.util.Scanner;

public class InvalidAgeException {
    static void correctNumber(int age) throws InvalidCommandException {
        if (age < 0 || age > 120) {
            throw new InvalidCommandException("Возраст не соответствует корректному диапазону");
        }
        System.out.println("Возраст принят");
    }

    public static void main(String[] args) {
        System.out.println("Введите ваш возраст");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        try {
            correctNumber(age);
        } catch (InvalidCommandException e) {
            System.out.println("Выброс " + e);
        }
    }
}