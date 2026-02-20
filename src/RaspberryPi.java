public class RaspberryPi extends Electronics{

    private String rModel;

    public RaspberryPi(String title, int loanDays, String rModel) {
        super(title, loanDays);
        this.rModel = rModel;
    }

    public void rModel(String model) {
        if (model.equals("4B")) {
            System.out.println("Model: 4B");
        }
        else if (model.equals("5")) {
            System.out.println("Model: 5");
        } else{
            System.out.println("Unknown item");
        }
    }

    @Override
    public void fee() {
        System.out.println("Late fee per day for " + getTitle() + ": 40kr.");
    }

    @Override
    public String toString() {
        return "RaspberryPi  | " + super.toString() + " | Model: " + rModel;
    }
}
