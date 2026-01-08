package eduard.OOP_and_MySQL.OOP.inheritance;

public class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return "The center of this shape is (" + x + ", " + y + ") and the color is " + color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDistance(Shape shape) {
        return Math.sqrt((Math.pow((shape.x - x), 2) + Math.pow((shape.y - y), 2)));
    }
}
