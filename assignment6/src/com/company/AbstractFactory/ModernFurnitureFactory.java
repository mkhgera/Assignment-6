package com.company.AbstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory{
    private int legs;
    private boolean sit;

    public ModernFurnitureFactory(int legs, boolean sit){
        this.legs = legs;
        this.sit = sit;
    }

    @Override
    public Chair createChair(){
        return new ModernChair(legs, sit);
    }

}
