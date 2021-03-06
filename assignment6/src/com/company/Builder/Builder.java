package com.company.Builder;

public interface Builder {
    Builder houseBuilder(int room, int door, int window);
    Builder buildRoof(boolean hasRoof);
    Builder buildGarage(boolean hasGarage);
    Builder buildSwimmingPool(boolean hasSwimmingPool);
    House build();
}
