package com.dao;

import com.entity.Booking;
import com.entity.FuelType;
import com.entity.Vehicle;
import com.entity.VehicleCategory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleDAOImpl implements VehicleDAO {

    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private List<VehicleCategory> vehicleCategories = new ArrayList<>();
    private List<FuelType> fuelTypes = new ArrayList<>();

    public VehicleDAOImpl() {
        // Initialize vehicle categories and fuel types
        // Add some initial data if needed
    }

    @Override
    public List<VehicleCategory> getVehicleCategory() {
        return vehicleCategories;
    }

    @Override
    public List<FuelType> getFuelType() {
        return fuelTypes;
    }

    @Override
    public List<Vehicle> getAvailableVehicles(VehicleCategory category, Date fromDate, Date toDate) {
        // Implement logic to get available vehicles
        return vehicles;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        // Implement logic to add a new vehicle
        vehicles.add(vehicle);
    }

    @Override
    public void bookVehicle(Booking booking) {
        // Implement logic to book a vehicle
        bookings.add(booking);
    }

    @Override
    public double getDailyRent(Vehicle vehicle) {
        // Implement logic to get daily rent for a vehicle
        return vehicle.getDailyRent();
    }

    @Override
    public void generateReport() {
        // Implement logic to generate booking report
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        for (Booking booking : bookings) {
            System.out.println("Customer: " + booking.getCustomerName() +
                    ", Vehicle: " + booking.getVehicleRegistrationNumber() +
                    ", Booked From: " + sdf.format(booking.getBookedFrom()) +
                    ", Booked To: " + sdf.format(booking.getBookedTo()) +
                    ", Total Rent: " + booking.getTotalRent() + " Rs");
        }
    }
}
