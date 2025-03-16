package org.example.lld.strategydesign;

import org.example.lld.strategydesign.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
