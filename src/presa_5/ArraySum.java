package presa_5;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int[] arrayOfInt = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int current = scanner.nextInt();
            arrayOfInt[i] = current;

        }
        for (int number:arrayOfInt){
           sum += number;
        }
        System.out.println(sum);
    }
}
