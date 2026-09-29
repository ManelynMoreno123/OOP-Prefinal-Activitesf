/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_activity;

/**d
 *
 * @author admin
 */
public class ElectricityBillManagementSystem {
    private String accountNum;
    private String customerName, customerType;
    private double prevReading, curReading;

        public ElectricityBillManagementSystem(String accountNum, String customerName, String customerType, double prevReading, double curReading) {
            this.accountNum = accountNum;
            this.customerName = customerName;
            this.customerType = customerType;
            this.prevReading = prevReading;
            this.curReading = curReading;
        }

        public String getAccountNum() {
            return accountNum;
        }

        public void setAccountNum(String accountNum) {
            this.accountNum = accountNum;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerType() {
            return customerType;
        }

        public void setCustomerType(String customerType) {
            this.customerType = customerType;
        }

        public double getPrevReading() {
            return prevReading;
        }

        public void setPrevReading(double prevReading) {
            this.prevReading = prevReading;
        }

        public double getCurReading() {
            return curReading;
        }

        public void setCurReading(double curReading) {
            this.curReading = curReading;
        }
    
        public double calculateConsumption(){
        return curReading - prevReading;
        }
        
        public double getRate() {
            double consumption = calculateConsumption();

        if (customerType.equalsIgnoreCase("Residential")) {

            if (consumption <= 100) {
                return 10.00;
            } else if (consumption <= 200) {
                return 12.00;
            } else {
                return 15.00;
            }

        } else if (customerType.equalsIgnoreCase("Commercial")) {

            if (consumption <= 100) {
                return 15.00;
            } else if (consumption <= 200) {
                return 18.00;
            } else {
                return 22.00;
            }
        }

        return 0.00;
    }
      
        
        public double calculateBill() {
            return calculateConsumption() * getRate();
        }
        
        public String getClassification() {
            
            if (calculateConsumption() > 300){
                return "VERY HIGH ELECTRICITY CONSUMPTION";
            }
            else if (calculateConsumption() < 100){
                return "Low Consumption";
            }
            else if (calculateConsumption() <= 200 && calculateConsumption() >=100){
                return "Moderate Consumption";
            }
            else {
                return "High Consumption"; 
            }
        }
        
        public void displayBill() {
            
            System.out.println("\n================ELECTRICITY BILL===============");
            System.out.println("");
            System.out.println("Account Number   : " + accountNum);
            System.out.println("Customer Name    : " + customerName);
            System.out.println("Customer Type    : " + customerType);
            System.out.println("Previous Reading : " + prevReading);
            System.out.println("Current Reading  : " + curReading);
            System.out.println("Consumption      : " + calculateConsumption());
            System.out.println("Rate             : " + getRate());
            System.out.println("Total Bill       : " + calculateBill());
            System.out.println("Classification   : " + getClassification());
            
        }
}


