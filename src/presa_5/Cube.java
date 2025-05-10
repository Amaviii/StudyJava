

// Некорректный вывод массива!!!

package presa_5;
import java.util.Arrays;
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] cube = new int [2][2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    cube[i][j][k] = scanner.nextInt();

                }

            }
        }
        System.out.println(Arrays.toString(cube));
    }
}
