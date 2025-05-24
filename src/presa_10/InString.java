package presa_10;

import java.util.Scanner;

public class InString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        try {
            Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Выброс " + e);
        }
    }
}
