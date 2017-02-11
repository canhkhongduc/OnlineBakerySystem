package model;

import java.util.ArrayList;

public class Transaction {

    private int id;
    private int uid;
    private double cost;
    private String address;
    private ArrayList<CartItem> items;
    private int status;

    public Transaction(int id, int uid, double cost, String address, ArrayList<CartItem> items, int status) {
        this.id = id;
        this.uid = uid;
        this.cost = cost;
        this.address = address;
        this.items = items;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CartItem> items) {
        this.items = items;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
