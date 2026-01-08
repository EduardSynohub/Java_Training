package eduard.OOP_and_MySQL.OOP.advancedOOP;

public class Product {
    private static int PRODUCT_ID = 1;
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = PRODUCT_ID++;
        this.name = name;
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        } else {
            throw new RuntimeException("Price must be greater than 0!");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
