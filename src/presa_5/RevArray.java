package presa_5;
import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите элемент массива [%d]: ", i);
            numbers[i] = scanner.nextInt();
        }
        int[] result = new int[n];
        for (int i = numbers.length - 1; i >= 0; i--) {
            result[i] = numbers[n - 1 - i];
        }
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
