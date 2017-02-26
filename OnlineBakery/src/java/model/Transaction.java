package model;
// Generated Feb 26, 2017 7:54:18 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Transaction generated by hbm2java
 */
public class Transaction  implements java.io.Serializable {


     private int transactionId;
     private Status status;
     private User user;
     private double totalCost;
     private Serializable address;
     private Date date;
     private Set<CartItem> cartItems = new HashSet<CartItem>(0);

    public Transaction() {
    }

	
    public Transaction(int transactionId, Status status, User user, double totalCost, Serializable address, Date date) {
        this.transactionId = transactionId;
        this.status = status;
        this.user = user;
        this.totalCost = totalCost;
        this.address = address;
        this.date = date;
    }
    public Transaction(int transactionId, Status status, User user, double totalCost, Serializable address, Date date, Set<CartItem> cartItems) {
       this.transactionId = transactionId;
       this.status = status;
       this.user = user;
       this.totalCost = totalCost;
       this.address = address;
       this.date = date;
       this.cartItems = cartItems;
    }
   
    public int getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public double getTotalCost() {
        return this.totalCost;
    }
    
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public Serializable getAddress() {
        return this.address;
    }
    
    public void setAddress(Serializable address) {
        this.address = address;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Set<CartItem> getCartItems() {
        return this.cartItems;
    }
    
    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }




}


