public class Electronics extends Item {

    private String model;
    private int baseValue;
    //måske tilføje Kit Level som enum

    public Electronics(String title, int loanDays, String model, int baseValue) {
        super(title, loanDays);
        this.model = model;
        this.baseValue = baseValue;
    }


    @Override
    public String toString() {
        return "Electronic | " + super.toString() + " | Model: " + model + " | Base value: ";
    }
}
