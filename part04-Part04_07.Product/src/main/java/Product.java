/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jlanderos
 */
public class Product {
    private double price = 0;
    private int quantity = 0;
    private String name = "";
    
    public Product(String initialName, double initialPrice, int initialQuanity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuanity;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
}
