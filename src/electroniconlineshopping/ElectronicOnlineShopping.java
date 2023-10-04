/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electroniconlineshopping;

/**
 *
 * @author marke
 */
public class ElectronicOnlineShopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ElectronicOnlineShoppin shopping = new ElectronicOnlineShoppin();
         
          
          // Adding bought products
        shopping.addBoughtProduct("Laptop", 0233434551, 300.00, 350.00);
        shopping.addBoughtProduct("Tablet", 0233434562, 250.00, 370.00);
        shopping.addBoughtProduct("Iphone 15pro Max", 0233434573, 1300.00, 1700.00);
        shopping.addBoughtProduct("Diamond Watch", 0233434564, 2000.00, 2750.00);
        shopping.addBoughtProduct("HeadPhone", 0233434575, 200.00, 310.00);
        shopping.addSoldProduct("Nova Body Cream", 0233434566, 75.00, 80.00);
        shopping.addSoldProduct("Lush Hair", 0233434576, 100.00, 110.00);
        
        // Adding sold products
        shopping.addSoldProduct("Laptop", 0233434551, 300.00, 450.00);
        shopping.addSoldProduct("Tablet", 0233434562, 250.00, 400.00);
        shopping.addSoldProduct("Iphone 15pro Max", 0233434573, 1300.00, 2100.00);
        shopping.addSoldProduct("Diamond Watch", 0233434564, 2000.00, 3750.00);
        shopping.addSoldProduct("HeadPhone", 0233434575, 200.00, 410.00);
        shopping.addSoldProduct("Nova Body Cream", 0233434566, 75.00, 100.00);
        shopping.addSoldProduct("Lush Hair", 0233434576, 100.00, 120.00);
        
        
        // Display information
        shopping.displayProductsBoughtInfo();
        System.out.println();
        shopping.displayProductsSoldInfo();
        System.out.println();
        shopping.checkBenefit();
        
    }
    
}
