// Timer class based on Clock class
// Timer has two hands: one for hundredths of a second, one for seconds
// As it progresses, the number of hundredths of a second grows by one
// When hundredth hand reaches 100 it resets to zero and second hand increases by one
// When second hand reaches 60 its value is set to zero

public class Timer {
   private int hundredths;
   private int seconds;
   private int limit;

   public Timer() {
      this.hundredths = 0; 
      this.seconds = 0;
      this.limit = 100;
   }

   public void advance() {
      this.hundredths++;

      if (this.hundredths >= limit) {
         this.seconds++;
         this.hundredths = 0;

         if (this.seconds >= 60) {
            this.seconds = 0;
         }
      }
   }

   public int valueTimer() {
      return this.hundredths;
   }

   public String toString() {
      //returns a string of the timer. "seconds:hundredths"
      if (this.seconds < 10) {
         if (this.hundredths < 10) {
            return "0" + this.seconds + ":0" + this.hundredths;
         }
         return "0" +  this.seconds + ":" + this.hundredths;
      }

      if (this.hundredths < 10) {
         return "" + this.seconds + ":0" + this.hundredths;
      }

      return "" + this.seconds + ":" + this.hundredths;
   }
}
