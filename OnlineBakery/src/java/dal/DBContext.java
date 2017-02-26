package dal;

import java.util.ArrayList;
import model.CartItem;
import model.Product;
import model.Transaction;
import model.User;
import org.hibernate.Session;
import util.HibernateUtil;

public class DBContext {
    
    Session session = null;

    public DBContext() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public boolean addUser(User user) {
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        return tx.wasCommitted();
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
