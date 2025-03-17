package org.example.lld.adapterDesign;

import org.example.lld.adapterDesign.adaptee.WeighMachineForBabies;
import org.example.lld.adapterDesign.adaptee.WeightMachine;
import org.example.lld.adapterDesign.adapter.WeightMachineAdapter;
import org.example.lld.adapterDesign.adapter.WeightMachineAdapterImpl;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapterImpl(new WeighMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
