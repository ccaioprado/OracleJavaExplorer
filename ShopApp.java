/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Dinopc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double tax = 0.2;
        double total;
        
       Clothing item1 = new Clothing();
       Clothing item2 = new Clothing();
       
       item1.description = "Blue Jacket";
       item1.price = 20.9;
       item1.size = "M";
       
       item2.description = "Orange T-shirt";
       item2.price = 10.5;
       item2.size = "S";
       
       total = item1.price*2 + item2.price + tax;
       
       System.out.println(total); 
    }
    
}
