package com.company.AbstractFactory;
import com.company.AbstractFactory.Chair;

public class ChairFactory {
    public static Chair getChair(FurnitureFactory factory){
        return factory.createChair();
    }
}
