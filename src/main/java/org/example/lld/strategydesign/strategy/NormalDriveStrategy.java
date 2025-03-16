package org.example.lld.strategydesign.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
