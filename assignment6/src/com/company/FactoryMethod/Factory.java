package com.company.FactoryMethod;
import com.company.FactoryMethod.Transport;

public class Factory {
    public static Logistics getTransport(String type){
        if ("Truck".equalsIgnoreCase(type))
            return new RoadLogistics();
        else if("Ship".equalsIgnoreCase(type))
            return new SeaLogistics();
        return null;
    }
}
