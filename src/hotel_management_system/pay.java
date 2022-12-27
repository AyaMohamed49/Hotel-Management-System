/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

/**
 *
 * @author Nour Elden
 */
public class pay implements CheckoutInterface{
private CalCost c ;
double finalcost ;
    public pay(CalCost cc) {
       c = cc;
       
       
    }
    
    public void SqlStatement(String paymentmethod){
        if(paymentmethod.equals("cash")){
             c.payTotal(new CashStrategy());
          
        }
        else if (paymentmethod.equals("payPal")){
          c.payTotal(new PayPalStrategy());
        }
        else {
            c.payTotal(new CreditCardStrategy());
        }
        
    }
}
