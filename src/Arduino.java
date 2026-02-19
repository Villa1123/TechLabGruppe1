public class Arduino extends Electronics {

    private String kitLevel;

    public Arduino(String title, int loanDays, String kitLevel) {
        super(title, loanDays);
        this.kitLevel = kitLevel;
    }

    public void kitLevel(String level) {
        if (level.equals("beginner")) {
            System.out.println("Base level: 400");
        }
        else if (level.equals("advanced")) {
            System.out.println("Base level: 500");
        } else{
            System.out.println("Unknown item");
        }
    }

    @Override
    public String toString() {
        return "Arduino 🤖 | " + super.toString() + " | Kit level: " + kitLevel;
    }
}

