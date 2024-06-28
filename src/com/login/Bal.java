
package com.login;
import com.databaseCon.DB;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Bal {
    public void insertDataSignup(Bean obj){
        try{
           String query="insert into signup_table values(null,?,?)";
           PreparedStatement ps=DB.con.prepareStatement(query);
        
           ps.setString(1,obj.getEmail());
           ps.setString(2,obj.getPass());
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "You have signup successfully,");
           //setVisible(false);
          Registration a = new Registration();
          a.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    public boolean checkLogin(String email,String pass){
        boolean b = false;
        try{
            String query = "select Email, Password from signup_table where Email = '"+email+"'AND Password = '"+pass+"'";
            Statement st =  DB.con.createStatement();
           ResultSet rs = st.executeQuery(query);
           
           if(rs.next()){
               b=true;
               
           }
           else{
               JOptionPane.showMessageDialog(null,"Invalid email or password,try again...");
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return b;
    }
}
