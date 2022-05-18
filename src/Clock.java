public class Clock {
    protected int hour;
    protected int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() { return hour; }

    public void setHour(int hour) { this.hour = hour; }

    public int getMinute() { return minute; }

    public void setMinute(int minute) { this.minute = minute; }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Clock)){
            return false;
        }
        Clock otherClock = (Clock) other;
        return this.hour == otherClock.hour && this.minute == otherClock.minute;
    }

    @Override
    public String toString() {
        String str_hour, str_minute;
        str_hour=Integer.toString(this.hour);
        if (this.hour < 10){ str_hour ="0"+ str_hour;}
        str_minute=Integer.toString(this.minute);
        if (this.minute < 10){ str_minute ="0"+ str_minute;}
        return str_hour+":"+str_minute;
    }

    @Override
    public int hashCode() {
        return 60*this.minute + 3600*this.hour;
    }

}
