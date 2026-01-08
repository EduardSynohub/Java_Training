package eduard.OOP_and_MySQL.OOP.inheritance;

public class TestShape {
    public static void main(String[] args) {
        Shape square = new Shape(1, 1, "red");
        double distance = square.getDistance(new Shape(14, 4, "green"));
        System.out.println(square.getDescription());
        System.out.println(distance);

        Circle circle = new Circle(3, 4, "blue", 2.4);
        System.out.println(circle.getDescription());

        Circle circle1 = new Circle(3, 4, "black", 2.5);
        Circle circle2 = new Circle(4, 7, "yellow", 3.0);
        System.out.println(circle1.getDistance(circle2));
    }
}
