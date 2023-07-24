public class Main {
    public static void main(String[] args) {
        Fictionbook fictionbook = new Fictionbook("Fiction Title", "Fiction Author", 2023, "Adventure");
        Nonfictionbook nonfictionbook = new Nonfictionbook("Non-Fiction Title", "Non-Fiction Author", 2022, "History");
        Referencebook referencebook = new Referencebook("Reference Title", "Reference Author", 2021, "Science");
        Magazine magazine = new Magazine("Magazine Title", "Magazine Publisher", 2023, "July 2023");

        fictionbook.displayDetails();
        System.out.println();
        nonfictionbook.displayDetails();
        System.out.println();
        referencebook.displayDetails();
        System.out.println();
        magazine.displayDetails();
    }
}
