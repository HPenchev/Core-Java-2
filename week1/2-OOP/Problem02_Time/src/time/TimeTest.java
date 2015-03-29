package time;

public class TimeTest {

    public static void main(String[] args) {
        Time time = new Time(28, 3, 2015, 13, 10, 11);
        System.out.println(time);
        System.out.println(Time.now());        
    }
}