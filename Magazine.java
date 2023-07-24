public class Magazine extends Book {
    private String issue;

    public Magazine(String title, String author, int yearPublished, String issue) {
        super(title, author, yearPublished);
        this.issue = issue;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue: " + issue);
    }
}
