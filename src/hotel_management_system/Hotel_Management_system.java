/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel_management_system;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.* ; 


public class Hotel_Management_system extends JFrame implements ActionListener{

    Hotel_Management_system(){
        setSize(1000 , 640);
        setLocation(200,30);
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        // Add image 
        ImageIcon imgicon = new ImageIcon(ClassLoader.getSystemResource("images/hotel_login.jpg"));
        JLabel image = new JLabel(imgicon);
        add(image);
        
        
       // Add text 
        JLabel text = new JLabel("Hotel Management System ");
        text.setBounds(40 , 520 , 1000, 50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif" , Font.PLAIN , 50 ));
        image.add(text);
        
        // Add Button
        JButton nextbutton = new JButton("Next");
        nextbutton.setBounds(750 , 550 , 175 , 35);
        nextbutton.addActionListener(this);
        
        nextbutton.setBackground(new java.awt.Color(72,138,199));
        
        nextbutton.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        nextbutton.setForeground(new java.awt.Color(255, 255, 255));
        nextbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        image.add(nextbutton);
         setVisible(true);
         
         while(true)
         {
             text.setVisible(false);
             try {
                 Thread.sleep(500);
             } catch (Exception e) {
                 e.printStackTrace();
             }
             text.setVisible(true); try {
                 Thread.sleep(500);
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        new LoginPage().setVisible(true);
        dispose();
    }
    
  
    public static void main(String[] args) throws SQLException {
     //  new UpdateRoomStatusForm().setVisible(true);
       // new UpdateandDeleteEmployeeForm().setVisible(true);
        //new AddWorker();
      //new AddWorkerForm().setVisible(true);
    //new CheckOutForm().setVisible(true);
      //new UpdateRoomStatus().setVisible(true);
     //   new Rooms();
    // new CustomerInfo();
   // new Reception();
   new Hotel_Management_system().setVisible(true);
    }
    
}
