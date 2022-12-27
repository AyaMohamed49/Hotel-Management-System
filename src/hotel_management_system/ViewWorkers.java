/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Ahmed osama
 */
public class ViewWorkers extends JFrame implements ActionListener{
    JTable table;
    JButton back , edit;
    public ViewWorkers() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel LabelWorkerId = new JLabel("Worker Id");
        LabelWorkerId.setBounds(40, 10, 100, 20);
        add(LabelWorkerId);
        JLabel Labelname = new JLabel("Name");
        Labelname.setBounds(170, 10, 100, 20);
        add(Labelname);
        JLabel Labelage = new JLabel("Age");
        Labelage.setBounds(290, 10, 100, 20);
        add(Labelage);
        JLabel LabelGender = new JLabel("Gender");
        LabelGender.setBounds(400, 10, 100, 20);
        add(LabelGender);
        JLabel LabelJob = new JLabel("Job");
        LabelJob.setBounds(540, 10, 100, 20);
        add(LabelJob);
        JLabel LabelSalary = new JLabel("Salary");
        LabelSalary.setBounds(670, 10, 100, 20);
        add(LabelSalary);
        JLabel LabelPhone = new JLabel("Phone");
        LabelPhone.setBounds(790, 10, 100, 20);
        add(LabelPhone);

        JLabel LabelPassword = new JLabel("Password");
        LabelPassword.setBounds(910, 10, 100, 20);
        add(LabelPassword);

        table = new JTable();
        table.setBounds(0, 40, 1000, 400);
        add(table);
        try {
            connect_database DB =connect_database.getInstance();
            ResultSet rs = DB.getS().executeQuery("select * from workers");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        back= new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(350, 500, 120, 30);
        add(back);
        setBounds(300, 200, 1000, 600);
        setVisible(true);
        
        edit= new JButton("Edit");
        edit.setBackground(Color.BLACK);
        edit.setForeground(Color.WHITE);
        edit.addActionListener(this);
        edit.setBounds(500, 500, 120, 30);
        add(edit);
        setBounds(300, 200, 1000, 600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        //new Reception();
    }

}
