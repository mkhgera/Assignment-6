package com.company.FactoryMethod;

public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Truck();
    }
}
