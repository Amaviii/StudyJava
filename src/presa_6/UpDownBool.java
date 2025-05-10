package presa_6;
import java.util.Scanner;

public class UpDownBool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите true/false: ");
        boolean increasing = scanner.nextBoolean();
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите элемент массива [%d]: ", i);
            numbers[i] = scanner.nextInt();
        }

        if (increasing) {
            increasing(numbers);
            printArray(numbers);
        }
        else {
            decreasing(numbers);
            printArray(numbers);
        }
        scanner.close();
    }

    public static void increasing(int[] array) {
        int n = array.length;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void decreasing(int[] array) {
        int n = array.length;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
