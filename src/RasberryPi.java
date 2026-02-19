public class RasberryPi extends Electronics{

    private String rModel;

    public Arduino(String title, int loanDays, String model) {
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
    public String toString() {
        return "RasberryPi  | " + super.toString() + " | Model: " + rModel;
    }
}
