package com.entity;

public class FuelType {
    private int fuelTypeId;
    private String fuelName;

    public FuelType(int fuelTypeId, String fuelName) {
        this.fuelTypeId = fuelTypeId;
        this.fuelName = fuelName;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getFuelName() {
        return fuelName;
    }

    public void setFuelName(String fuelName) {
        this.fuelName = fuelName;
    }
}
