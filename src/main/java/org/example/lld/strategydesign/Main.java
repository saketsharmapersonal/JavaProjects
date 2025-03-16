package org.example.lld.strategydesign;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new SportsVehicle();
        vehicle.drive();

        Vehicle vehicle1=new PassengerVehicle();
        vehicle1.drive();
    }
}
