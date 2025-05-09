package presa_4;

public class ToUpper{
    public static void main(String[] args) {
        String text = "Hello 123";

        for (int i = 0; i<text.length(); i++) {
            char c = text.charAt(i); // Получаем текущий символ

            if (c >= 'a' && c <= 'z') {
                char k = (char) (c - 32);
                System.out.print(k);
            } else {
                System.out.print(c);
            }


        }




    }

}