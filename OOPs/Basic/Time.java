package OOPs.Basic;

/**
 * Time
 */
public class Time {

    int hours, minutes, seconds = -1;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void display() {
        if (seconds != -1)
            System.out.println(hours + ":" + minutes + ":" + seconds);
        else
            System.out.println(hours + ":" + minutes);
    }

    public static void main(String[] args) {
        Time t = new Time(18, 13, 58);
        Time t2 = new Time(18, 13);
        t.display();
        t2.display();
    }
}