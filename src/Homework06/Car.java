package Homework06;

public class Car extends Navigator{

    @Override
    public void route(String departure, String destination){
        System.out.println("Route from " + departure + " to " + destination + " by car: -------");
    }
}
