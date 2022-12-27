/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_management_system;

import java.awt.Choice;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ayamo
 */
public class ReceptionistsForm extends javax.swing.JFrame {

    connect_database connect = connect_database.getInstance();
    Choice c1 = new Choice();
    String[] nameRoom;
    String type;
    //jTable1 table;
    String currentDate=String.valueOf(java.time.LocalDate.now());
    
    public ReceptionistsForm() {
        initComponents();
        
        dateTF.setText(currentDate);
        try {
            jTable1.setModel(DbUtils.resultSetToTableModel(connect.getS().executeQuery("select * from residents")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        roomTypeCB.addItem("Single");
        roomTypeCB.addItem("Double");
        roomTypeCB.addItem("Triple");
        
        boardingTypeCB.addItem("Full Board");
        boardingTypeCB.addItem("Half Board");
        boardingTypeCB.addItem("Bed And Breakfast");
        
        dateTF.setText(currentDate);

        genderCB.addItem("Male");
        genderCB.addItem("Female");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        residentIDTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        roomNumCB = new javax.swing.JComboBox<>();
        genderCB = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        roomTypeCB = new javax.swing.JComboBox<>();
        boardingTypeCB = new javax.swing.JComboBox<>();
        editResidentbtn = new javax.swing.JButton();
        deleteResidentbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        addResidentbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 30));
        setMinimumSize(new java.awt.Dimension(1000, 640));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,120));

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Resident ID:");

        residentIDTF.setBackground(new java.awt.Color(248, 248, 255));
        residentIDTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        residentIDTF.setForeground(new java.awt.Color(72, 138, 199));

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");

        usernameTF.setBackground(new java.awt.Color(248, 248, 255));
        usernameTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameTF.setForeground(new java.awt.Color(72, 138, 199));

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone:");

        phoneTF.setBackground(new java.awt.Color(248, 248, 255));
        phoneTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneTF.setForeground(new java.awt.Color(72, 138, 199));

        jLabel6.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender:");

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date:");

        dateTF.setBackground(new java.awt.Color(248, 248, 255));
        dateTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateTF.setForeground(new java.awt.Color(72, 138, 199));

        jLabel10.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Room Number:");

        roomNumCB.setBackground(new java.awt.Color(248, 248, 255));
        roomNumCB.setForeground(new java.awt.Color(72, 138, 199));

        genderCB.setBackground(new java.awt.Color(248, 248, 255));
        genderCB.setForeground(new java.awt.Color(72, 138, 199));

        jLabel11.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Room Type:");

        jLabel12.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Boarding Type:");

