public class Human {
    private Name name;
    private int height;
    private final Human father;

    public Human(String name, int height) {
        this(new Name(name), height, null);
    }

    public Human(String name, int height, Human father) {
        this(new Name(name), height, father);
    }

    public Human(Name name, int height) {
        this(name, height, null);
    }

    public Human(Name name, int height, Human father) {
        if(height > 500 || height <= 0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.height = height;
        this.father = father;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Human getFather() {
        return father;
    }

    public Name getName() {
        return name;
    }

    public String toString() {
        if (name.surname == null && father != null && father.name != null && father.name.surname != null) {
            name.surname = father.name.surname;
        }
        if (name.lastName == null && father != null && father.name != null && father.name.name != null) {
            name.lastName = String.format("%sович", father.name.name);
        }
        return String.format("%s, %d", name, height);
    }
}
