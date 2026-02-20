  public class Video extends Item {

     private int duration;

     public Video(String title, int loanDays, int duration) {
         super(title, loanDays);
         this.duration = duration;
     }

      @Override
      public void fee() {
         System.out.println("Late fee per day for " + getTitle() + ": 3kr.");
      }

     @Override
     public String toString() {
         return "Type: Video | " + super.toString() + "| Duration: " + duration;


     }
 }