        roomTypeCB.setBackground(new java.awt.Color(248, 248, 255));
        roomTypeCB.setForeground(new java.awt.Color(72, 138, 199));
        roomTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeCBActionPerformed(evt);
            }
        });

        boardingTypeCB.setBackground(new java.awt.Color(248, 248, 255));
        boardingTypeCB.setForeground(new java.awt.Color(72, 138, 199));

        editResidentbtn.setBackground(new java.awt.Color(72, 138, 199));
        editResidentbtn.setFont(new java.awt.Font("Andalus", 1, 21)); // NOI18N
        editResidentbtn.setForeground(new java.awt.Color(255, 255, 255));
        editResidentbtn.setText("Edit Resident");
        editResidentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editResidentbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editResidentbtnMouseClicked(evt);
            }
        });

        deleteResidentbtn.setBackground(new java.awt.Color(72, 138, 199));
        deleteResidentbtn.setFont(new java.awt.Font("Andalus", 1, 21)); // NOI18N
        deleteResidentbtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteResidentbtn.setText("Delete Resident");
        deleteResidentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteResidentbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteResidentbtnMouseClicked(evt);
            }
        });

        cancelbtn.setBackground(new java.awt.Color(72, 138, 199));
        cancelbtn.setFont(new java.awt.Font("Andalus", 1, 21)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setText("Cancel");
        cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtnMouseClicked(evt);
            }
        });

        addResidentbtn.setBackground(new java.awt.Color(72, 138, 199));
        addResidentbtn.setFont(new java.awt.Font("Andalus", 1, 21)); // NOI18N
        addResidentbtn.setForeground(new java.awt.Color(255, 255, 255));
        addResidentbtn.setText("Add Resident");
        addResidentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addResidentbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addResidentbtnMouseClicked(evt);
            }
        });
        addResidentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResidentbtnActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(248, 248, 255));
        jTable1.setForeground(new java.awt.Color(72, 138, 199));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "residentID", "Name", "Phone", "Date", "Gender", "roomNumber", "roomType", "boardingType", "totalCost", "Status"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(248, 248, 255));
        jTable1.setSelectionBackground(new java.awt.Color(248, 248, 255));
        jTable1.setSelectionForeground(new java.awt.Color(72, 138, 199));
        jTable1.setShowHorizontalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addResidentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(editResidentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(deleteResidentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boardingTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(roomNumCB, 0, 241, Short.MAX_VALUE)
                                        .addComponent(roomTypeCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(genderCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(phoneTF, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomNumCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boardingTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addResidentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editResidentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteResidentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 850, 590));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_customer.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editResidentbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editResidentbtnMouseClicked

       DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            table.setValueAt(residentIDTF.getText(), jTable1.getSelectedRow(), 0);
            table.setValueAt(usernameTF.getText(), jTable1.getSelectedRow(), 1);
            table.setValueAt(genderCB.getSelectedItem(), jTable1.getSelectedRow(), 2);
            table.setValueAt(phoneTF.getText(), jTable1.getSelectedRow(), 3);
            table.setValueAt(dateTF.getText(), jTable1.getSelectedRow(), 4);
            table.setValueAt(roomNumCB.getSelectedItem(), jTable1.getSelectedRow(), 5);
            table.setValueAt(roomTypeCB.getSelectedItem(), jTable1.getSelectedRow(), 6);
            table.setValueAt(boardingTypeCB.getSelectedItem(), jTable1.getSelectedRow(), 7);
            try {

                connect.getS().executeUpdate("Update residents set Name = '" + usernameTF.getText() + "' ,  Gender = '" + genderCB.getSelectedItem()+ "' ,Phone = '" + phoneTF.getText() + "' , Date = '" + dateTF.getText() + "' , RoomNumber = '" + roomNumCB.getSelectedItem() + "', typeRoom = '" + roomTypeCB.getSelectedItem() + "', Boardingtype = '" + boardingTypeCB.getSelectedItem() + "' where residentID = '" + residentIDTF.getText() + "' ");
                //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                JOptionPane.showMessageDialog(this, "Update Successfully...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table Empty...");

            } else {
                JOptionPane.showMessageDialog(this, "Please Select Single Row...");

            }
        }
    }//GEN-LAST:event_editResidentbtnMouseClicked

    private void deleteResidentbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteResidentbtnMouseClicked
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        String resident_Id = residentIDTF.getText();
        if (jTable1.getSelectedRowCount() == 1) {
            table.removeRow(jTable1.getSelectedRow());
            try {
                
                connect.getS().executeUpdate("DELETE FROM residents WHERE residentID = '" + resident_Id + "' ");
                //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table Empty...");

            } else {
                JOptionPane.showMessageDialog(this, "Please Select Single Row...");

            }
        }
    }//GEN-LAST:event_deleteResidentbtnMouseClicked

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
        
        new ReceptionForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelbtnMouseClicked

    private void addResidentbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addResidentbtnMouseClicked
        try {
            String resident_Id = residentIDTF.getText();
            String name = usernameTF.getText();
            String gender = genderCB.getSelectedItem().toString();
            String phone = phoneTF.getText();
            String d=dateTF.getText();
            String roomNum = String.valueOf(roomNumCB.getSelectedItem());
            String boardingTypes = String.valueOf(boardingTypeCB.getSelectedItem());
            String roomstype = String.valueOf(roomTypeCB.getSelectedItem());

            
            String price="";
            String returnquery = "select * from room where roomNumber = " + new Integer(roomNum);

            ResultSet res =  connect.getS().executeQuery(returnquery);
            if (res.next()){
                price = res.getString("price");

            }          
            double Totalprice = Double.parseDouble(price);

           ProxyBooking proxyBooking=new ProxyBooking();
           proxyBooking.Book(resident_Id, name, gender, phone, d, roomNum, roomstype, boardingTypes, price);
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invlid Data or ID Already exist");
        }

    }//GEN-LAST:event_addResidentbtnMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        String resident_ID = table.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String name = table.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String gender = table.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String phone = table.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String Date = table.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String roomNum = table.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String roomsType = table.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String boardingTypes = table.getValueAt(jTable1.getSelectedRow(), 7).toString();
        String totalCost = table.getValueAt(jTable1.getSelectedRow(), 8).toString();
        String status = table.getValueAt(jTable1.getSelectedRow(), 9).toString();
        residentIDTF.setText(resident_ID);
        usernameTF.setText(name);
        phoneTF.setText(phone);
    }//GEN-LAST:event_jTable1MouseClicked

    private void roomTypeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeCBActionPerformed
        type=roomTypeCB.getSelectedItem()+"";
        try {
            
            roomNumCB.removeAllItems();
                ResultSet rs = connect.getS().executeQuery("select * from room where roomtype = '"+type+"'");
                while (rs.next()) {
                    roomNumCB.addItem(rs.getString("roomNumber"));
                    
            }
           
        } catch (Exception e) {
        }
    }//GEN-LAST:event_roomTypeCBActionPerformed

    private void addResidentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResidentbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addResidentbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReceptionistsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addResidentbtn;
    private javax.swing.JComboBox<String> boardingTypeCB;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTextField dateTF;
    private javax.swing.JButton deleteResidentbtn;
    private javax.swing.JButton editResidentbtn;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField residentIDTF;
    private javax.swing.JComboBox<String> roomNumCB;
    private javax.swing.JComboBox<String> roomTypeCB;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
