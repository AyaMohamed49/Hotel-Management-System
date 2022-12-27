/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ayamo
 */

// singleton => connect_database 

// factory => dashboard interface , admin dash , rec dash , factory 

// proxy  => Booking service interface , Real booking , proxy booking 

// facade 
public class ProxyBooking implements BookingService{

    
    connect_database connect;
    private RealBooking realBooking;
    
    public ProxyBooking() {
        
        connect=connect_database.getInstance();
    }

    
    @Override
    public void Book(String resident_Id, String name, String gender, String phone, String currentDate, String roomNum, String roomstype, String boardingTypes, String price) {
        String returnquery = "select * from room where roomNumber = " + new Integer(roomNum);

        try {
            ResultSet res =  connect.getS().executeQuery(returnquery);
            if (res.next()){
                String availabilty = res.getString("availabilty");
                System.out.println("ava1: "+availabilty);
                if(availabilty.equals("Available"))
                {
                    System.out.println("ava: "+availabilty);
                    realBooking=new RealBooking();
                    realBooking.Book(resident_Id, name, gender, phone, currentDate, roomNum, roomstype, boardingTypes, price);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "already Booked");

                }

            }   
        } catch (SQLException ex) {
            
            Logger.getLogger(ProxyBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
