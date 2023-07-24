public class Referencebook extends Book {
    private String department;

    public Referencebook(String title, String author, int yearPublished, String department) {
        super(title, author, yearPublished);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
