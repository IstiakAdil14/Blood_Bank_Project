
package com.login;

import java.util.Date;

public class userHomeBean {
   private int id;
    private String fullName;
    private String gender;
    private String city;
    private String bloodGroup;
    private String cellNo;
    private String address;
    private Date dateOfBirth;
    private Date lastDonateDate; 

    public userHomeBean(int id, String fullName, String gender, String city, String bloodGroup, String address, String cellNo, Date lastDonateDate, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
         this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.city = city;
        this.bloodGroup = bloodGroup;
        this.cellNo = cellNo;
        this.address = address;
       
        this.lastDonateDate = lastDonateDate;
    }

    userHomeBean(int i, String fullName, Date lastDonateDate, String gender, String city, String bloodGroup, String cellNo, Date dateOfBirth, String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getLastDonateDate() {
        return lastDonateDate;
    }

    public void setLastDonateDate(Date lastDonateDate) {
        this.lastDonateDate = lastDonateDate;
    }
    
    
}
