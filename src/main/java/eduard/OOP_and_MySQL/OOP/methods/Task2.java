package eduard.OOP_and_MySQL.OOP.methods;

public class Task2 {
    public static void main(String[] args) {
        Person octopus = new Person();
        octopus.setName("Otto");
        octopus.setSurname("Octavius");
        octopus.setAge(30);
        octopus.setGender('M');
        System.out.println(octopus);
        System.out.println(octopus.getFullName());
        octopus.increaseAge();
        System.out.println(octopus);
    }
}
