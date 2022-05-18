public class Clock {
    protected int hour;
    protected int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Clock)){
            return false;
        }
        Clock otherClock = (Clock) other;
        return this.hour == otherClock.hour && this.minute == otherClock.minute;
    }
    public int getHour() { return hour; }

    public void setHour(int hour) { this.hour = hour; }

    public int getMinute() { return minute; }

    public void setMinute(int minute) { this.minute = minute; }

}
