public abstract class Item {

        private String title;
        private int loanDays;

        // Constructor
        public Item(String title, int loanDay) {
            this.title = title;
            this.loanDays = loanDays;
        }

        // Getter
        public String getTitle() {
            return title;
        }

        public int getLoanDays() {
            return loanDays;
        }

        // Setter
        public void setTitle(String title) {
            this.title = title;
        }

        public void setLoanDays(int loanDays) {
            this.loanDays = loanDays;
        }

        // Polymorphic method (VERY important)
        public abstract void useProduct();

        @Override
        public String toString() {
            return "Type: " + title + " | Loan Days: " + loanDays;
        }
    }


