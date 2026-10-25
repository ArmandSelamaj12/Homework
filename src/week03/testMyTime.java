package week03;

import java.util.Scanner;

public class testMyTime {
    public static void main(String[] args){

        int hour;
        int minutes;

        MyTime time = new MyTime();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hour: ");
        hour = scanner.nextInt();
        System.out.print("Enter the minutes: ");
        minutes = scanner.nextInt();
        time.twelveClock(hour, minutes);
        time.twentyFourClock(hour, minutes);

        scanner.close();
    }
}
