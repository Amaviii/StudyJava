package presa_5;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][3];
        int sum = 0;

        System.out.println("Введите элементы матрицы 2х3:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++){
                System.out.printf("Элемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }

}
