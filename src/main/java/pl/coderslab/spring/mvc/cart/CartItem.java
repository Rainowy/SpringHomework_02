package pl.coderslab.spring.mvc.cart;

public class CartItem {

    private Product product;

    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return
                product +
                        ", quantity=" + quantity;
    }
}
