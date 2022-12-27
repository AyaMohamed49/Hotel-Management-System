/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import javax.swing.JOptionPane;

/**
 *
 * @author Nour Elden
 */
public class ChangeroomStatus implements CheckoutInterface{
    
   public ChangeroomStatus(){}
   public void SqlStatement(String roomID){
       
       
       String q2 = "UPDATE room SET availabilty = 'Available' , status = 'Not Cleaned' where roomNumber = " + new Integer(roomID);
       connect_database conn = connect_database.getInstance();
       try{
            conn.getS().executeUpdate(q2);
       }
       catch(Exception e){
                                                    JOptionPane.showMessageDialog(null, "Check Out Failed");

       }
                   
                
   }
}
