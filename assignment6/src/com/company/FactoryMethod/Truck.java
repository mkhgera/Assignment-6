package com.company.FactoryMethod;

public class Truck implements Transport{
    @Override
    public String deliver(){
        return toString() + new Truck();
    }
}
