/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_activity;

/**
 *
 * @author admin
 */
public class rDeluxeRoom extends Room {
    public rDeluxeRoom(int roomNumber, String roomType,
                      String guestName, int numberOfNights) {

        super(roomNumber, roomType, guestName, numberOfNights);
    }

    // Override the parent method
    @Override
    public double calculateBookingCost() {

        double dailyRate = 2500;
        double breakfastFee = 300;

        return (dailyRate + breakfastFee) * numberOfNights;
    }
}
