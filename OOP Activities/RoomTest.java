/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_activity;

/**
 *
 * @author admin
 */
public class RoomTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Room[] rooms = {
            new rStandardRoom(101, "Standard", "David", 3),
            new rDeluxeRoom(202, "Deluxe", "John", 2),
            new rSuiteRoom(301, "Suite", "Carla", 2)
        };

        // LOOP THRU ROOM ARRAY
        for (Room room : rooms) {
            room.displayBooking();
        }
    }   
}
