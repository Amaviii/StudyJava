package presa_10;

public class RecursionClass {
    public static int depth = 0;

    public static void recursionFunc() {
        depth++;
        System.out.println("Спускаемся в глубины");
        recursionFunc();
    }


    public static void main(String[] args) {

        try {
            recursionFunc();

        } catch (StackOverflowError e) {
            System.out.println("Достигнут предел стэка " + depth + " " + e);
        }

    }
}
