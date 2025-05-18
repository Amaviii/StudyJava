package presa_10;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        int[] array = {1, 2 , 3 , 5};

        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выброс " + e);
        }
    }
}
