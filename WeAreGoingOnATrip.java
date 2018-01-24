
public class WeAreGoingOnATrip {
   final int HEIGHT = 12;
   String line = "";

   public WeAreGoingOnATrip() {

   }

   public String top() {
      line = "";
      for (int x = 1; x < HEIGHT * 2; x++) {
         for (int spaces = HEIGHT
               * 2; spaces > x; spaces--) {
            line = line + " ";
         }
         for (int leftSlash = 0; leftSlash < x; leftSlash++) {
            line = line + "/";
         }
         line = line + "**";
         for (int rightSlash = 0; rightSlash < x; rightSlash++) {
            line = line + "\\";
         }
         line = line + "\n";
      }
      return line;
   }

   public String addLineThing() {
      line = "";
      for (int x = 0; x < HEIGHT * 2; x++) {
         line = line + "=*";
      }
      line = "+" + line + "+" + "\n";
      return line;
   }

   public String middle1() {
      line = "";
      for (int x = 1; x < HEIGHT + 1; x++) {
         line = line + "|";
         for (int i = 0; i < 2; i++) {
            for (int period = HEIGHT; period > x; period--) {
               line = line + ".";
            }
            for (int cone = 0; cone < x; cone++) {
               line = line + "/\\";
            }
            for (int period2 = HEIGHT; period2 > x; period2--) {
               line = line + ".";
            }
         }
         line = line + "|" + "\n";
      }
      return line;
   }
   
   public String middle2() {
      line = "";
      for (int x = 1; x < HEIGHT + 1; x++) {
         line = line + "|";
         for (int i = 0; i < 2; i++) {
            for (int period = 1; period < x; period++) {
               line = line + ".";
            }
            for (int cone = HEIGHT+1; cone > x; cone--) {
               line = line + "\\/";
            }
            for (int period = 1; period < x; period++) {
               line = line + ".";
            }
         }
         line = line + "|" + "\n";
      }
      return line;
   }

   public String rocket() {
      return top() + addLineThing() + middle1()
            + middle2() + addLineThing()
            + middle2() + middle1()
            + addLineThing() + top();

   }
}
