package AfterTest;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frankesnstein", "Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);
    }
}
