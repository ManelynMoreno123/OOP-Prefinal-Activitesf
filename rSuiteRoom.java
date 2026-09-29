/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_activity;

/**
 *
 * @author admin
 */
public class rSuiteRoom extends Room{
    public rSuiteRoom(int roomNumber, String roomType,
                     String guestName, int numberOfNights) {

        super(roomNumber, roomType, guestName, numberOfNights);
    }

    // Override the parent method
    @Override
    public double calculateBookingCost() {

        double dailyRate = 4000;
        double serviceFee = 1000;

        return (dailyRate * numberOfNights) + serviceFee;
    }
}
