package model;

public class CartItem {

    private int transId;
    private int productId;
    private int quantity;

    public CartItem(int transId, int productId, int quantity) {
        this.transId = transId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getTransId() {
        return transId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

}
