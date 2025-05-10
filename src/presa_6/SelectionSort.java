package presa_6;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        selectionSort(array);
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Находим минимальный элемент в неотсортированной части
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Меняем найденный минимальный элемент с первым элементом
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
