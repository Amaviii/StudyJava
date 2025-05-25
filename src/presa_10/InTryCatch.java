package presa_10;


public class InTryCatch {
    public static void main(String[] args) {
        int[] numbers = {40, 25, 15, 76};
        int[] divisors = {2, 0, 3, 5} ;

        try {
            for (int i = 0; i < numbers.length; i++) {
                try {
                    System.out.println("Результат деления " + numbers[i] / divisors[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Выброс " + e);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выброс " + e);
        }
    }
}
