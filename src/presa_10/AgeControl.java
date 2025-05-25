package presa_10;

import java.util.Scanner;

class TooYoungException extends Exception {
    private int detail;

    public TooYoungException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "TooYoungException{"
                + "detail=" + detail
                + ", message=" + getMessage()
                + "} ";
    }
}


public class AgeControl {
    static void isAdult(int age) throws TooYoungException {
        if (age < 18) {
            throw new TooYoungException(age, "Меньше 18 лет");
        }
        System.out.println("Проверка пройдена");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {
            isAdult(age);
        } catch (TooYoungException e) {
            System.out.println("Перевачено исключение " + e);
        }
    }
}
