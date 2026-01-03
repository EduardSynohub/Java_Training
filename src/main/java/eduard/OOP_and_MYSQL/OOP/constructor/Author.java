package eduard.OOP_and_MYSQL.OOP.constructor;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String pseudonim;

    public Author(int id, String firstName, String lastName, String pseudonim) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonim = pseudonim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pseudonim='" + pseudonim + '\'' +
                '}';
    }
}
