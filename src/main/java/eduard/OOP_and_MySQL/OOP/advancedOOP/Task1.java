package eduard.OOP_and_MySQL.OOP.advancedOOP;


public class Task1 {
    public static void main(String[] args) {
        Product cola = new Product("Coca-Cola", 7.89);
        Product bread = new Product("Bread", 2.5);
        Product cheese = new Product("Cheese", 5.4);
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(cola, 8);
        System.out.println(shoppingCart);
        System.out.println("<----------------------------------->\n");

        shoppingCart.addProduct(cola, 12);
        System.out.println(shoppingCart);
        System.out.println("<----------------------------------->\n");

        shoppingCart.addProduct(bread, 2);
        System.out.println(shoppingCart);
        System.out.println("<----------------------------------->\n");

        shoppingCart.updateProduct(bread, 4);
        System.out.println(shoppingCart);
        System.out.println("<----------------------------------->\n");

        System.out.println(shoppingCart.getTotalQuantity());
        System.out.println(shoppingCart.getTotalSum());
        System.out.println("<----------------------------------->\n");

        shoppingCart.addProduct(cheese, 3);
        System.out.println(shoppingCart);
        System.out.println("<----------------------------------->\n");

        shoppingCart.addProduct(cheese, 10);
        shoppingCart.addProduct(cola, 20);

        System.out.println(shoppingCart);
        System.out.println("Test");

        shoppingCart.printReceipt();
        shoppingCart.updateProduct(cola, 2);
        shoppingCart.updateProduct(bread, 0);

        System.out.println("<----------------------------------->\n");
        System.out.println(shoppingCart);
        System.out.println("<----------------------------------->\n");

        System.out.println(shoppingCart.getTotalQuantity());
        System.out.println(shoppingCart.getTotalSum());
        System.out.println("<----------------------------------->\n");

        shoppingCart.printReceipt();
    }
}
