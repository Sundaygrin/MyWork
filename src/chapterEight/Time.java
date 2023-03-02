package chapterEight;

public class Time {
    private  int hour;
    private  int minute;
    private  int second;

    public Time(int hour,int minute,int second) {
        boolean hourIsInvalid = hour < 0 || hour > 13;
        if (hourIsInvalid) throw new IllegalArgumentException("Hours is invalid");
        boolean minuteIsInvalid = minute < 0 || minute > 59;
        if (minuteIsInvalid) throw new IllegalArgumentException("Minutes is invalid");
        boolean secondIsInvalid = second < 0 || second > 59;
        if (secondIsInvalid) throw new IllegalArgumentException("Seconds is invalid");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {

    }

    public String toUniversalString(){
        return String.format("%d:%2d:%02d ", hour,minute,second);
    }

    public String toString(){
        return  String.format("%d:%2d:%02d %s", ((hour == 0 || hour == 12)? 12 : hour % 12) , minute,second,(hour < 12 ? "Am" : "PM"));
    }

    public void setTime(int i, int i1, int i2) {

    }
}
