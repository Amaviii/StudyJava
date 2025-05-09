package presa_5;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите элемент массива [%d]: ", i);
            numbers[i] = scanner.nextInt();
        }

        int oddCounter = 0;
        int evenCounter = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }

        }
        System.out.printf("Четных чисел: %d\nНечетных чисел: %d", evenCounter, oddCounter);

    }
}
