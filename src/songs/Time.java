package songs;

public class Time {

    public String changeTime(int time) {
        int hours;
        int minutes;
        int seconds;
        hours = (time / 3600);
        minutes = (time - (hours*3600)) / 60;
        seconds = ((time - (hours*3600)) - (minutes*60));
        System.out.println();
        return hours+":"+minutes+":"+seconds;

    }
}
