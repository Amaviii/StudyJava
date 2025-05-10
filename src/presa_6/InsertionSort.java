package presa_6;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        insertionSort(array);
        for (int number : array) {
            System.out.print(number + " ");
        }
    }





    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Текущий элемент, который нужно вставить
            int j = i - 1;

            // Сдвигаем элементы arr[0..i-1], которые больше key,
            // на одну позицию вперед
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;  // Вставляем key в правильную позицию
        }
    }
}

