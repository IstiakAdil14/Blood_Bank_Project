
package com.databaseCon;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class DB {
    public static Connection con = null;
    public static void loadConnection(){
        String url= "jdbc:mysql://localhost:3306/bbms";
        String root="root";
        String adil="";
        
        try{
            con =DriverManager.getConnection(url,root,adil);
            
            if(con != null){
              JOptionPane.showMessageDialog(null, "database has been successfully connected,,,,,");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"error in database loading " +e);
        }
    }

    public static PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
