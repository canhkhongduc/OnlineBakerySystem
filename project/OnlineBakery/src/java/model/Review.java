package model;
// Generated Feb 26, 2017 7:54:18 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * Review generated by hbm2java
 */
public class Review  implements java.io.Serializable {


     private int reviewId;
     private Product product;
     private User user;
     private int rate;
     private Serializable comment;

    public Review() {
    }

    public Review(int reviewId, Product product, User user, int rate, Serializable comment) {
       this.reviewId = reviewId;
       this.product = product;
       this.user = user;
       this.rate = rate;
       this.comment = comment;
    }
   
    public int getReviewId() {
        return this.reviewId;
    }
    
    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public int getRate() {
        return this.rate;
    }
    
    public void setRate(int rate) {
        this.rate = rate;
    }
    public Serializable getComment() {
        return this.comment;
    }
    
    public void setComment(Serializable comment) {
        this.comment = comment;
    }




}


