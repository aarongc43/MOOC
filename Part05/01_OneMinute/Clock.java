public class Clock {
        //creating new variables in ClockHand method
        private ClockHand hours;
        private ClockHand minutes;
        private ClockHand seconds;

        public Clock() {
           this.hours = new ClockHand(24);
           this.minutes = new ClockHand(60);
           this.seconds = new ClockHand(60);
        }

        // Start Clock along with advance method from ClockHand
        public void advance() {
            this.seconds.advance();

            if (this.seconds.value() == 0) {
                this.minutes.advance();

                if (this.minutes.value() == 0) {
                    this.hours.advance();
                }
            }
        }

        public String toString() {
            return hours + ":" + minutes + ":" + seconds;
        }
}
