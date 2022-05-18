public class AccurateClock extends Clock{
    private int seconds;

    public AccurateClock(int hour, int minute, int seconds) {
        super(hour, minute);
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
