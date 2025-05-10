package presa_5;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (numbers[i] != numbers[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Массив является палиндромом");
        } else {
            System.out.println("Массив не является палиндромом");
        }

        scanner.close();
    }
}
