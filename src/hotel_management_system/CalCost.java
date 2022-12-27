/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ayamo
 */
public class CalCost {
    
    ArrayList<CalculatePrice> calculatePrice ;

    public CalCost() {
        this.calculatePrice=new ArrayList<CalculatePrice>();
    }

   public void addBoarding(CalculatePrice board)
   {
       this.calculatePrice.add(board);
   }
     public void addRoom(CalculatePrice room)
   {
       this.calculatePrice.add(room);
   }
    
     public double calcTotalPrice() 
     {
         double sum=0;
         for(CalculatePrice c:calculatePrice)
         {
             sum+=c.getPrice();
         }
         return sum;
     }
     
     public void payTotal(PaymentStrategy p)
     {
         double amount=calcTotalPrice();
         p.pay(amount);
         
     }
}
