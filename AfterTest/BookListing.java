package AfterTest;

public class BookListing{
    private double price;
    private Book test;
    public BookListing(Book b, double p){
        test = b;
        price = p;   
    }
    public void printDescription(){
        test.printBookInfo();
        System.out.print(", $" + price);


    }
    
}
