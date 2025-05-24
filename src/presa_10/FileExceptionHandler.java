package presa_10;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionHandler {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        FileReader fl = null;
        try {
            fl = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Выброс " + e);
        } finally {
            if (fl != null) {
                fl.close();
            }
        }
    }
}
