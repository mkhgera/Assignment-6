package com.company.Builder;

public class House {
    //required parameter
    private int rooms;
    private int doors;
    private int windows;

    //optional parameter
    private boolean hasRoof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    public int getRooms(){
        return this.rooms;
    }

    public int getDoors(){
        return this.doors;
    }

    public int getWindows(){
        return this.windows;
    }

    public boolean isHasRoof(){
        return this.hasRoof;
    }

    public boolean isHasGarage(){
        return this.hasGarage;
    }

    public boolean isHasSwimmingPool(){
        return this.hasSwimmingPool;
    }

    public House(HouseBuilder builder) {
        this.rooms = builder.room;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.hasGarage = builder.hasGarage;
        this.hasRoof = builder.hasRoof;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString(){
        return "House: " + this.rooms + ", " + this.doors + ", " + this.windows + ", " + this.hasRoof + ", " + this.hasGarage + ", " + this.hasSwimmingPool;
    }

    public static class HouseBuilder implements Builder{

        private int room;
        private int doors;
        private int windows;

        private boolean hasRoof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public HouseBuilder(int room, int doors, int windows){
            this.room = room;
            this.doors = doors;
            this.windows = windows;
        }

        @Override
        public Builder houseBuilder(int room, int doors, int windows){
            this.room = room;
            this.doors = doors;
            this.windows = windows;
            return this;
        }

        @Override
        public Builder buildRoof(boolean hasRoof){
            this.hasRoof = hasRoof;
            return this;
        }

        @Override
        public Builder buildGarage(boolean hasGarage){
            this.hasGarage = hasGarage;
            return this;
        }

        @Override
        public Builder buildSwimmingPool(boolean hasSwimmingPool){
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        @Override
        public House build(){
            return new House(this);
        }
    }
}
