package eduard.OOP_and_MYSQL.OOP.attributes;

public class Task2 {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicAttribute = "It is public access.";
        System.out.println(accessModifier.publicAttribute);
        accessModifier.protectedAttribute = "It is protected access.";
        System.out.println(accessModifier.protectedAttribute);
    }
}
