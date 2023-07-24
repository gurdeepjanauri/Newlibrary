public class Fictionbook extends Book {
    private String genre;

    public Fictionbook(String title, String author, int yearPublished, String genre) {
        super(title, author, yearPublished);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}
