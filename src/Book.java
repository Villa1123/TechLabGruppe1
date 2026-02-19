public class Book extends Item {

        public Book(String title, int loanDays) {
            super(title, loanDays);
        }
        @Override
        public String toString() {
            return "Book 📚 | " + super.toString();
        }
        }

