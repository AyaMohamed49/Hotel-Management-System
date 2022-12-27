/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

/**
 *
 * @author Nour Elden
 */
public class FactoryDashboard {
    
   public Dashboard GetDashBoard(String Type){
        
       if(Type.equalsIgnoreCase("admin")){
          new AdminDashboardForm().setVisible(true);
          
       }
       else  {
         new ReceptionForm().setVisible(true);
        
       }
       return null;
        
    }
}
