package dal;

import java.sql.Connection;
import java.util.ArrayList;
import model.CartItem;
import model.Product;
import model.Transaction;
import model.User;

public class DBContext {

    public Connection getConnection() {
        // Note: connection info should not be hardcoded here
        // Use a config instead
        throw new UnsupportedOperationException();
    }
    
    public boolean addUser(User user) {
        throw new UnsupportedOperationException();
    }
    
    public boolean updateUser() {
        throw new UnsupportedOperationException();
    }
    
    public boolean updatePassword(int uid, String newPass) {
        throw new UnsupportedOperationException();
    }
    
    public boolean updatePassword(String username, String newPass) {
        throw new UnsupportedOperationException();
    }
    
    public User getUser(int uid) {
        throw new UnsupportedOperationException();
    }
    
    public User getUser(String username) {
        throw new UnsupportedOperationException();
    }
    
    public ArrayList<Transaction> getTransactions() {
        throw new UnsupportedOperationException();
    }
    
    public ArrayList<Transaction> getTransactions(int uid) {
        throw new UnsupportedOperationException();
    }
    
    public ArrayList<Transaction> getTransactions(String username) {
        throw new UnsupportedOperationException();
    }
    
    public Transaction getTransaction(int id) {
        throw new UnsupportedOperationException();
    }
    
    public boolean updateTransaction(Transaction transaction, ArrayList<CartItem> items) {
        throw new UnsupportedOperationException();
    }
    
    public ArrayList<Product> getProducts() {
        throw new UnsupportedOperationException();
    }
    
    public ArrayList<Product> getProductsByPriceRange(double low, double high) {
        throw new UnsupportedOperationException();
    }   
    
}
