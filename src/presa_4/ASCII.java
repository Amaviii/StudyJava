package presa_4;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        System.out.print("Введите символ: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        while (str.length() != 1) {
            System.out.println("Введите символ а не строку: ");

        }
        int ascii = (int) str.charAt(0);

        System.out.println(ascii);

    }

}
