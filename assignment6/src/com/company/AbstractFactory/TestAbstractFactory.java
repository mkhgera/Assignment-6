package com.company.AbstractFactory;

public class TestAbstractFactory {
    public void AbstractFactory(){
        Chair VictorianChair = ChairFactory.getChair(new VictorianFurnitureFactory(4, true));
        Chair ModernChair = ChairFactory.getChair(new ModernFurnitureFactory(1, true));
        System.out.println(VictorianChair);
        System.out.println(ModernChair);
    }
}