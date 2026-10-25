package week03;

public class MyTime {
    int hour;
    int minutes;
    String defaultTime = "00:00";

    public void twelveClock(int hour, int minutes){

        if(hour < 0 || hour > 23 || minutes < 0 || minutes > 59) {
            System.out.println(defaultTime);
            return;
        }

        int twelveHour = hour % 12;

        System.out.printf("%02d:%02d%n", twelveHour, minutes);

    }

    public void twentyFourClock(int hour, int minutes){

        if(hour < 0 || hour > 23 || minutes < 0 || minutes > 59) {
            System.out.println(defaultTime);
        }
        else if(hour < 12) {
            hour += 12;
            System.out.printf("%02d:%02d%n", hour, minutes);
        }
        else{
            System.out.printf("%02d:%02d%n", hour, minutes);
        }
    }
}
