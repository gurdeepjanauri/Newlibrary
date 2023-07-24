public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // You can create instances of the Book class and call methods here, like this:
        Book book1 = new Book("Sample Book", "John Doe", 2023);
        book1.displayDetails();
    }
}
