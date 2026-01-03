package eduard.OOP_and_MYSQL.OOP.constructor;

public class Task2 {
    public static void main(String[] args) {
        Person spiderman = new Person("Peter", "Parker", 21, 'M');
        System.out.println(spiderman);

        Person octopus = new Person("Otto", "Octavius");
        System.out.println(octopus);

        Person captainAmerica = new Person("Steve", 90);
        System.out.println(captainAmerica);
    }
}
