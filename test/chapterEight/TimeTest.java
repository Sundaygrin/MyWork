package chapterEight;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time();

        displayTime1("After time object is created", time1);
        System.out.println();

        time1.setTime(13,27,6);
        displayTime1("After calling setTime", time1);
        System.out.println();

        try {
            time1.setTime(99,99,99);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime1("After calling setTime with invalid values", time1);
    }

    private  static void displayTime1(String header, Time t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }

}