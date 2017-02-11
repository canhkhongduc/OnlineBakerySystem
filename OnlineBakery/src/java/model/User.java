/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class User {

    private int id;
    private String username;
    private String fullName;
    private boolean isMale;
    private String address;
    private String phone;
    private String email;
    private Date dob;
    private boolean isAdmin;

    public User(int id, String username, String fullName, boolean isMale, String address, String phone, String email, Date dob, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.isMale = isMale;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isMale() {
        return isMale;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public Date getDob() {
        return dob;
    }

}
