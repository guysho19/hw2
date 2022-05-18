public class AccurateClock extends Clock{
    private int seconds;

    public AccurateClock(int hour, int minute, int seconds) {
        super(hour, minute);
        this.seconds = seconds;
    }
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AccurateClock)){
            return false;
        }
        AccurateClock otherClock = (AccurateClock) other;
        return this.hour == otherClock.hour && this.minute == otherClock.minute && otherClock.seconds==this.seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
