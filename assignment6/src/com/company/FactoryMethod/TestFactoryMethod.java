package com.company.FactoryMethod;


public class TestFactoryMethod {
    public void FactoryMethod(){
        Logistics car = Factory.getTransport("Truck");
        Logistics ship = Factory.getTransport("Ship");

        System.out.println("Factory Truck Config ::" + car);
        System.out.println("Factory Ship Config ::" + ship);

    }
}
