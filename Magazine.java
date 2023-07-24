public class Magazine extends Book {
    private String issue;
    private String publisher;

    public Magazine(String title, String author, int yearPublished, String issue, String publisher) {
        super(title, author, yearPublished);
        this.issue = issue;
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue: " + issue);
        System.out.println("Publisher: " + publisher);
    
    
    }
    }

