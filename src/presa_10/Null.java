package presa_10;

public class Null {
    public static void main(String[] args) {
        String name = null;
        try {
            name.length();
        } catch (NullPointerException e) {
            System.out.println("Выброс " + e);
        }

    }
}
