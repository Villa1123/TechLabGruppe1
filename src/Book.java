public class Book extends Item {

    private String author;
        public Book(String title, int loanDays, String author) {
            super(title, loanDays);
            this.author = author;
        }
        @Override
        public String toString() {
            return "Book 📚 | " + super.toString() + " | Author: " + author;
        }
        }

