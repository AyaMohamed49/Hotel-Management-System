/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel_management_system;

/**
 *
 * @author ayamo
 */
public interface BookingService {
    
   public void Book(String resident_Id, String name, String gender, String phone, String currentDate, String roomNum, String roomstype, String boardingTypes, String price ) ;
    
}
