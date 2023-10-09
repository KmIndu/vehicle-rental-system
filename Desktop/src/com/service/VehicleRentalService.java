package com.service;

import com.dao.VehicleDAO;
import com.entity.Booking;
import com.entity.Vehicle;
import com.exception.VehicleRentalException;
import com.util.DateUtil;

import java.util.Date;
import java.util.List;

public class VehicleRentalService {
    private VehicleDAO vehicleDAO;

    public VehicleRentalService(VehicleDAO vehicleDAO) {
        this.vehicleDAO = vehicleDAO;
    }

    public void addNewVehicle(String registrationNumber, String category, String manufacturer,
                              double dailyRent, double mileage, String fuelType, String description) {
        Vehicle vehicle = new Vehicle(registrationNumber, category, manufacturer, dailyRent, mileage, fuelType, description);
        vehicleDAO.addVehicle(vehicle);
    }

    public void bookVehicle(String customerName, String category, Date bookedFrom, Date bookedTo) throws VehicleRentalException {
        List<Vehicle> availableVehicles = vehicleDAO.getAvailableVehicles(category, bookedFrom, bookedTo);

        if (availableVehicles.isEmpty()) {
            throw new VehicleRentalException("No available vehicles for the specified category and dates.");
        }

        Vehicle selectedVehicle = availableVehicles.get(0);

        long days = DateUtil.daysBetween(bookedFrom, bookedTo);
        double totalRent = days * selectedVehicle.getDailyRent();

        Booking booking = new Booking(customerName, category, selectedVehicle.getRegistrationNumber(), bookedFrom, bookedTo, totalRent);
        vehicleDAO.bookVehicle(booking);
    }

    public List<Booking> generateVehicleBookingReport() {
        return vehicleDAO.getBookings();
    }

    public List<Vehicle> getAvailableVehicles() {
        return vehicleDAO.getAvailableVehicles();
    }
}
