package eduard.OOP_and_MySQL.OOP.constructor;

public class Author extends Person{
    private String pseudonim;

    public Author(String name, String surname, String pseudonim) {
        super(name, surname);
        this.pseudonim = pseudonim;
    }

    public String getPseudonim() {
        return pseudonim;
    }

    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }

    @Override
    public String toString() {
        return "Author{" +
                "pseudonim='" + pseudonim + '\'' +
                '}';
    }
}
