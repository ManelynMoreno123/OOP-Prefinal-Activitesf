/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_activity;

/**
 *
 * @author admin
 */
public class ElectricityBillTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ElectricityBillManagementSystem elec1 = new ElectricityBillManagementSystem("202550510", "John", "Residential", 1250, 1475);
        elec1.displayBill();
        ElectricityBillManagementSystem elec2 = new ElectricityBillManagementSystem("678891002", "David", "Residential", 2000, 2140);
        elec2.displayBill();
        ElectricityBillManagementSystem elec3 = new ElectricityBillManagementSystem("202513783", "Mark", "Commercial", 3500, 3850);
        elec3.displayBill();
    }
    
}
