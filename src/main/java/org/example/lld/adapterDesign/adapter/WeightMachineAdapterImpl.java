package org.example.lld.adapterDesign.adapter;

import org.example.lld.adapterDesign.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine=weightMachine;
    }
    @Override
    public double getWeightInKg() {
        double weighInPound=weightMachine.getWeightInPound();
        double weightInKg=weighInPound * 0.45;
        return weightInKg;
    }
}
