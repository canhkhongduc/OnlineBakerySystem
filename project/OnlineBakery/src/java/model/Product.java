package model;
// Generated Feb 26, 2017 7:54:18 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private int productId;
     private Serializable productName;
     private Serializable description;
     private int stock;
     private double price;
     private String url;
     private Set<CartItem> cartItems = new HashSet<CartItem>(0);
     private Set<Review> reviews = new HashSet<Review>(0);

    public Product() {
    }

	
    public Product(int productId, Serializable productName, Serializable description, int stock, double price, String url) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.url = url;
    }
    public Product(int productId, Serializable productName, Serializable description, int stock, double price, String url, Set<CartItem> cartItems, Set<Review> reviews) {
       this.productId = productId;
       this.productName = productName;
       this.description = description;
       this.stock = stock;
       this.price = price;
       this.url = url;
       this.cartItems = cartItems;
       this.reviews = reviews;
    }
   
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public Serializable getProductName() {
        return this.productName;
    }
    
    public void setProductName(Serializable productName) {
        this.productName = productName;
    }
    public Serializable getDescription() {
        return this.description;
    }
    
    public void setDescription(Serializable description) {
        this.description = description;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public Set<CartItem> getCartItems() {
        return this.cartItems;
    }
    
    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
    public Set<Review> getReviews() {
        return this.reviews;
    }
    
    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }




}

