public abstract class Electronics extends Item {

    //måske tilføje Kit Level som enum

    public Electronics(String title, int loanDays) {
        super(title, loanDays);
    }

    @Override
    public abstract void fee();

}
