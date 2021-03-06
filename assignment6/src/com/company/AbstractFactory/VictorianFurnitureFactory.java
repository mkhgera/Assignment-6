package com.company.AbstractFactory;
import com.company.AbstractFactory.*;

public class VictorianFurnitureFactory implements FurnitureFactory{
    private int legs;
    private boolean sit;

    public VictorianFurnitureFactory(int legs, boolean sit){
        this.legs = legs;
        this.sit = sit;
    }

    @Override
    public Chair createChair(){
        return new VictorianChair(legs, sit);
    }

}
