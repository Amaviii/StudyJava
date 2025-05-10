package presa_6;
import java.util.Arrays;
import java.util.Scanner;

public class WorngDelIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите элемент массива с индексом [%d]", i);
            numbers[i] = scanner.nextInt();
        }
        delDuplicateAndSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] delDuplicateAndSort(int[] array) {
        if (array.length == 0) return array;
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        int uniqueCount = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        result[0] = array[0];
        int index = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                result[index++] = array[i];
            }
        }

        return result;
    }
}
