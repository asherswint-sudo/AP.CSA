package AfterTest;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);

        PictureBook book3 = new PictureBook("A", "B", "C");
        myLibrary.add(book3);

        System.out.println("Individual book prints:");
        book1.printBookInfo(); System.out.println();
        book2.printBookInfo(); System.out.println();     
        
        System.out.println("BookListing prints:");
        BookListing listing1 = new BookListing(book1, 9.99);
        BookListing listing2 = new BookListing(book2, 12.50);
        listing1.printDescription(); System.out.println();
        listing2.printDescription(); System.out.println();

        System.out.println("Iterate through myLibrary:");
        for (Book b : myLibrary) {
            b.printBookInfo();
            System.out.println();
        }
    }
}
