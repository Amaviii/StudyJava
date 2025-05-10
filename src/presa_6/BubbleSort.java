package presa_6;

public class BubbleSort {
    public static void main(String[] args){
        int[] array = {10, 7, 8, 9, 1, 5};
        bubbleSort(array);
        for (int number : array) {
            System.out.print(number + " ");
        }
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Внешний цикл - количество проходов
        for (int i = 0; i < n - 1; i++) {
            // Внутренний цикл - сравнение соседних элементов
            for (int j = 0; j < n - i - 1; j++) {
                // Если текущий элемент больше следующего
                if (arr[j] > arr[j + 1]) {
                    // Меняем местами элементы
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
