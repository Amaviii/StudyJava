package presa_5;

public class MaxMin {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 5, 7, 2, 6, 9, 8};
        int max = array[0];
        int maxInd = 0;
        int min = array[0];
        int minInd = 0;

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxInd = i;
            }
            if (min > array[i]) {
                min = array[i];
                minInd = i;
            }
        }
        System.out.printf("Максимальное число: %d \nЕго индекс: %d\n", max, maxInd);
        System.out.printf("Минимальное число: %d \nЕго индекс: %d", min, minInd);
    }
}
