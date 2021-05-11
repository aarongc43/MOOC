public class Timer2 {
    
       private ClockHand hundredths;
       private ClockHand seconds;

       public Timer2() {
            this.hundredths = new ClockHand(100);
            this.seconds = new ClockHand(60);
       }

       public void advance() {
            this.hundredths.advance();

            if (this.hundredths.value() == 0) {
                this.seconds.advance();
            }
       }

        public String toString() {
            return seconds + ":" + hundredths;
        }

}
