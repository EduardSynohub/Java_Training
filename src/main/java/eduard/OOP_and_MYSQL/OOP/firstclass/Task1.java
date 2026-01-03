package eduard.OOP_and_MYSQL.OOP.firstclass;


public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        if (cat.equals(dog)) {
            System.out.println("cat == dog");
        } else if (dog.equals(dog1)) {
            System.out.println(dog == dog1);
        } else {
            System.out.println("cat != dog");
        }
    }
}
