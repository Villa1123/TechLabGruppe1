public class Book extends Item {

    private String author;

    public Book(String title, int loanDays, String author) {
        super(title, loanDays);
        this.author = author;
    }

    @Override
    public void fee() {
        System.out.println("Late fee per late day for " + getTitle() + ": 1.5kr.");

    }

    @Override
    public String toString() {
        return "Type: Book 📚 | " + super.toString() + " | Author: " + author;
    }
}

