/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electroniconlineshopping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marke
 */
public class ElectronicOnlineShoppin {
    
             
    private List<Products> boughtProducts = new ArrayList<>();
    private List<Products> soldProducts = new ArrayList<>();

    public void addBoughtProduct(String productName, int serialNumber, double buyingPrice, double sellingPrice) {
        Products product = new Products(productName, serialNumber, buyingPrice, sellingPrice);
        boughtProducts.add(product);
    }
    
     public void addSoldProduct(String productName, int serialNumber, double buyingPrice, double sellingPrice) {
        Products product = new Products(productName, serialNumber, buyingPrice, sellingPrice);
        soldProducts.add(product);
    }

     
     public void displayProductsBoughtInfo() {
        System.out.println("Products Bought Information:");
        for (Products product : boughtProducts) {
            System.out.println(product);
        }
        double totalSpent = boughtProducts.stream().mapToDouble(Products::getBuyingPrice).sum();
        System.out.println("Total Amount Spent: $" + totalSpent);
    }
     
     
        public void displayProductsSoldInfo() {
        System.out.println("Products Sold Information:");
        for (Products product : soldProducts) {
            System.out.println(product);
        }
        double totalEarned = soldProducts.stream().mapToDouble(Products::getSellingPrice).sum();
        System.out.println("Total Amount Earned: $" + totalEarned);
    }

    public void checkBenefit() {
        double totalSpent = boughtProducts.stream().mapToDouble(Products::getBuyingPrice).sum();
        double totalEarned = soldProducts.stream().mapToDouble(Products::getSellingPrice).sum();

        if (totalEarned > totalSpent) {
            System.out.println("You have gained a profit of $" + (totalEarned - totalSpent));
        } else if (totalEarned < totalSpent) {
            System.out.println("You have incurred a loss of $" + (totalSpent - totalEarned));
        } else {
            System.out.println("You have broken even.");
        }
    }
  }

