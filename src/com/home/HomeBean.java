
package com.home;

import java.util.Date;


public class HomeBean {
    private int id;
    private String fullName;
    private String gender;
    private String city;
    private String bloodGroup;
    private String cellNo;
    private String address;
    private Date dateOfBirth;
    private Date lastDonateDate;

    public HomeBean(int id, String fullName, Date dateOfBirth, String gender, String city, String bloodGroup, String cellNo, Date lastDonateDate, String address) {
        this.id=id;
        this.fullName = fullName;
        this.gender = gender;
        this.city = city;
        this.bloodGroup = bloodGroup;
        this.cellNo = cellNo;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.lastDonateDate = lastDonateDate;
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
