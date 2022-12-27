/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

/**
 *
 * @author ayamo
 */
public class PayPalStrategy implements PaymentStrategy{

    private String emailID, password;

    public PayPalStrategy() {
    }

    
   /* public PayPalStrategy(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }*/
    
    
    
    @Override
    public void pay(double price) {
        System.out.println("Paid using paypal: "+price);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
