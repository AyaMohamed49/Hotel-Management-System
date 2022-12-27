/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ayamo
 */
public class RealBooking implements BookingService{

    connect_database connect; 
    
    public RealBooking() {
        connect =connect_database.getInstance();
    }
    

    @Override
    public void Book(String resident_Id, String name, String gender, String phone, String currentDate, String roomNum, String roomstype, String boardingTypes, String price ) {
        String check = "Check In";
        String query = "INSERT INTO residents values( '" + resident_Id + "', '" + name + "', '" + gender + "', '" + phone + "', '" + currentDate + "','" + roomNum + "', '" + roomstype + "' , '" + boardingTypes + "' , '"+price+"' , '"+check+"')";
            
        String q2 = "UPDATE room SET availabilty = 'Not Available' where RoomNumber = " + new Integer(roomNum);

        try {
            connect.getS().executeUpdate(query);
            connect.getS().executeUpdate(q2);
            JOptionPane.showMessageDialog(null, "New Resident Added Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(RealBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
    
}
