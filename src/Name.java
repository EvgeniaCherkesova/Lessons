
public class Name {
    public final String name;
    public String lastName;
    public String surname;

    public Name(String name) {
        this(name,null, null);
    }

    public Name(String name, String lastName) {
        this(name,lastName,null);
    }

    public Name(String name, String lastName, String surname) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
    }

    @Override
    public String toString() {
        String str = "";
        if (name != null) {
            str += name;
        }
        if (lastName != null) {
            str += " " + lastName;
        }
        if (surname != null) {
            str += " " + surname;
        }

        return str;
    }

}
