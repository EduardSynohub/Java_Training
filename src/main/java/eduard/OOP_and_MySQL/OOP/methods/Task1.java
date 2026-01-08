package eduard.OOP_and_MySQL.OOP.methods;

public class Task1 {
    public static void main(String[] args) {
        Product banan = new Product();
        System.out.println(banan.getName());
        banan.setName("Banan");
        System.out.println(banan.getName());
        System.out.println(banan);
    }
}
