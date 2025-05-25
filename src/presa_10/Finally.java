package presa_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Finally {
    public static void main(String[] args) {
        File file = new File("ForFinally");
        Scanner fl = null;

        try {
            fl = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e);
        } finally {
            if (fl != null) {
                fl.close();
            }
        }
    }

}
