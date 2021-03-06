package com.company.FactoryMethod;

public class Ship implements Transport{
    @Override
    public String deliver(){
        return toString() + new Ship();
    }
}
