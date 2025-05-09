package presa_4;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = rev(str);
        System.out.println(result);
    }

    public static String rev(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            sb.append(c);
        }


        return sb.toString();
    }

}
