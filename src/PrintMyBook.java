public class PrintMyBook extends Book{
    public static void main(String[] args) {
Book book = new PrintMyBook();
book.getDetails("Harry Potter", "J K Rowling", 356.90);
        book.details();
    }

    @Override
    void getDetails(String name, String author, double price) {
        System.out.println(name +", "+author+", "+ price);
    }

    @Override
    void details() {
        System.out.println("hi");
    }
}
