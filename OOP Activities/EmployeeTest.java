/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_activity;

/**
 *
 * @author admin
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee employee = new Employee("EMP-330", "Josh", "IT", 25,700);
       
       employee.displayPayroll();
    }  
}
