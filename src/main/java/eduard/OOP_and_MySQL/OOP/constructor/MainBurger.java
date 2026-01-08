package eduard.OOP_and_MySQL.OOP.constructor;

public class MainBurger {
    public static void main(String[] args) {
        Burger cheeseburger = new Burger();
        System.out.println(cheeseburger);

        Burger royal = new Burger("medium", 25.0);
        System.out.println(royal);
    }
}
