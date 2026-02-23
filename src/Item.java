public abstract class Item {

        private String title;
        private int loanDays;

        // Constructor
        public Item(String title, int loanDays) {
            this.title = title;
            this.loanDays = loanDays;
        }

        // Getter method (used to access private attribute)
        public String getTitle() {
            return title;
        }

        public int getLoanDays() {
            return loanDays;
        }

        // Setter (used to change the title if needed)
        public void setTitle(String title) {
            this.title = title;
        }

        // Setter (used to change amount of loan days if needed)
        public void setLoanDays(int loanDays) {
            this.loanDays = loanDays;
        }

        // Abstract methods (implemented in subclasses)
        public abstract void fee();

        @Override
        public String toString() {
            return "Title: " + title + " | Loan Days: " + loanDays;
        }
    }


