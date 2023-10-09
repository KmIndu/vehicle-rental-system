package com.dao;

import com.entity.Booking;
import com.entity.FuelType;
import com.entity.Vehicle;
import com.entity.VehicleCategory;

import java.util.Date;
import java.util.List;

public interface VehicleDAO {
    List<VehicleCategory> getVehicleCategory();
    List<FuelType> getFuelType();
    List<Vehicle> getAvailableVehicles(VehicleCategory category, Date fromDate, Date toDate);
    void addVehicle(Vehicle vehicle);
    void bookVehicle(Booking booking);
    double getDailyRent(Vehicle vehicle);
    void generateReport();
}
