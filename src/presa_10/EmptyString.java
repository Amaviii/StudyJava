package presa_10;


import java.util.Scanner;

public class EmptyString {
    public static void inputString(String string) throws IllegalArgumentException {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("Строка пуста. Ничего небыло введено");
        }
        System.out.println("Введена строка: " + string);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        try {
            inputString(string);
        } catch (IllegalArgumentException e) {
            System.out.println("Выброс " + e);
        }
    }
}
