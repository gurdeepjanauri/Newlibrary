public class Nonfictionbook extends Book {
    private String topic;

    public Nonfictionbook(String title, String author, int yearPublished, String topic) {
        super(title, author, yearPublished);
        this.topic = topic;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Topic: " + topic);
    }
}
