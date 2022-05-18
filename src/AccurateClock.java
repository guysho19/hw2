import java.util.Objects;

public class AccurateClock extends Clock{
    private int seconds;

    public AccurateClock(int hour, int minute, int seconds) {
        super(hour, minute);
        if (seconds>=0 && seconds<=59) {
        this.seconds = seconds;
        }else{
            this.seconds=0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
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

    @Override
    public String toString() {
        String str_hour, str_minute ,str_seconds;
        str_hour=Integer.toString(this.hour);
        if (this.hour < 10){ str_hour ="0"+ str_hour;}
        str_minute=Integer.toString(this.minute);
        if (this.minute < 10){ str_minute ="0"+ str_minute;}
        str_seconds=Integer.toString(this.seconds);
        if (this.seconds < 10){ str_seconds ="0"+ str_seconds;}
        return str_hour+":"+str_minute+":"+str_seconds;
    }

    @Override
    public int hashCode() {
        return 24*3600+this.seconds + 60*this.minute + 3600*this.hour;
    }
}
