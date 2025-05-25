package presa_10;

import java.util.InputMismatchException;
import java.util.Scanner;

class DellException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            try {
                int res =  a/b;
                System.out.println(res);
            } catch (ArithmeticException e) {
                System.out.println("Нельзя делить на ноль: " + e);
            } catch (InputMismatchException e) {
                System.out.println("Нужно вводить число: " + e);
            }
        } catch (InputMismatchException e) {
            System.out.println("Нужно вводить число: " + e);
        }
    }
}


