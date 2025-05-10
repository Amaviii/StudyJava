package presa_6;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемет массива [i]: ");
            array[i] = scanner.nextInt();
        }
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                }
            }
        }
    }


}
