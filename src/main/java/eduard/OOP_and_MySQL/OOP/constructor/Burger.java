package eduard.OOP_and_MySQL.OOP.constructor;

public class Burger {
    private String size;
    private double price;

    public Burger(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public Burger() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
