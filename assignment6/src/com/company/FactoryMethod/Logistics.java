package com.company.FactoryMethod;

abstract public class Logistics {
    abstract Transport createTransport();
    public String toString(){
        return "Deliver by " + createTransport();
    }
}
