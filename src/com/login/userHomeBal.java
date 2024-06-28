
package com.login;

import com.databaseCon.DB;
import com.home.HomeBean;
import java.sql.Date;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class userHomeBal {
    public List<HomeBean>loadData(){
        List<HomeBean> list=new ArrayList<HomeBean>();
        try{
            String query = "select * from userdetails";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet  rs= ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("Id");
                String fullName = rs.getString("FullName");
                Date lastDonateDate = rs.getDate("LastDonateDate");
                String gender = rs.getString("Gender");
                String city = rs.getString("City");
                String bloodGroup = rs.getString("BloodGroup");
                String cellNo = rs.getString("CellNo");
                Date dateOfBirth = rs.getDate("DateOfBirth");
                String address = rs.getString("Address");
           
                
                HomeBean bean = new HomeBean(id,fullName,dateOfBirth, gender, city, bloodGroup, cellNo, lastDonateDate, address );
                list.add(bean);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }

 public void insert(userHomeBean userHomeBean1){
       try{
            String query = "insert into userdetails values(null, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, userHomeBean1.getFullName());
            ps.setObject(6, userHomeBean1.getLastDonateDate());
            ps.setString(2, userHomeBean1.getGender());
            ps.setString(8, userHomeBean1.getCity());
            ps.setString(3, userHomeBean1.getBloodGroup()); 
            ps.setString(4, userHomeBean1.getCellNo());
            ps.setString(5, userHomeBean1.getAddress());
            ps.setObject(7, userHomeBean1.getDateOfBirth());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"A record has been inserted....Now,we are taking you back to login.");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, ""+e);
       }
   }
  
}
