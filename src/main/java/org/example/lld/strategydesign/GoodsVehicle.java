package org.example.lld.strategydesign;

import org.example.lld.strategydesign.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
