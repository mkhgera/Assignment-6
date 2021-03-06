package com.company.AbstractFactory;

public class ModernChair implements Chair {
    private int legs;
    private boolean sit;

    public ModernChair(int legs, boolean sit){
        this.legs = legs;
        this.sit = sit;
    }

    @Override
    public int hasLegs(){
        return this.legs;
    }
    @Override
    public boolean sitOn(){
        return this.sit;
    }
    @Override
    public String toString(){
        return "Legs " + this.hasLegs() + ", Sit on " + this.sitOn();
    }
}
