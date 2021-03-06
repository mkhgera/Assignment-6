package com.company.Builder;

import com.company.Builder.House;

public class TestBuilder {
    public void builder(){
        House house = new House.HouseBuilder(3,4,5).buildGarage(true).build();
        System.out.println(house);
    }
}
