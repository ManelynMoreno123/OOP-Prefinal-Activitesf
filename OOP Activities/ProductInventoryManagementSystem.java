/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_activity;

/**
 *
 * @author admin
 */
public class ProductInventoryManagementSystem {
    private String ProductID;
    private String ProductName;
    private String Category;
    private double Price;
    private int Quantity;

    public ProductInventoryManagementSystem(String ProductID, String ProductName, String Category, double Price, int Quantity) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.Category = Category;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    

    
    public double calculateInventoryValue() {
    return Price * Quantity;
    }
    
    public String getStockStatus(){
        
        if (Quantity == 0){
            return "Out of Stock";
        }
        else if (Quantity <= 10 && Quantity >= 1) {
            return "Low Stock";
        }
        else if (Quantity <= 50 && Quantity >=11) {
            return "Normal Stock";
        }
        else {
            return "High Stock";
        }    
    } 
    
    public void displayProductInfo(){
        System.out.println("==========PRODUCT INFORMATION==========");
        System.out.println("");
        System.out.println("Product ID          :   " + ProductID);
        System.out.println("Product Name        :   " + ProductName);
        System.out.println("Product Category    :   " + Category);
        System.out.println("Product Price       :   " + Price);
        System.out.println("Product Quantity    :   " + Quantity);
        System.out.println("Inventory Value     :   " + calculateInventoryValue());
        System.out.println("Status              :   " + getStockStatus());
    }
}
