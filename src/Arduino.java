public class Arduino extends Electronics {

    private String kitLevel;
    private int baseValue;

    public Arduino(String title, int loanDays, String kitLevel, int baseValue) {
        super(title, loanDays);
        this.kitLevel = kitLevel;
        this.baseValue = baseValue;
    }

    @Override
    public void fee() {
        System.out.println("Late fee per day for " + getTitle() + ": 20kr.");
    }

    @Override
    public String toString() {
        return "Type: Electronics 🤖 | " + super.toString() + " | Kit level: " + kitLevel + " | Base value: " + baseValue;
    }
}
