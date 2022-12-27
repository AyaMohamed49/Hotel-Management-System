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
public class FacadeCheckout {
private pay pay; 
private ChangeroomStatus changeroom;
private GetResident resident;
//private CalCost cc ;
    public FacadeCheckout(CalCost c ) {     
        pay = new pay(c);
        changeroom = new ChangeroomStatus();
        resident = new GetResident();
    }
    public void CheckOutUsingFacade( String ID , String roomID , String checkstatus){
        resident.SqlStatement(ID);
        changeroom.SqlStatement(roomID);
        pay.SqlStatement(checkstatus);
          JOptionPane.showMessageDialog(null, "Check Out Successfully");
    }
    
    
}
