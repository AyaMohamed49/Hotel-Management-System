/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import java.sql.ResultSet;
import javax.swing.JOptionPane;


// 1- Get resedint  
// 2 - Change room status
// 3 - Pay method 

/**
 *
 * @author Nour Elden
 */
public class GetResident implements CheckoutInterface{

    public GetResident() {
    }
    
    public void SqlStatement(String ID){
   String Residentquery = "select * from residents where residentID = "+ new Integer(ID) ;
                 try{
                     connect_database conn = connect_database.getInstance();
               ResultSet rs = conn.getS().executeQuery(Residentquery);      
                String ChangeStatusquery = "Update residents Set Status='Check Out' where residentID = "+ new Integer(ID);
                    
                     conn.getS().executeUpdate(ChangeStatusquery);
               
                 }
                 catch(Exception e){
                                         JOptionPane.showMessageDialog(null, "Check Out Failed");

                 }
                    
    }
}
