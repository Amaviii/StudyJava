import java.util.Scanner;

public class Builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<3; i++) {
            String str = scanner.nextLine();
            sb.append(str);
            if (i != 2) {
                sb.append(' ');
            }
        }

        System.out.println(sb);
    }
}