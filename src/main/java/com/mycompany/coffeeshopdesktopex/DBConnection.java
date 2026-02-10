/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeeshopdesktopex;
//database connetion is succesful
/**
 *
 * @author USER
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {
    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // database name and password
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "16534237");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed: " + e);
            return null;
        }
    }
}
