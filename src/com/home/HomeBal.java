
package com.home;
import com.databaseCon.DB;
import java.sql.*;
import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HomeBal {
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
    public void insert(HomeBean homeBean){
        try{
            String query = "insert into userdetails values(null, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement p = DB.con.prepareStatement(query);
            p.setString(1, homeBean.getFullName());
            p.setObject(2, homeBean.getLastDonateDate());
            p.setString(3, homeBean.getGender());
            p.setString(4, homeBean.getCity());
            p.setString(5, homeBean.getBloodGroup()); 
            p.setString(6, homeBean.getCellNo());
            p.setString(7, homeBean.getAddress());
            p.setObject(8, homeBean.getDateOfBirth());
        
            p.executeUpdate();
          
            JOptionPane.showMessageDialog(null,"A record has been inserted....Now,we are taking you back to login.");
            
            } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Its not working...try block is not working.");
        }
       
    }
    
    public HomeBean returnAllDataToTextFields(int id){
        HomeBean bean = null;
        try{
            String query = "select * from userdetails where Id = "+id;
            PreparedStatement ps =DB.con.prepareStatement(query);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                //int id = rs.getInt(query);
                int ids = rs.getInt("Id");
                String fullName = rs.getString("FullName");
                String city = rs.getString("City");
                String cellNo = rs.getString("CellNo");
                String gender = rs.getString("Gender");
                String address = rs.getString("Address");
                String bloodGroup = rs.getString("BloodGroup");
                
                Date dateOfBirth = rs.getDate("DateOfBirth");
                Date lastDonateDate = rs.getDate("LastDonateDate");
                
                bean = new HomeBean(ids, fullName, dateOfBirth, gender, city, bloodGroup, cellNo, lastDonateDate, address);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
   
    public void updateDate(HomeBean bean){
        try{
            String query = "update userdetails set FullName=?, City=?, CellNo=?, Gender=?, Address=?,BloodGroup=?,DateOfBirth=?,LastDonateDate=? where Id =?";
            PreparedStatement ps =DB.con.prepareStatement(query);
            ps.setString(1, bean.getFullName());
            ps.setString(2, bean.getCity());
            ps.setString(3, bean.getCellNo());
            ps.setString(4, bean.getGender());
            ps.setString(5, bean.getAddress());
            ps.setString(6, bean.getBloodGroup());
            
            ps.setObject(7, bean.getDateOfBirth());
            ps.setObject(8, bean.getLastDonateDate());
            ps.setInt(9, bean.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been updated...");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    
    }
    
    public void deleteRecord(int id){
        try{
            String query = "delete from alldonor  where Id =?";
            PreparedStatement ps =DB.con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been deleted...");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
}
