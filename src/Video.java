  public class Video extends Item {

     private int duration;


     public Video(String title, int loanDays, int duration) {
         super(title, loanDays);
         this.duration = duration;
     }

     @Override
     public String toString() {
         return "Video| " + super.toString() + "|Duration" + duration;


     }
 }
