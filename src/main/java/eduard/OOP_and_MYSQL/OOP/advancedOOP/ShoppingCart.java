package eduard.OOP_and_MYSQL.OOP.advancedOOP;

import java.util.Arrays;

public class ShoppingCart {
    private CartItem[] cartItems;

    public ShoppingCart() {
        cartItems = new CartItem[0];
    }

    public void addProduct(Product product, int quantity) {
        if (cartItems.length == 0) {
            cartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
            cartItems[cartItems.length - 1] = new CartItem(product, quantity);
        } else {
            for (int i = 0; i < cartItems.length; i++) {
                if (!cartItems[i].getProduct().equals(product)) {
                    cartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
                    cartItems[cartItems.length - 1] = new CartItem(product, quantity);
                } else {
                    int q = cartItems[i].getQuantity();
                    cartItems[i].setQuantity(q + quantity);
                }
            }
        }
    }

    public void removeProduct(Product product) {

    }

    public void updateProduct(Product product, int quantity) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().equals(product)) {
                int q = cartItem.getQuantity();
                cartItem.setQuantity(q + quantity);
            } else {
                addProduct(product, quantity);
            }
        }
    }

    public int getTotalQuantity() {
        return 0;
    }

    public double getTotalSum() {
        return 0.0;
    }

    public void printReceipt() {

    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartItems=" + Arrays.toString(cartItems) +
                '}';
    }
}
