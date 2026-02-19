public class Electronic extends Item {

    private String author;

    public Electronic(String name, int loanDays, String author) {
        super(name, loanDays);
        this.author = author;
    }


    @Override
    public String toString() {
        return "Electronic | " + super.toString() + " | " + author;
    }
}
