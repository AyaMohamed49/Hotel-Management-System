/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

/**
 *
 * @author ayamo
 */
public class CreditCardStrategy implements PaymentStrategy{

    private String name,cardNumber,cvv, dateExpiry;

    public CreditCardStrategy() {
    }

    
   
    
    
    
    @Override
    public void pay(double price) {
        System.out.println("Paid with credit card: "+ price);
    }
    
}
