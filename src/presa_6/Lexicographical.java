package presa_6;
import java.util.Arrays;

public class Lexicographical {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry", "date"};

        bubbleSort(fruits);
        System.out.println(Arrays.toString(fruits));
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - j - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        if (!swapped) break;
        }
    }
}
