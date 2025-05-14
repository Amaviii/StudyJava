package presa_9;

import java.util.ArrayList;
import java.util.List;

interface Book {
    String getTitle();
    String getAuthor();
    int getYear();
    void displayInfo();
}

class PhsicalBook implements Book {
    private final String title;
    private final String author;
    private final int year;
    private final int pagesCount;

    PhsicalBook(String title, String author, int year, int pagesCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pagesCount = pagesCount;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void displayInfo() {
        System.out.printf("|Физическая книга| \nНазвание -> %s \nАвтор -> %s \nГод -> %d \nСтраниц -> %s \n\n", title, author, year, pagesCount);
    }

}


class EBook implements Book {
    private final String title;
    private final String author;
    private final int year;
    private final String fileFormat;

    EBook(String title, String author, int year, String fileFormat) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.fileFormat = fileFormat;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void displayInfo() {
        System.out.printf("|Электронная книга| \nНазвание -> %s \nАвтор -> %s \nГод -> %d \nСтраниц -> %s \n\n", title, author, year, fileFormat);
    }
}

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга: \"" + book.getTitle() + "\" добавлена в библиотеку");
    }

    public void displayAllBooks() {
        System.out.println("\n====================== Список книг в библиотеке ======================\n");

        for (Book book : books) {
            book.displayInfo();
        }

        System.out.println("==================================================================");
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book physicalBook1 = new PhsicalBook("Война и мир", "Лев Толстой", 1869, 1225);
        Book physicalBook2 = new PhsicalBook("1984", "Джордж Оруэлл", 1949, 328);
        Book ebook1 = new EBook("Clean Code", "Robert Martin", 2008, "PDF");
        Book ebook2 = new EBook("Java: Полное руководство", "Герберт Шилдт", 2018, "EPUB");

        System.out.println("\n========================== Добавляем книги ==========================\n");
        library.addBook(physicalBook1);
        library.addBook(physicalBook2);
        library.addBook(ebook1);
        library.addBook(ebook2);

        library.displayAllBooks();

    }
}


