package eduard.OOP_and_MYSQL.OOP.advancedOOP;


public class Task1 {
    public static void main(String[] args) {
        Product cola = new Product("Coca-Cola", 7.89);
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(cola, 8);
        System.out.println(shoppingCart);
        shoppingCart.addProduct(cola, 12);
        System.out.println(shoppingCart);
    }
}
