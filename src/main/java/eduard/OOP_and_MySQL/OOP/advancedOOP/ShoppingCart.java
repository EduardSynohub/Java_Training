package eduard.OOP_and_MySQL.OOP.advancedOOP;

import java.util.Arrays;

public class ShoppingCart {
    private CartItem[] cartItems;

    public ShoppingCart() {
        cartItems = new CartItem[0];
    }

    public void addProduct(Product product, int quantity) {
        checkQuantity(quantity);

        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].getProduct().equals(product)) {
                int q = cartItems[i].getQuantity();
                cartItems[i].setQuantity(q + quantity);
                return;
            }
        }

        cartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
        cartItems[cartItems.length - 1] = new CartItem(product, quantity);
    }

    public void removeProduct(Product product) {
        CartItem[] toRemoveItem = new CartItem[0];

        for (CartItem cartItem : cartItems) {
            if (!cartItem.getProduct().equals(product)) {
                toRemoveItem = Arrays.copyOf(toRemoveItem, toRemoveItem.length + 1);
                toRemoveItem[toRemoveItem.length - 1] = cartItem;
            }
        }

        cartItems = toRemoveItem;
    }

    public void updateProduct(Product product, int quantity) {
        checkQuantity(quantity);

            for (int i = 0; i < cartItems.length; i++) {
                if (cartItems[i].getProduct().getId() == product.getId()) {
                    cartItems[i] = new CartItem(product, quantity);
                }
            }

            if (quantity == 0) {
                removeProduct(product);
            }
    }

    public int getTotalQuantity() {
        int totalQuantity = 0;

        for (CartItem cartItem : cartItems) {
            totalQuantity += cartItem.getQuantity();
        }

        return totalQuantity;
    }

    public double getTotalSum() {
        double sum = 0.0;

        for (CartItem cartItem : cartItems) {
            sum += (cartItem.getProduct().getPrice() * cartItem.getQuantity());
        }

        return sum;
    }

    public void printReceipt() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i  = 0; i < cartItems.length; i++) {
            double sum = cartItems[i].getQuantity() * cartItems[i].getProduct().getPrice();

            stringBuilder
                    .append(i + 1)
                    .append(": ")
                    .append(cartItems[i].getProduct().getName())
                    .append(" ")
                    .append(cartItems[i].getProduct().getId())
                    .append(", ")
                    .append(cartItems[i].getQuantity())
                    .append("x")
                    .append(cartItems[i].getProduct().getPrice())
                    .append(" = ")
                    .append(sum)
                    .append("\n");
        }

        System.out.print(stringBuilder);
        System.out.println("---------------------------------------");
        System.out.println("Razem: " + getTotalSum());
    }

    protected void checkQuantity(int quantity) {
        if (quantity < 0) {
            throw new RuntimeException("Quantity must be greater than 0");
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartItems=" + Arrays.toString(cartItems) +
                '}';
    }
}
