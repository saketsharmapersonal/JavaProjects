package org.example.lld.strategydesign;

import org.example.lld.strategydesign.strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
