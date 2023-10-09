package com.entity;

import java.util.Date;

public class Booking {
    private String customerName;
    private VehicleCategory vehicleCategory;
    private String vehicleRegistrationNumber;
    private Date bookedFrom;
    private Date bookedTo;
    private int totalRent;
    private boolean paymentReceived;

    public Booking(String customerName, VehicleCategory vehicleCategory, String vehicleRegistrationNumber, 
                   Date bookedFrom, Date bookedTo, int totalRent, boolean paymentReceived) {
        this.customerName = customerName;
        this.vehicleCategory = vehicleCategory;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        this.bookedFrom = bookedFrom;
        this.bookedTo = bookedTo;
        this.totalRent = totalRent;
        this.paymentReceived = paymentReceived;
    }

    public String getCustomerName() {
        return customerName;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public Date getBookedFrom() {
        return bookedFrom;
    }

    public Date getBookedTo() {
        return bookedTo;
    }

    public int getTotalRent() {
        return totalRent;
    }

    public boolean isPaymentReceived() {
        return paymentReceived;
    }
}
