public class Books extends Item {

        public Books(String title, int loanDays) {
            super(title, loanDays);
        }
        @Override
        public String toString() {
            return "Book 📚 | " + super.toString();
        }
        }

