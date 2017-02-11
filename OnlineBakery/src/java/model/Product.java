package model;

public class Product {

    private int id;
    private String name;
    private int type;
    private String description;
    private boolean inStock;
    private double price;
    private String imgSrc;

    public Product(int id, String name, int type, String description, boolean inStock, double price, String imgSrc) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.inStock = inStock;
        this.price = price;
        this.imgSrc = imgSrc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public boolean isInStock() {
        return inStock;
    }

    public double getPrice() {
        return price;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

}
