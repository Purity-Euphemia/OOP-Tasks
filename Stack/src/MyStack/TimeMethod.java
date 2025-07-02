package MyStack;

public class TimeMethod {

    private int hour;
    private int minute;
    private int second;

    public TimeMethod() {
        this(0);
    }
    public TimeMethod(int hour) {
        this(hour, 0);
    }
    public TimeMethod(int hour, int minute) {
        this(hour, minute, 0);
    }

    public TimeMethod(int hour, int minute, int second) {
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private static void validate(int hour, int minute, int second) {
       validateHour(hour);
       validateMinute(minute);
       validateSecond(second);
    }

    private static void validateHour(int hour) {
      boolean hourIsOutOfRange = hour < 0 || hour > 23;
      if (hourIsOutOfRange) throw new IllegalArgumentException("Hour out of range");
    }

    private static void validateMinute(int minute) {
        boolean minuteIsOutOfRange = minute < 0 || 59 < minute;
        if (minuteIsOutOfRange) throw new IllegalArgumentException("Minute out of range");
    }

    private static  void validateSecond(int second){
        boolean secondIsOutOfRange = second < 0 || second > 59;
        if(secondIsOutOfRange) throw new IllegalArgumentException("Second out of range");
    }
}
