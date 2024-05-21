abstract public class Book {
//    Book class which has an abstract method getDetails(),name, author, price.
//
//    PrintMyBook class that inherits from the Book class.
//    asbtract

//    Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
// Output

//"Harry Potter, J.k. Rowling, 100"
//String name;
//String author;
//double price;
    abstract void getDetails(String name, String author, double price);
    abstract void details();
}
