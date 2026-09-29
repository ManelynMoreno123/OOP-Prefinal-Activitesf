/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_activity;

/**
 *
 * @author admin
 */
public class Employee {
     private String employeeId;
    private String name;
    private String department;
    private int daysWorked;
    private double dailyRate;

    // Constructor
    public Employee(String employeeId, String name, String department,
                    int daysWorked, double dailyRate) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    // Calculate Regular Pay
    public double calculateRegularPay() {

        if (daysWorked <= 22) {
            return daysWorked * dailyRate;
        } else {
            return 22 * dailyRate;
        }
    }

    // Calculate Overtime Pay
    public double calculateOvertimePay() {

        if (daysWorked > 22) {

            int overtimeDays = daysWorked - 22;
            double overtimeRate = dailyRate * 1.25;

            return overtimeDays * overtimeRate;

        } else {
            return 0;
        }
    }

    // Calculate Gross Pay
    public double calculateGrossPay() {

        return calculateRegularPay() + calculateOvertimePay();
    }

    // Calculate Deduction
    public double calculateDeduction() {

        double grossPay = calculateGrossPay();

        if (grossPay <= 15000) {
            return grossPay * 0.05;
        } else {
            return grossPay * 0.08;
        }
    }

    // Calculate Net Pay
    public double calculateNetPay() {

        return calculateGrossPay() - calculateDeduction();
    }

    // Get Attendance Classification
    public String getAttendanceClassification() {

        if (daysWorked < 15) {
            return "Poor Attendance";

        } else if (daysWorked >= 15 && daysWorked <= 21) {
            return "Incomplete Attendance";

        } else if (daysWorked == 22) {
            return "Complete Attendance";

        } else {
            return "Overtime Worker";
        }
    }

    // Display Payroll
    public void displayPayroll() {

        System.out.println("===========EMPLOYEE PAYROLL===========");
        System.out.println();
        System.out.println("Employee ID     :  " + employeeId);
        System.out.println("Name            :  " + name);
        System.out.println("Department      :  " + department);
        System.out.println("Days Worked     :  " + daysWorked);
        System.out.println("Daily Rate      :  " + dailyRate);
        System.out.println("Regular Pay     :  " + calculateRegularPay());
        System.out.println("Overtime Pay    :  " + calculateOvertimePay());
        System.out.println("Gross Pay       :  " + calculateGrossPay());
        System.out.println("Deduction       :  " + calculateDeduction());
        System.out.println("Net Pay         :  " + calculateNetPay());
        System.out.println("Classification  :  " + getAttendanceClassification());
    }
}
