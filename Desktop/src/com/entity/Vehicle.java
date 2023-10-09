package com.entity;

public class Vehicle {
    private int vehicleId;
    private String registrationNumber;
    private VehicleCategory category;
    private String manufacturer;
    private int dailyRent;
    private int mileage;
    private FuelType fuelType;
    private String description;

    public Vehicle(int vehicleId, String registrationNumber, VehicleCategory category, String manufacturer, int dailyRent, int mileage, FuelType fuelType, String description) {
        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.category = category;
        this.manufacturer = manufacturer;
        this.dailyRent = dailyRent;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.description = description;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleCategory getCategory() {
        return category;
    }

    public void setCategory(VehicleCategory category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(int dailyRent) {
        this.dailyRent = dailyRent;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
