public class RaspberryPi extends Electronics{

    private String rModel;
    private int baseValue;

    public RaspberryPi(String title, int loanDays, String rModel, int baseValue) {
        super(title, loanDays);
        this.rModel = rModel;
        this.baseValue = baseValue;
    }

    @Override
    public void fee() {
        System.out.println("Late fee per day for " + getTitle() + ": 40kr.");
    }

    @Override
    public String toString() {
        return "Type: Electronics 🤖 | " + super.toString() + " | Model: " + rModel + " | Base value: " + baseValue;
    }
}
