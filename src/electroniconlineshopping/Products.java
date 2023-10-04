/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electroniconlineshopping;



import java.util.ArrayList;
import java.util.List;

public class Products {
    
//Variables  
    private String productName;
    private int serialNumber;
    private double buyingPrice;
    private double sellingPrice;

// Using Parameterized Constructor
    
    public Products(String productName, int serialNumber, double buyingPrice, double sellingPrice) {
        this.productName = productName;
        this.serialNumber = serialNumber;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
    
    
     public double getBuyingPrice() {
        return buyingPrice;
    }

     
    public double getSellingPrice() {
        return sellingPrice;
    }
    
    
      @Override
    public String toString() {
        return "Product Name: " + productName +
                ", Serial Number: " + serialNumber +
                ", Buying Price: $" + buyingPrice +
                ", Selling Price: $" + sellingPrice;
    }


}