package org.example.lld.strategydesign.strategy;

public class SportDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
