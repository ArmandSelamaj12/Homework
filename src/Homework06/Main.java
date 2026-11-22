package Homework06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Navigator navigator = null;

        System.out.print("Select type (1) Car, (2) Bus, (3) Walking: ");
        int type = scanner.nextInt();

        if(type == 1){
            navigator = new Car();
        }
        else if(type == 2){
            navigator = new Bus();
        }
        else if(type == 3){
            navigator = new Walking();
        }
        else{
            System.out.println("Invalid Choice");
        }

        System.out.print("Enter the Departure: ");
        String departure = scanner.next();

        System.out.print("Enter the Destination: ");
        String destination = scanner.next();

        navigator.route(departure, destination);
    }
}
